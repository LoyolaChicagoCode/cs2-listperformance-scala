name := "cs2-listperformance-scala"

version := "0.2"

scalaVersion := "3.2.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-Ysafe-init", "-language:strictEquality")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
