import sbt._

object Dependencies {

  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.4" % Test

  lazy val json4sJackson = "org.json4s" %% "json4s-jackson" % "3.5.3"
}
