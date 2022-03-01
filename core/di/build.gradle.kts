plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinKapt)
}

android {
    compileSdk = extra["compileSdkVersion"] as Int

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(Libraries.lifecycleViewModelKtx)

    implementation(Libraries.dagger)
    kapt(Libraries.daggerCompiler)
}