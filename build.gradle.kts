plugins {
    java
    id("io.papermc.paperweight.userdev").version("2.0.0-beta.18")
    id("xyz.jpenilla.run-paper").version("2.3.1")
    id("com.gradleup.shadow").version("9.0.0-beta4")
}

group = "com.jnngl"
version = "1.0.1"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(24))
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
}

dependencies {
    // Paper API bundle for plugin development
    paperweightDevelopmentBundle("io.papermc.paper:dev-bundle:1.21.8-R0.1-SNAPSHOT")

    // Plugin dependencies
    implementation("net.elytrium:serializer:1.1.1")
    implementation("com.jnngl:mapcolor:1.0.1")
    implementation("com.j256.ormlite:ormlite-jdbc:6.1")
    implementation("org.xerial:sqlite-jdbc:3.45.0.0")

    // Lombok
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    compileOnly("org.projectlombok:lombok:1.18.30")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    processResources {
        filteringCharset = "UTF-8"
        filesMatching("plugin.yml") {
            expand("version" to project.version)
        }
    }

    shadowJar {
        archiveClassifier.set("")
        relocate("net.elytrium.serializer", "com.jnngl.vanillaminimaps.serializer")
        exclude("org/slf4j/**")
        minimize()
    }

    build {
        dependsOn(shadowJar)
    }
}
