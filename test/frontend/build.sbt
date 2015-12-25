persistLauncher in Compile := true

organization := "com.github.karasiq"

name := "scalajs-highcharts-test-frontend"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.greencatsoft" %%% "scalajs-angular" % "0.5",
  "com.lihaoyi" %%% "upickle" % "0.3.6",
  "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.5"
)