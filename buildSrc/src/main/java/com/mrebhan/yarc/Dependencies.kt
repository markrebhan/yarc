package com.mrebhan.yarc

/**
 * Centralized location for defining all project dependencies
 */

object Versions {
    const val gradlePlugin = "7.2.0"
    const val kotlin = "1.7.10"

    const val coreKtx = "1.9.0"

    const val compose = "1.3.0-rc01"
    const val activityCompose = "1.6.0"
    const val lifecycle = "2.5.1"

    const val daggerHilt = "2.44"
    const val retrofit = "2.9.0"
    const val moshi = "1.14.0"
    const val glide = "4.14.2"
    const val exoPlayer = "2.18.1"
}

object Dependencies {

    /**
     * Core Kotlin Extensions
     */
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    /**
     * Android Lifecycle Kotlin Extensions
     */
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    /**
     * Compose
     */
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"

    /**
     * Dagger Hilt for modern dependency injection
     */
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.daggerHilt}"

    /**
     * Moshi for JSON Serialization
     */
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    /**
     * Retrofit for clean REST API interfaces
     */
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    /**
     * Glide for Image and Gif Loading
     */
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler${Versions.glide}"

    /**
     * ExoPlayer for Video Playback
     */
    const val exoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayer}"
}