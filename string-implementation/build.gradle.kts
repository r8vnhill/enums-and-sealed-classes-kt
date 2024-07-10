plugins {
    id("io.gitlab.arturbosch.detekt")
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("reflect"))
}

kotlin {
    jvmToolchain(17)
}
