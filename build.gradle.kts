plugins {
  kotlin("jvm") version "1.8.0"
  //kotlin("plugin.serialization") version "1.8.0"
}

group = "io.github.itsk1mlot.lessentials"
version = "1.0.0b"

repositories {
  mavenCentral()
  maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
  testImplementation(kotlin("test"))
  compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
  //implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0-RC")
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}
