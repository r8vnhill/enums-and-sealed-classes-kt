rootProject.name = "enums-and-sealed-classes-kt"

include(
    ":sealed-implementation",
    "string-implementation",
)

pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    plugins {
        kotlin("jvm") version extra["kotlin.version"] as String
        id("io.gitlab.arturbosch.detekt") version
                extra["detekt.version"] as String
    }
}
