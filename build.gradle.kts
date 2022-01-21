import extensions.applyDefaults

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

allprojects {
    repositories.applyDefaults()
}

subprojects {
    apply {
        from("$rootDir/versions.gradle.kts")
    }
}

tasks {
   register("clean", Delete::class ) {
       delete(setOf(rootProject.buildDir))
   }
}