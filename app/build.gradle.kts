import com.android.build.api.dsl.AndroidSourceSet

plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
}

android {
    compileSdk = extra["compileSdkVersion"] as Int
    buildToolsVersion = extra["buildToolsVersion"] as String
    defaultConfig {
        applicationId = "mkn.tasky"
        minSdk = extra["minSdkVersion"] as Int
        targetSdk = extra["targetSdkVersion"] as Int
        versionCode = 1
        versionName = "1.0.0"
    }

    sourceSets {
        this as NamedDomainObjectContainer<AndroidSourceSet>
        Main.create(this)
        TTest.create(this)
        AndroidTest.create(this)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(Libraries.ktxCore)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.coreSplash)
}