plugins {
    id("com.android.application") version "8.1.0" apply true
    id("org.jetbrains.kotlin.android") version "1.8.10" apply true
}

android {
    namespace = "com.example.pra6"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.pra6"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
