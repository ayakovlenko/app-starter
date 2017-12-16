import Dependencies._

name := "app-starter"

version := "0.1"

scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .aggregate(app, core)

lazy val app = project
  .dependsOn(core)
  .settings(commonSettings: _*)

lazy val core = project
  .settings(commonSettings: _*)

lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(
    scalatest
  ),
  scalacOptions ++= Seq(
    "-Ypartial-unification"
  )
)
