plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
}

allprojects {
    group = "enums-and-sealed-classes-kt"
    version = extra["enums-and-sealed-classes-kt.version"] as String
}

subprojects {
    repositories {
        mavenCentral()
    }
}
