name := "Kafka Project"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % "2.1.0",
 "org.apache.spark" %% "spark-streaming" % "2.1.0",
 "dibbhatt" % "kafka-spark-consumer" % "1.0.10"
)
resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"
		  
