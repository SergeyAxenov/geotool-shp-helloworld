name := "geotool-shp-helloworld"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/javax.media/jai_core
  "javax.media" % "jai_core" % "1.1.3",
  // https://mvnrepository.com/artifact/org.geotools/gt-shapefile
  "org.geotools" % "gt-shapefile" % "17.1",

  // https://mvnrepository.com/artifact/org.geotools/gt-sample-data
  // Test Only
  "org.geotools" % "gt-sample-data" % "17.1" % Test
)
resolvers += "Osgeo Repo" at "http://download.osgeo.org/webdav/geotools/"
