plugins {
    kotlin("jvm") version "1.4.10"
    // this is the important bit
    `java-test-fixtures`
    `java-library`
}

version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
