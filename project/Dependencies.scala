import sbt._

object Dependencies {

  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.5" % Test

  lazy val json4sJackson = "org.json4s" %% "json4s-jackson" % "3.5.3"

  lazy val typesafeConfig = "com.typesafe" % "config" % "1.3.2"

  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"

  lazy val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3"
}
