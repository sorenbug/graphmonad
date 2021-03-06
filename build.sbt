lazy val core = (project in file("core")).settings(
  organization := "tf.bug",
  name := "graphmonad",
  version := "0.1.0",
  scalaVersion := "2.13.1",
  resolvers += Resolver.bintrayRepo("alexknvl", "maven"),
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-core" % "2.1.1",
    "com.chuusai" %% "shapeless" % "2.3.3",
    "com.alexknvl"  %%  "polymorphic" % "0.5.0",
  ),
  addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full),
)
