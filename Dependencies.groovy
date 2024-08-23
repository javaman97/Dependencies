Dependencies 

ROOM :
    val room_version = "2.6.1"

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")

    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$room_version")
    // To use Kotlin Symbol Processing (KSP)
    ksp("androidx.room:room-compiler:$room_version")

    // optional - Paging 3 Integration
    implementation("androidx.room:room-paging:$room_version")

    KTX(Livedata) :-
       implementation("androidx.core:core-ktx:1.13.1")
       implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
       implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.4")
       implementation("androidx.room:room-ktx:2.6.1")
       implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.4")
       implementation("com.google.android.play:core-ktx:1.8.1")


    Navigation :-   
        implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
        implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
        implementation("androidx.navigation:navigation-ui-ktx:2.7.7")


OKHTTP:
       implementation("com.squareup.okhttp3:okhttp-bom:4.12.0")
         // define a BOM and its version
       implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))

       // define any required OkHttp artifacts without version
       implementation("com.squareup.okhttp3:okhttp")
       implementation("com.squareup.okhttp3:logging-interceptor")




RETROFIT :
            val retrofit_version = "2.11.0"
            implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
        


DAGGER-HILT :
        Project Module
            id("com.google.dagger.hilt.android") version "2.44" apply false

        App/Module :
            id("kotlin-kapt")
            id("com.google.dagger.hilt.android")

         implementation("com.google.dagger:hilt-android:2.44")
         kapt("com.google.dagger:hilt-android-compiler:2.44")


 PAGINATION :

        val paging_version = "3.3.2"

         implementation("androidx.paging:paging-runtime:$paging_version")

        // alternatively - without Android dependencies for tests
        testImplementation("androidx.paging:paging-common:$paging_version")
        
        // optional - Jetpack Compose integration
        implementation("androidx.paging:paging-compose:3.3.2")