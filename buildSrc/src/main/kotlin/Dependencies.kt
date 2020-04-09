import org.gradle.api.JavaVersion

object Config {
    const val compileSdk = 29
    const val buildTools = "29.0.3"
    const val applicationId = "info.covid"
    const val minSdk = 19
    const val targetSdk = 29
    const val versionCode = 7
    const val versionName = "1.3.0"
}

object Versions {
    const val kotlin_stdlib = "1.3.61"
    const val material = "1.2.0-alpha05"

    const val constraintLayout = "2.0.0-beta4"
    const val retrofit = "2.7.1"
    const val moshi = "2.6.0"

    const val fragment_ktx = "1.2.4"
    const val liveData = "2.2.0"

    const val dime = "1.0.6"

    const val fragnav = "3.2.0"
    const val lifecycle = "2.1.0"
    const val MPAndroidChart = "v3.1.0"
    const val AnyChart = "1.1.2"
    const val room = "2.2.5"
    const val multidex = "1.0.3"
}

object Deps {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_stdlib}"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.moshi}"


    const val fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment_ktx}"

    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"

    const val fragnav = "com.ncapdevi:frag-nav:${Versions.fragnav}"

    const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:${Versions.MPAndroidChart}"
    const val AnyChart = "com.github.AnyChart:AnyChart-Android:${Versions.AnyChart}"

    const val sdp = "com.intuit.sdp:sdp-android:${Versions.dime}"
    const val ssp = "com.intuit.ssp:ssp-android:${Versions.dime}"

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    const val multidex = "com.android.support:multidex:${Versions.multidex}"
}