val compileSdkVersion: String by project
val buildToolsVersion: String by project
val minSdkVersion: String by project
val targetSdkVersion: String by project

extra.apply {
    this["compileSdkVersion"] = compileSdkVersion.toInt()
    this["buildToolsVersion"] = buildToolsVersion
    this["minSdkVersion"] = minSdkVersion.toInt()
    this["targetSdkVersion"] = targetSdkVersion.toInt()
}
