object Dependencies {

    object UI {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.5.1"
        const val material = "com.google.android.material:material:1.7.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Test {
        const val jUnit = "junit:junit:4.13.2"
        const val androidUnit = "androidx.test.ext:junit:1.1.4"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.0"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object OkHttp {
        const val okHttp = "com.squareup.okhttp3:okhttp:4.10.0"
        const val interceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Navigation {
        private const val version = "2.5.3"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:$version"
    }

    object Room {
        private const val room_version = "2.4.3"
        const val ktx = "androidx.room:room-ktx:$room_version"
        const val runtime = "androidx.room:room-runtime:$room_version"
        const val compiler = "androidx.room:room-compiler:$room_version"
    }

    object Koin {
        private const val koin_version = "3.2.2"
        const val koin = "io.insert-koin:koin-android:$koin_version"
        const val koinCore = "io.insert-koin:koin-core:$koin_version"
    }

    object Coroutine {
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    }

    object Paging {
        private const val paging_version = "3.1.1"
        const val pagingRuntime = "androidx.paging:paging-runtime:$paging_version"
        const val pagingCommon = "androidx.paging:paging-common:$paging_version"
    }

    object ViewBinding {
        const val viewBindingDelegate = "com.github.kirich1409:viewbindingpropertydelegate:1.5.6"
        const val viewBindingDelegateNoreflection = "com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6"
    }
}