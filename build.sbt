organization := "it.nerdammer.bigdata"

name := "spark-hbase-connector"

version := "1.0.3"

scalaVersion := "2.11.8"

libraryDependencies +=  "org.apache.spark" % "spark-core_2.11" % "2.2.1" % "provided"

libraryDependencies +=  "org.apache.hbase" % "hbase-common" % "1.1.2" excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))

libraryDependencies +=  "org.apache.hbase" % "hbase-client" % "1.1.2" excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))

libraryDependencies +=  "org.apache.hbase" % "hbase-server" % "1.1.2" excludeAll(ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty", name="jetty"), ExclusionRule(organization = "org.mortbay.jetty", name="servlet-api-2.5"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"))


libraryDependencies +=  "org.scalatest" % "scalatest_2.11" % "3.0.5" % "test"


spName := "nerdammer/spark-hbase-connector"

sparkVersion := "2.2.1"

credentials += Credentials(Path.userHome / ".ivy2" / ".githubcredentials")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

spIncludeMaven := true



publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra :=
  <url>http://www.nicolaferraro.me</url>
    <scm>
      <url>git@github.com:nerdammer/spark-hbase-connector</url>
      <connection>scm:git:git@github.com:nerdammer/spark-hbase-connector.git</connection>
    </scm>
    <developers>
      <developer>
        <id>nicolaferraro</id>
        <name>Nicola Ferraro</name>
        <url>http://www.nicolaferraro.me</url>
      </developer>
    </developers>

