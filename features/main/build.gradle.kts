plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    kotlin("kapt")
}

android {
    namespace = "com.uli.main"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk

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

    //Navigation Component
    implementation(Dependencies.Navigation.navigationUI)
    implementation(Dependencies.Navigation.navigationFragment)

    //Koin
    implementation(Dependencies.Koin.koin)

    //Paging
    implementation(Dependencies.Paging.pagingCommon)
    implementation(Dependencies.Paging.pagingRuntime)

    implementation(project(":features:main:data"))
    implementation(project(":core"))

    //ViewBinding Delegate
    implementation(Dependencies.ViewBinding.viewBindingDelegate)
    implementation(Dependencies.ViewBinding.viewBindingDelegateNoreflection)
}