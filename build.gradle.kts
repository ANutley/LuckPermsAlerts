import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    id("java")
    id("maven-publish")
}

group = "me.anutley"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
    compileOnly("net.luckperms:api:5.4")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
    processResources {
        outputs.upToDateWhen { false }
        filter<ReplaceTokens>(mapOf(
            "tokens" to mapOf("version" to project.version.toString()),
            "beginToken" to "\${",
            "endToken" to "}"
        ))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            val repo = "https://repo.anutley.me/"
            val type = if (version.toString().endsWith("SNAPSHOT")) "snapshots" else "releases"
            url = uri(repo + type)

            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
    }
}