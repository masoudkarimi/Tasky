plugins {
    id (GradlePluginId.ANDROID_LIBRARY)
    id (GradlePluginId.KOTLIN_ANDROID)
    id (GradlePluginId.KOTLIN_KAPT)
}

android {
    compileSdk = AndroidConfig.COMPILE_SDK_VERSION

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

}