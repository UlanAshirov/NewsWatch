plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    api(project(":common"))

    //Coroutine
    implementation(Dependencies.Coroutine.coroutine)

    //Paging3
    implementation(Dependencies.Paging.pagingCommon)

    //Koin
    implementation(Dependencies.Koin.koinCore)
}