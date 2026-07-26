plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.myapp.hello"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.myapp.hello"
        minSdk = 21
        targetSdk = 35
        versionCode = 2
        versionName = "1.0"
    }

    //signingConfigs {
    //    getByName("debug") {
    //        storeFile = file("debug.keystore")
    //        storePassword = "android"
    //        keyAlias = "androiddebugkey"
    //        keyPassword = "android"
    //    }

    //    create("release") {
    //        storeFile = file("debug.keystore")
    //        storePasssword = "android"
    //        keyAlias = "androiddebugkey"
    //        keyPassword = "android"
    //    }
    //}

    //buildTypes {
    //    release {
    //        isMinifyEnable = true
    //        isShrinkResources = true
    //        proguardFiles(
    //            getDefaultProguardFile("proguard-android-optimize.txt"),
    //            "proguard-rules.pro"
    //        )
    //        signingConfigs = signingConfigs.getByName("release")
    //    }
    //    debug {
    //        signingConfigs = signingConfigs.getByName("debug")
    //    }
    //}

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}
