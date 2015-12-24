val commonSettings = Seq(
  organization := "com.github.karasiq",
  isSnapshot := true,
  version := "1.0.0-SNAPSHOT",
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
  mainClass in Compile := Some("com.karasiq.highcharts.generator.Main")
)

lazy val generator = Project("generator", file("generator"))
  .settings(commonSettings, generatorSettings)

lazy val library = Project("scalajs-library", file("scalajs-library"))
  .settings(commonSettings, name := "scalajs-highcharts")
  .enablePlugins(ScalaJSPlugin)

lazy val root = Project("root", file("."))
  .settings(commonSettings)
  .aggregate(library)