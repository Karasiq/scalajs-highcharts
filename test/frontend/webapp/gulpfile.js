var gulp = require('gulp'),
    bower = require('gulp-bower'),
    usemin = require('gulp-usemin'),
    jade = require('gulp-jade'),
    livereload = require('gulp-livereload'),
    csso = require('gulp-csso'),
    imagemin = require('gulp-imagemin'),
    uglify = require('gulp-uglify'),
    connect = require('gulp-connect');


var uglifyEnabled = false;

var scalaJsType = uglifyEnabled ? 'opt' : 'fastopt';

var outputDir = './out';

gulp.task('copy', ['bower'], function() {
    gulp.src(['../target/scala-2.11/scalajs-highcharts-test-frontend-' + scalaJsType + '.js', '../target/scala-2.11/scalajs-highcharts-test-frontend-launcher.js', '../target/scala-2.11/scalajs-highcharts-test-frontend-' + scalaJsType + '.js.map'])
        .pipe(gulp.dest(outputDir + '/js/'));

    gulp.src('./assets/bower/angular-utils-pagination/dirPagination.tpl.html')
        .pipe(gulp.dest(outputDir + '/directives/pagination/'));

    return gulp.src(['./assets/bower/bootstrap/fonts/*'])
        .pipe(gulp.dest(outputDir + '/fonts/'))
});

gulp.task('images', function() {
    return gulp.src('./assets/img/**/*')
        //.pipe(imagemin())
        .pipe(gulp.dest(outputDir + '/img/'));
});

gulp.task('stuff', ['images', 'copy']);

gulp.task('compile', ['bower', 'stuff'], function() {
    return gulp.src(['./assets/template/*.jade', '!./assets/template/_*.jade'])
        .pipe(jade({
            pretty: true
        }))
        .pipe(usemin({
            assetsDir: 'assets',
            css: [csso(), 'concat'],
            js: uglifyEnabled ? [uglify(), 'concat'] : ['concat']
        }))
        .pipe(gulp.dest(outputDir));
});

gulp.task('bower', function() {
    return bower()
        .pipe(gulp.dest('./assets/bower/'))
});

gulp.task('http-server', function() {
    connect.server({
        host: "0.0.0.0",
        port: 9000,
        root: outputDir,
        livereload: true
    });

    gulp.watch([outputDir + '/**'], function() {
        gulp.src(outputDir + '/**')
            .pipe(connect.reload());
    });

    console.log('Server listening on http://localhost:9000');
});

gulp.task('watch', ['compile'], function() {
    gulp.watch('../target/scala-2.11/scalajs-highcharts-test-frontend-' + scalaJsType + '.js', ['copy']);

    gulp.watch('bower.json', ['bower']);

    gulp.watch('assets/img/**/*', ['images']);

    gulp.watch(['assets/js/**/*', 'assets/template/**/*', 'assets/css/**/*'], ['compile']);
});

gulp.task('server', ['watch', 'http-server']);
gulp.task('default', ['compile']);