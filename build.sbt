import sbt.Keys._

// Tasks
lazy val generate = inputKey[Unit]("Generates Scala.js sources")

// Settings
lazy val commonSettings = Seq(
  organization := "com.github.karasiq",
  isSnapshot := false,
  version := "1.0.8",
  scalaVersion := "2.11.7",
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
  pomExtra := <scm>
    <url>git@github.com:Karasiq/scalajs-highcharts.git</url>
    <connection>scm:git:git@github.com:Karasiq/scalajs-highcharts.git</connection>
  </scm>
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
  fullRunInputTask(generate, Compile, "com.karasiq.highcharts.generator.Main"),
  javaOptions in generate ++= Seq(
    "-Dhighcharts-generator.output=src/main/scala",
    "-Dhighcharts-generator.package=com.highcharts"
  )
)

lazy val librarySettings = Seq(
  libraryDependencies ++= Seq(
    "be.doeraene" %%% "scalajs-jquery" % "0.8.1"
  ),
  name := "scalajs-highcharts",
  generate <<= (generate in generator)
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
  gulpAssets in Compile := file("test") / "frontend" / "webapp",
  gulpCompile in Compile <<= (gulpCompile in Compile).dependsOn(fastOptJS in Compile in libraryTestFrontend)
)

lazy val libraryTestFrontendSettings = Seq(
  persistLauncher in Compile := true,
  name := "scalajs-highcharts-test-frontend",
  libraryDependencies ++= Seq(
    "com.greencatsoft" %%% "scalajs-angular" % "0.5"
  )
)

// Projects
lazy val generator = Project("generator", file("generator"))
  .settings(commonSettings, generatorSettings)

lazy val library = Project("scalajs-library", file("."))
  .settings(commonSettings, librarySettings)
  .enablePlugins(ScalaJSPlugin)

lazy val libraryTest = Project("scalajs-highcharts-test", file("test"))
  .settings(commonSettings, libraryTestSettings)
  .enablePlugins(GulpPlugin)

lazy val libraryTestFrontend = Project("scalajs-highcharts-test-frontend", file("test") / "frontend")
  .settings(commonSettings, libraryTestFrontendSettings)
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(library)