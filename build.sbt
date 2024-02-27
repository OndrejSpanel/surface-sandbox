version := "0.1.0-SNAPSHOT"

scalaVersion := "3.3.2"

scalacOptions ++= Seq("-deprecation", "-feature", "-Werror")

name := "surface-sandbox"

libraryDependencies += "org.wvlet.airframe" %% "airframe-surface" % "24.2.2"
