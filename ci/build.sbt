
// Name of the module.
name := "ci"

// Version of the system.
version := "0.1"

// SRDF interface.
resolvers ++= Seq(
  Resolver.bintrayRepo("labra", "maven"),
  Resolver.bintrayRepo("weso", "weso-releases"),
  Resolver.sonatypeRepo("snapshots")
)

// Scala version.
scalaVersion := "2.13.1"

// Simple RDF interface.
libraryDependencies += "es.weso" %% "srdf" % "0.1.63"
libraryDependencies += "es.weso" %% "srdf4j" % "0.1.63"

// Scala test.
libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1"