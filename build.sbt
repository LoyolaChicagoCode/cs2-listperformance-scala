name := "cs2-listperformance-scala"

version := "0.2"

scalaVersion := "3.0.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
