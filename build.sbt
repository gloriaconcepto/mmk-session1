

lazy val commonSettings = Seq(
  organization := "consulting.ikenna.beginningscala",
  version := "0.0.1",
  scalaVersion := "2.12.1"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "Beginning Scala Session 1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )