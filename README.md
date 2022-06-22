

![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white)

# Welcome to Chooaca Jetpack-API
<p align="Center">
  <img src="https://cdn.freebiesupply.com/logos/large/2x/kotlin-1-logo-png-transparent.png" height="128"/>
  &nbsp
  &nbsp
  &nbsp
  &nbsp
  &nbsp
  <img src="https://miro.medium.com/max/1400/1*UpiyYV4onPs4emx-whdVHA.png" height="128"/>
  &nbsp
  &nbsp
  &nbsp
  &nbsp
  &nbsp
  <img src="https://tabris.com/wp-content/uploads/2021/06/jetpack-compose-icon_RGB.png" height="128"/>
  
  <p align="center">
    Technologies We Were Using in Development
  </p>
</p>
<p>
  <p align="center">
	  <img src="https://inakoran.com/uploads/2019/12/16/1576467465-pd214b294b677b2240f183b19398f4add_800.jpg" height="128"/>
	<p align="center">
    		Also, tribute given to BMKG for the data
  	</p>
  </p>
	

</p>
Have you ever wonder to make an Android App with Weather API? But you don't know how to connect to "JSON-ish" API? So, here is the solution.

I want to introduce you to `Chooaca API`, a weather API that specifically developed to be a `Kotlin (Jetpack Compose) library`.   Right now, `Chooaca API` only available for `Kotlin Library (Especially Jetpack Compose)`, but we are wide open to be expanded into other developing environment.

# What Features Chooaca Offers to You?
`Chooaca API` will has 2 main features, `but right now only one available`.

## 1.	ChooacaQuake
`ChooacaQuake` is a feature to get some information about Earthquake in Indonesia that recently happen. This feature has 2 main function, which is:
 
-   ### `Recent Quake`
		
	Same with its name, this function can return information about the latest earthquake happen. The information is consist of:
```
- Tanggal
- Jam
- Date and Time
- Koordinat
- Lintang
- Bujur
- Magnitude
- Kedalaman
- Wilayah
- Potensi
- Dirasakan
- Shakemap
```
		
-   ### `List of Quake`

	This function return a list of 15 Earthquake's happen recently. Each of its element will give you the same form similar with `Recent Quake`
	
		
## 2.	ChooacaForecast
-  is still on developing progress. So keep in touch with us to make sure you will not skip the update.
	

# Where is All The Data Came From?
All the data 100% retrieved from BMKG. So, i want to give a tribute to BMKG for making those data open and free to accessed. If you are a developer and interested with the data, you can also make experiment with your own. 

[Data BMKG]("https://data.bmkg.go.id/")

# Setup Instruction
### 1. Setup for Jitpack
-   For old version of gradle (before arctic fox update)
    
    Add this in your root  `build.gradle`  file (project scope) :
    
    ```gradle
    allprojects {
	    repositories {
		    ..
		    maven { url "https://jitpack.io" }
	    }
    }
    ```

-   For gradle version 7 or latest

    Add this in your root `setting.gradle` file :
    
    ```gradle
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            ..
            maven { url 'https://jitpack.io' }
        }
    }
    
    ```
    
### 2. Setup Chooaca into Your Dependency

-   After succesfully including Jitpack, right now you able to implement `Cisu` in your project.

    Add this to your `build.gradle` (app scope) :
    ```gradle
    dependencies {
        ..
        implementation 'com.github.fahmirumagutawan:Cisu-Jetpack-Component:$cisu_version'
    }
    ```
    > You can find `cisu_version` on Jitpack Badge above, or on our release tag.
# Documentation
So here you are, arrived at `Chooaca API documentation`. To make this clean to watch, I group it by each feature available. `*Still one available now` 
## ChooacaQuake
### 1. RecentQuake
Regularly you can just call this function like this:
```kotlin
Chooaca
	.Quake()
	.addRecentGetter(object : RecentQuakeGetter {  
	    override fun onSuccessRetrieved(earthQuake: GempaAutoGempa) {  
	        //DO SOMETHING WITH "earthQuake" HERE
	    }  
  
	    override fun onFailed() {  
	        //IF DATA FAILED TO RETRIEVED, DO SOMETHING HERE
	    }  
	})
```

### 2. ListOfQuake
Regularly you can just call this function like this
```kotlin
Chooaca  
    .Quake()  
    .addListOfQuakeGetter(object : ListQuakeGetter {  
        override fun onSuccessRetrieved(listOfEarthQuake: List<GempaGempaList>) {  
            //DO SOMETHING WITH YOUR LIST HERE
            //MAYBE SAVE IT in VARIABLE, VIEWMODEL, or ANYTHING YOU WANT 
        }  
  
        override fun onFailed() {  
            //IF DATA FAILED TO RETRIEVED, DO SOMETHING HERE 
        }  
    })
```
## ChooacaForecast
`STILL IN DEVELOPMENT STAGE, SO PLEASE KEEP IN TOUCH WITH ME IF YOU ARE INTERESTED :)`
