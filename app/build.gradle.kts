plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.githubactionsdemo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.githubactionsdemo"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-dev"
        }
        release {
            isMinifyEnabled = false
        }
    }
}
