name := "photoshelf"
 
version := "0.0.1-SNAPSHOR"
      
lazy val `photoshelf` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice
)
