name := "first_scala"

version := "1.0"

lazy val `first_scala` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq (
  cache ,
  ws   ,
  specs2 % Test ,
  filters ,
  "com.typesafe.play" %% "play-slick" % "2.0.2",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.2"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.38"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"