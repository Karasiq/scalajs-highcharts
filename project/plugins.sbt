logLevel := Level.Warn

resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")

addSbtPlugin("com.github.karasiq" % "sbt-scalajs-bundler" % "1.0.5")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.5.4"