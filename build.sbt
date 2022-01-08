import sbt.Keys._

import com.karasiq.scalajsbundler.compilers.{AssetCompilers, ConcatCompiler}
import com.karasiq.scalajsbundler.dsl.Mimes

// Versions
val ScalaJSJQueryVersion = if (ProjectDefs.scalaJSIs06) "3.0.1" else "3.2.0"

// Tasks
lazy val generate = taskKey[Unit]("Generates Scala.js sources")

// Settings
lazy val commonSettings = Seq(
  organization                         := "com.github.karasiq",
  ThisBuild / git.useGitDescribe       := true,
  ThisBuild / git.uncommittedSignifier := Some("DIRTY"),
  ThisBuild / versionScheme            := Some("pvp"),
  isSnapshot                           := version.value.endsWith("SNAPSHOT"),
  scalaVersion                         := "2.13.7",
  publishMavenStyle                    := true,
  sonatypeSessionName                  := s"scalajs-highcharts v${version.value}",
  publishConfiguration                 := publishConfiguration.value.withOverwrite(true),
  publishTo                            := sonatypePublishToBundle.value,
  Test / publishArtifact               := false,
  pomIncludeRepository                 := { _ ⇒ false },
  licenses                             := Seq("The MIT License" → url("http://opensource.org/licenses/MIT")),
  homepage                             := Some(url("https://github.com/Karasiq/scalajs-highcharts")),
  scmInfo := Some(ScmInfo(new URL("https://github.com/Karasiq/scalajs-highcharts"), "scm:git:git@github.com:Karasiq/scalajs-highcharts.git")),
  developers := List(
    Developer(
      "Karasiq",
      "Piston Karasiq",
      "karasiq.gh.cru5k@simplelogin.co",
      new URL("https://github.com/Karasiq")
    )
  )
)

//noinspection SbtDependencyVersionInspection
lazy val generatorSettings = Seq[Def.Setting[_]](
  scalaVersion := "2.11.12",
  name         := "scalajs-highcharts-generator",
  libraryDependencies ++= Seq(
    "org.scalaj"        %% "scalaj-http"   % "0.3.16",
    "com.lihaoyi"       %% "upickle"       % "0.3.6",
    "org.apache.commons" % "commons-lang3" % "3.4"
  ),
  Compile / mainClass := Some("com.karasiq.highcharts.generator.Main"),
  generate / fork := true,
  generate / javaOptions ++= Seq(
    "-Xmx1G",
    "-Dhighcharts-generator.output=src/main/scala",
    "-Dhighcharts-generator.package=com.highcharts"
  )
) ++ fullRunTask(generate, Compile, "com.karasiq.highcharts.generator.Main")

lazy val librarySettings = Seq(
  scalaVersion := (if (ProjectDefs.scalaJSIs06) "2.13.4" else "2.13.7"),
  crossScalaVersions := {
    if (ProjectDefs.scalaJSIs06) Seq("2.11.12", "2.12.12", scalaVersion.value)
    else Seq("2.12.15", scalaVersion.value)
  },
  libraryDependencies ++= Seq(
    "io.udash" %%% "udash-jquery" % ScalaJSJQueryVersion
  ),
  name := "scalajs-highcharts",
  scalacOptions += {
    val local  = file("").toURI
    val remote = s"https://raw.githubusercontent.com/Karasiq/scalajs-highcharts/${git.gitHeadCommit.value.get}/"
    s"-P:scalajs:mapSourceURI:$local->$remote"
  }
) ++ inConfig(Compile)(
  Seq(
    webpackEmitSourceMaps := true,
    webpack / version     := "4.46.0",
    npmDependencies ++= Seq(
      "highcharts" → "~9.3.2"
    )
  )
)

lazy val libraryTestSettings = Seq(
  scalaVersion := "2.11.12",
  name         := "scalajs-highcharts-test",
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= {
    val sprayV = "1.3.3"
    val akkaV  = "2.4.0"
    Seq(
      "com.typesafe.akka" %% "akka-actor"               % akkaV,
      "io.spray"          %% "spray-can"                % sprayV,
      "io.spray"          %% "spray-routing-shapeless2" % sprayV,
      "io.spray"          %% "spray-json"               % "1.3.2"
    )
  }
) ++ inConfig(Compile)(
  Seq(
    mainClass             := Some("com.karasiq.highcharts.test.backend.HighchartsTestApp"),
    scalaJsBundlerInline  := false,
    scalaJsBundlerCompile := scalaJsBundlerCompile.dependsOn(testPage / Compile / fastOptJS / webpack).value,
    compile               := compile.dependsOn(scalaJsBundlerCompile).value,
    scalaJsBundlerAssets += {
      import com.karasiq.scalajsbundler.dsl._

      Bundle(
        "index",
        // Static
        Html from TestPageAssets.index,
        Style from TestPageAssets.style,

        // jQuery
        Script from url("https://code.jquery.com/jquery-1.12.0.js"),

        // Bootstrap
        Style from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/css/bootstrap.css"),
        Script from url("https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/js/bootstrap.js"),
        Static("fonts/glyphicons-halflings-regular.eot") from url(
          "https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.eot"
        ),
        Static("fonts/glyphicons-halflings-regular.svg") from url(
          "https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.svg"
        ),
        Static("fonts/glyphicons-halflings-regular.ttf") from url(
          "https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.ttf"
        ),
        Static("fonts/glyphicons-halflings-regular.woff") from url(
          "https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.woff"
        ),
        Static("fonts/glyphicons-halflings-regular.woff2") from url(
          "https://raw.githubusercontent.com/twbs/bootstrap/v3.3.6/dist/fonts/glyphicons-halflings-regular.woff2"
        ),

        // Scala.js app
        scalaJsBundlerApplication(testPage, fastOpt = true).value,
        TestPageAssets.sourceMap(testPage, fastOpt = true).value
      )
    },
    scalaJsBundlerCompilers := AssetCompilers { case Mimes.javascript ⇒
      ConcatCompiler
    }.<<=(AssetCompilers.default)
  )
)

lazy val libraryTestFrontendSettings = Seq(
  scalaJSUseMainModuleInitializer := true,
  name                            := "scalajs-highcharts-test-frontend",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "scalatags" % "0.11.0"
  )
)

// Projects
lazy val generator = project
  .settings(commonSettings, generatorSettings)

lazy val library = (project in file("."))
  .settings(commonSettings, librarySettings)
  .enablePlugins(scalajsbundler.sbtplugin.ScalaJSBundlerPlugin)

lazy val testServer = (project in file("test"))
  .settings(commonSettings, libraryTestSettings)
  .enablePlugins(SJSAssetBundlerPlugin)

lazy val testPage = (project in file("test") / "frontend")
  .settings(commonSettings, libraryTestFrontendSettings)
  .enablePlugins(scalajsbundler.sbtplugin.ScalaJSBundlerPlugin)
  .dependsOn(library)
