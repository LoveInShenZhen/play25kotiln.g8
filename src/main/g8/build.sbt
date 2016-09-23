name := """$name;format="Camel"$"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

kotlinVersion := "$KotlinVersion$"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

kotlinLib("stdlib")
kotlinLib("reflect")

libraryDependencies += filters

libraryDependencies += "org.jodd" % "jodd-core" % "3.7"

libraryDependencies += "org.jodd" % "jodd-bean" % "3.7"

libraryDependencies += "org.jodd" % "jodd-http" % "3.7"

libraryDependencies += "org.jodd" % "jodd-mail" % "3.7"

libraryDependencies += "org.simpleframework" % "simple-xml" % "2.7.1"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.39"

