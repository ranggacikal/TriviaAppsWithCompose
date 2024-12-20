// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false  // Use Kotlin 1.8.10 if 1.9.0 gives issues
    id("com.google.dagger.hilt.android") version "2.51.1" apply false  // Update Hilt to 2.51.1
}