plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.uli.data"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk

        buildConfigField("String", "API_KEY", "\"15ec17b61fe444ae9a9c8548d4ec3caf\"")
        buildConfigField("String", "BASE_URL", "\"https://newsapi.org/v2/\"")
        testInstrumentationRunner = Config.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    implementation(Dependencies.UI.coreKtx)
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.androidUnit)
    androidTestImplementation(Dependencies.Test.espresso)

    //Coroutine
    implementation(Dependencies.Coroutine.coroutine)

    //Paging3
    implementation(Dependencies.Paging.pagingRuntime)

    //Retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.gsonConverter)

    //OkHttp
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.interceptor)

    //Koin
    implementation(Dependencies.Koin.koin)

    //Room
    implementation(Dependencies.Room.ktx)
    implementation(Dependencies.Room.runtime)
    kapt(Dependencies.Room.compiler)

    api(project(":features:main:domain"))
    implementation(project(":core"))

}