name := """CRUD"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"
enablePlugins(PlayEbean)

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
