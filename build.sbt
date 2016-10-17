name := """first-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.xerial" % "sqlite-jdbc" % "3.8.11.2",
  "org.avaje" % "ebean" % "2.7.3",
  "javax.persistence" % "persistence-api" % "1.0.2"
)

fork in run := true