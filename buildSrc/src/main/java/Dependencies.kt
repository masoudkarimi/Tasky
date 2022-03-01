const val kotlinVersion = "1.6.10"

object Libraries {
    private object Versions {
        const val constraintLayout = "2.1.2"
        const val ktx = "1.7.0"
        const val appcompat = "1.4.0"
        const val dagger = "2.28"
        const val okhttp = "3.12.10"
        const val archComponents = "2.2.0"
        const val retrofit = "2.6.0"
        const val room = "2.2.5"
        const val fragmentKtx = "1.3.0-alpha03"
        const val coroutinesCore = "1.5.2"
        const val coroutinesAndroid = "1.3.0"
        const val navigation = "2.3.5"
        const val material = "1.4.0"
        const val splash = "1.0.0-beta01"
        const val javax = "10.0-b28"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"

    const val coreSplash = "androidx.core:core-splashscreen:${Versions.splash}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val javaxAnnotation = "org.glassfish:javax.annotation:${Versions.javax}"


    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okhttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    // arch components
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.archComponents}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.archComponents}"
    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.archComponents}"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"

    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"


}