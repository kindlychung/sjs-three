lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)

name := "Scala.js facade for three.js"

normalizedName := "sjs-three"

version := "0.1"

organization := "vu.co.kaiyin"

scalaVersion := "2.11.7"


/* crossScalaVersions := Seq("2.10.4", "2.11.7") */

scalacOptions ++= Seq("-feature")

skip in packageJSDependencies := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "org.webjars.bower" % "three.js" % "0.73.0"

)

jsDependencies in Test += RuntimeDOM

jsDependencies += "org.webjars.bower" % "three.js" % "0.73.0" / "three.min.js"

homepage := Some(url("https://github.com/kindlychung/sjs-three"))

