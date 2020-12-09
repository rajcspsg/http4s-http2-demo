name := "http4s-http2-demo"

version := "0.1"

scalaVersion := "2.13.4"


libraryDependencies += "org.http4s" %% "http4s-server" % "1.0.0-M8"
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % "1.0.0-M8"

libraryDependencies += "org.eclipse.jetty" % "jetty-alpn-openjdk8-server" % "9.4.35.v20201120"
libraryDependencies += "org.eclipse.jetty" % "jetty-alpn-openjdk8-client" % "9.4.35.v20201120"


