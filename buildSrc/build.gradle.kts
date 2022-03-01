plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    mavenCentral()
}

object PluginVersions {
    const val gradle_plugin = "7.0.3"
    const val kotlin_gradle_plugin = "1.6.10"

}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersions.gradle_plugin}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin_gradle_plugin}")
}
