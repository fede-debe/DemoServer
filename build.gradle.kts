val ktorVersion: String by project
val logbackVersion: String by project

plugins {
    application
    kotlin("jvm") version "2.1.21"
}

group = "com.example"
version = "1.0-SNAPSHOT"

application { mainClass.set("io.ktor.server.netty.EngineMain") }


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("io.ktor:ktor-server-core:${ktorVersion}")
//    implementation("io.ktor:ktor-serialization-kotlinx-json:${ktorVersion}")
    implementation("io.ktor:ktor-server-netty:${ktorVersion}")
    implementation("ch.qos.logback:logback-classic:${logbackVersion}")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}