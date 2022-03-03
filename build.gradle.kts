plugins {

    /**
     * You should use `apply false` in the top-level build.gradle file
     * to add a Gradle plugin as a build dependency, but not apply it to the
     * current (root) project. You should not use `apply false` in sub-projects.
     * For more information, see
     * Applying external plugins with same version to subprojects.
     */

    id(GradlePluginId.ANDROID_APPLICATION) version GradlePluginVersion.ANDROID_APPLICATION apply false
    id(GradlePluginId.ANDROID_LIBRARY) version GradlePluginVersion.ANDROID_APPLICATION apply false
    id(GradlePluginId.KOTLIN_ANDROID) version GradlePluginVersion.KOTLIN_ANDROID apply false
    id(GradlePluginId.KOTLIN_KAPT) version GradlePluginVersion.KOTLIN_ANDROID apply false
}

tasks.withType<Delete> {
    delete(rootProject.buildDir)
}