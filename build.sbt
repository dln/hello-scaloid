import AndroidKeys._

seq(AndroidProject.androidSettings: _*)

seq(TypedResources.settings: _*)

seq(AndroidManifestGenerator.settings: _*)

organization := "org.eintr.test"

name := "hello-scaloid"

version := "0.0.1-SNAPSHOT"

versionCode := 0

description := "My first android program"

scalaVersion := "2.10.2"

javacOptions ++= Seq("-encoding", "UTF-8", "-source", "1.6", "-target", "1.6")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xcheckinit", "-encoding", "utf8")

cancelable := true

fork in run := true

platformName in Android := "android-10"

useProguard in Android := true


