
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.example.gigshub"

    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.gigshub"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }
}

dependencies {

    // =====================================
    // ANDROID CORE
    // =====================================

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // =====================================
    // JETPACK COMPOSE & MATERIAL 3
    // =====================================

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    // =====================================
    // NAVIGATION COMPOSE
    // =====================================

    implementation(libs.androidx.navigation.compose)

    // =====================================
    // MVVM - VIEWMODEL
    // =====================================

    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // =====================================
    // RETROFIT & OKHTTP
    // =====================================

    implementation(libs.retrofit)
    implementation(libs.retrofit.kotlinx.serialization)

    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)

    // =====================================
    // KOTLIN SERIALIZATION
    // =====================================

    implementation(libs.kotlinx.serialization.json)

    // =====================================
    // COROUTINES
    // =====================================

    implementation(libs.kotlinx.coroutines.android)

    // =====================================
    // COIL - IMAGE LOADING
    // =====================================

    implementation(libs.coil.compose)

    // =====================================
    // UNIT TESTING
    // =====================================

    testImplementation(libs.junit)

    // =====================================
    // ANDROID TESTING
    // =====================================

    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // =====================================
    // DEBUG TOOLS
    // =====================================

    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
