# Android Project Dependencies

This document provides a list of frequently used dependencies for Android app development, including setup instructions and usage notes.

## Room

Room is a persistence library that provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

### Dependency Versions:
```kotlin
val room_version = "2.6.1"
```

### Dependencies:
```kotlin
// Room runtime
implementation("androidx.room:room-runtime:$room_version")

// Annotation Processor for Room (Java)
annotationProcessor("androidx.room:room-compiler:$room_version")

// Kotlin Annotation Processing Tool (kapt)
kapt("androidx.room:room-compiler:$room_version")

// Kotlin Symbol Processing (KSP)
ksp("androidx.room:room-compiler:$room_version")

// Optional - Paging 3 Integration
implementation("androidx.room:room-paging:$room_version")
```

### Notes:
- **Room Paging**: Use the paging integration if you're working with large datasets and need efficient on-demand loading.
- Choose between `kapt` or `ksp` based on your project's requirements.

## KTX (Kotlin Extensions)

KTX libraries provide Kotlin extensions for Android libraries to simplify development and improve code readability.

### Dependencies:
```kotlin
implementation("androidx.core:core-ktx:1.13.1")
implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.4")
implementation("androidx.room:room-ktx:2.6.1")
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.4")
implementation("com.google.android.play:core-ktx:1.8.1")
```

### Notes:
- **Lifecycle KTX**: Provides Kotlin-friendly LiveData, ViewModel, and runtime classes for managing UI-related data in a lifecycle-conscious way.

## Navigation

AndroidX Navigation component simplifies navigation between fragments, activities, and other composables.

### Dependencies:
```kotlin
implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
```

### Notes:
- **Navigation KTX**: Leverage the power of Kotlin for concise and idiomatic navigation code.

## OkHttp

OkHttp is an HTTP client for Android that supports HTTP/2 and features a robust connection-pooling mechanism.

### Dependency Versions:
```kotlin
implementation("com.squareup.okhttp3:okhttp-bom:4.12.0")
```

### Dependencies:
```kotlin
implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
implementation("com.squareup.okhttp3:okhttp")
implementation("com.squareup.okhttp3:logging-interceptor")
```

### Notes:
- **BOM**: The Bill of Materials (BOM) ensures all OkHttp components use the same version, avoiding compatibility issues.

## Retrofit

Retrofit is a type-safe HTTP client for Android and Java, developed by Square.

PICASSO :   
```kotlin
implementation ("com.squareup.picasso:picasso:2.8")
```

GLIDE :
```kotlin
 implementation 'com.github.bumptech.glide:glide:4.16.0'
```

VOLLEY :
```kotlin
implementation ("com.github.bumptech.glide:volley-integration:4.14.2")
```

CircularImageView :
```kotlin
implementation ("de.hdodenhof:circleimageview:3.1.0")
```

### Dependency Versions:
```kotlin
val retrofit_version = "2.11.0"

implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
```

### Notes:
- Combine Retrofit with OkHttp for network operations, making it easy to handle API requests and responses.

## Dagger-Hilt

Hilt is a dependency injection library for Android that reduces the boilerplate code involved in using Dagger in your app.

### Project-level setup:
```kotlin
id("com.google.dagger.hilt.android") version "2.44" apply false
```

### App/module-level setup:
```kotlin
id("kotlin-kapt")
id("com.google.dagger.hilt.android")

implementation("com.google.dagger:hilt-android:2.44")
kapt("com.google.dagger:hilt-android-compiler:2.44")
```

### Notes:
- **Hilt**: Simplifies dependency injection in Android apps, especially when working with ViewModels, WorkManager, and other Android components.

## Pagination

Pagination library helps you load data gradually and efficiently, perfect for handling large datasets.

### Dependency Versions:
```kotlin
val paging_version = "3.3.2"
implementation("androidx.paging:paging-runtime:$paging_version")

// For testing without Android dependencies
testImplementation("androidx.paging:paging-common:$paging_version")

// Optional - Jetpack Compose integration
implementation("androidx.paging:paging-compose:3.3.2")
```

### Notes:
- **Paging**: Ideal for implementing infinite scrolling or on-demand data loading patterns in RecyclerViews or Compose-based lists.

---

### Usage Notes
- Ensure that your project’s Gradle files are set up to use Kotlin DSL.
- You can too refer to Official Docs as well for in-depth reference or dependencies update.
