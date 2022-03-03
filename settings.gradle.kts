rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "Tasky"

enableFeaturePreview("VERSION_CATALOGS")

// Set single lock file (gradle.lockfile)
// This preview feature should be enabled by default in Gradle 7
// More: https://docs.gradle.org/current/userguide/dependency_locking.html#single_lock_file_per_project
enableFeaturePreview("ONE_LOCKFILE_PER_PROJECT")

include(
    ":app",
    ":core:di"
)


pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}


dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {

            version("kotlin", "1.6.10")
            version("constraintlayout", "2.1.2")
            version("androidx-ktx", "1.7.0")
            version("appcompat", "1.4.0")
            version("dagger", "2.28")
            version("okhttp", "3.12.10")
            version("archComponents", "2.2.0")
            version("retrofit", "2.6.0")
            version("room", "2.2.5")
            version("fragmentKtx", "1.3.0-alpha03")
            version("coroutinesCore", "1.5.2")
            version("coroutinesAndroid", "1.3.0")
            version("navigation", "2.3.5")
            version("material", "1.4.0")
            version("splash", "1.0.0-beta01")
            version("javax", "10.0-b28")


            alias("kotlinStd").to("org.jetbrains.kotlin", "kotlin-stdlib-jdk8").versionRef("kotlin")
            alias("appCompat").to("androidx.appcompat", "appcompat").versionRef("appcompat")
            alias("material").to("com.google.android.material", "material").versionRef("material")
            alias("constraintlayout").to("androidx.constraintlayout", "constraintlayout").versionRef("constraintlayout")
            alias("androidx-ktx").to("androidx.core", "core-ktx").versionRef("androidx-ktx")
            alias("dagger-core").to("com.google.dagger", "dagger").versionRef("dagger")
            alias("dagger-compiler").to("com.google.dagger", "dagger-compiler").versionRef("dagger")
            bundle("dagger", listOf("dagger-core", "dagger-compiler"))

            alias("retrofit-core").to("com.squareup.retrofit2", "retrofit").versionRef("retrofit")
            alias("retrofit-moshi").to("com.squareup.retrofit2", "converter-moshi").versionRef("retrofit")
            bundle("retrofit", listOf("retrofit-core", "retrofit-moshi"))
        }
    }
}

