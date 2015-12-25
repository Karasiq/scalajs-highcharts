organization := "com.github.karasiq"

name := "scalajs-highcharts-test"

version := "1.0.0"

scalaVersion := "2.11.7"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= {
  val sprayV = "1.3.3"
  val akkaV = "2.4.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing-shapeless2" % sprayV,
    "io.spray" %% "spray-json" % "1.3.2"
  )
}

mainClass in Compile := Some("com.karasiq.highcharts.test.backend.HighchartsTestApp")

lazy val frontend = Project("scalajs-highcharts-test-frontend", file("frontend"))
  .enablePlugins(ScalaJSPlugin)

lazy val backend = Project("scalajs-highcharts-test", file("."))
  .enablePlugins(GulpPlugin)

gulpAssets in Compile := baseDirectory.value / "frontend" / "webapp"

gulpCompile in Compile <<= (gulpCompile in Compile).dependsOn(fastOptJS in Compile in frontend)