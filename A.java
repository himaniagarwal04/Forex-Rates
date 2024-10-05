// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) // Apply the Android application plugin
    alias(libs.plugins.kotlin.android) // Apply the Kotlin Android plugin
}

android {
    // Configuration for the project can go here, if needed
}

repositories {
    google() // Google's Maven repository
    mavenCentral() // Maven Central repository
}

dependencies {
    // Common dependencies for the project can go here, if needed
}
