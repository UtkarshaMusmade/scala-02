name := "Scala-02"

version := "0.1"

scalaVersion in ThisBuild:= "2.13.0"

lazy val root = (project in file(".")).dependsOn(maxelement,fibonacci,stringinterpolation,sumofproduct).aggregate(maxelement)
lazy val maxelement = project in file("maxelement ")
lazy val fibonacci = project in file("fibonacci ")
lazy val stringinterpolation = project in file("stringinterpolation ")
lazy val sumofproduct = project in file("sumofproduct ")
lazy val bankaccount = project in file("bankaccount")

