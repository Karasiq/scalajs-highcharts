import sbt.Keys._

// Tasks
lazy val generate = taskKey[Unit]("Generates Scala.js sources")

// Settings
lazy val commonSettings = Seq(
  organization := "com.github.karasiq",
  version := "1.2.2-SNAPSHOT",
  isSnapshot := version.value.endsWith("SNAPSHOT"),
  scalaVersion := "2.11.8",
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
  },
  publishArtifact in Test := false,
  pomIncludeRepository := { _ ⇒ false },
  licenses := Seq("The MIT License" → url("http://opensource.org/licenses/MIT")),
  homepage := Some(url("https://github.com/Karasiq/scalajs-highcharts")),
  pomExtra :=
    <developers>
      <developer>
        <id>karasiq</id>
        <name>Piston Karasiq</name>
        <url>https://github.com/Karasiq</url>
      </developer>
    </developers>
)

lazy val generatorSettings = Seq(
  name := "scalajs-highcharts-generator",
  libraryDependencies ++= Seq(
    "org.scalaj" %% "scalaj-http" % "0.3.16",
    "com.lihaoyi" %% "upickle" % "0.3.6",
    "org.apache.commons" % "commons-lang3" % "3.4"
  ),
  mainClass in Compile := Some("com.karasiq.highcharts.generator.Main"),
  fullRunTask(generate, Compile, "com.karasiq.highcharts.generator.Main"),
  // fork in generate := true,
  javaOptions in generate ++= Seq(
    "-Dhighcharts-generator.output=src/main/scala",
    "-Dhighcharts-generator.package=com.highcharts"
  )
)

lazy val librarySettings = Seq(
  scalaVersion := "2.12.1",
  crossScalaVersions := Seq("2.11.8", scalaVersion.value),
  libraryDependencies ++= Seq(
    "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
  ),
  name := "scalajs-highcharts",
  scalacOptions += {
    val local = file("").toURI
    val remote = s"https://raw.githubusercontent.com/Karasiq/scalajs-highcharts/${git.gitHeadCommit.value.get}/"
    s"-P:scalajs:mapSourceURI:$local->$remote"
  }
)

lazy val libraryTestSettings = Seq(
  name := "scalajs-highcharts-test",
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= {
    val sprayV = "1.3.3"
    val akkaV = "2.4.0"
    Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaV,
      "io.spray" %% "spray-can" % sprayV,
      "io.spray" %% "spray-routing-shapeless2" % sprayV,
      "io.spray" %% "spray-json" % "1.3.2"
    )
  },
  mainClass in Compile := Some("com.karasiq.highcharts.test.backend.HighchartsTestApp"),
  scalaJsBundlerInline in Compile := true,
  scalaJsBundlerCompile in Compile <<= (scalaJsBundlerCompile in Compile).dependsOn(fullOptJS in Compile in `scalajs-highcharts-test-frontend`),
  scalaJsBundlerAssets in Compile += {
    import com.karasiq.scalajsbundler.dsl._

    Bundle("index",
      // Static
      Html from TestPageAssets.index,
      Style from TestPageAssets.style,

      // jQuery
      Script from url("https://code.jquery.com/jquery-1.12.0.js"),

      // Bootstrap
      Style from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/css/bootstrap.css"),
      Script from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/js/bootstrap.js"),
      Static("fonts/glyphicons-halflings-regular.eot") from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.eot"),
      Static("fonts/glyphicons-halflings-regular.svg") from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.svg"),
      Static("fonts/glyphicons-halflings-regular.ttf") from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.ttf"),
      Static("fonts/glyphicons-halflings-regular.woff") from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.woff"),
      Static("fonts/glyphicons-halflings-regular.woff2") from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.woff2"),

      // Highcharts
      Script from url("https://code.highcharts.com/stock/6.2.0/highstock.src.js"),
      Script from url("https://code.highcharts.com/stock/6.2.0/highcharts-3d.src.js"),

      // Scala.js app
      Script from file("test") / "frontend" / "target" / "scala-2.12" / "scalajs-highcharts-test-frontend-opt.js",
      Script from file("test") / "frontend" / "target" / "scala-2.12" / "scalajs-highcharts-test-frontend-launcher.js"
    )
  }
)

lazy val libraryTestFrontendSettings = Seq(
  scalaVersion := "2.12.1",
  persistLauncher in Compile := true,
  name := "scalajs-highcharts-test-frontend",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "scalatags" % "0.6.2"
  )
)

// Projects
lazy val generator = project
  .settings(commonSettings, generatorSettings)

lazy val `scalajs-library` = (project in file("."))
  .settings(commonSettings, librarySettings)
  .enablePlugins(ScalaJSPlugin)

lazy val `scalajs-highcharts-test` = (project in file("test"))
  .settings(commonSettings, libraryTestSettings)
  .enablePlugins(ScalaJSBundlerPlugin)

lazy val `scalajs-highcharts-test-frontend` = (project in file("test") / "frontend")
  .settings(commonSettings, libraryTestFrontendSettings)
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(`scalajs-library`)