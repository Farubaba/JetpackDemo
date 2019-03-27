
### Android Jetpack项目开发基本流程：

1. 新建项目，添加Kotlin支持
  
		//项目根目录build.gradle
		buildscript {
		    ext.kotlin_version = '1.3.21'
		    repositories {
		        google()
		        jcenter()
		    }
		    dependencies {
		        classpath 'com.android.tools.build:gradle:3.2.1'
		        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
		    
		        // NOTE: Do not place your application dependencies here; they belong
		        // in the individual module build.gradle files
		    }
		}
    
    
	    //app module build.gradle
	    apply plugin: 'kotlin-android'
	    apply plugin: 'kotlin-android-extensions'
	        
	    dependencies{
	        implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
	    }
    

2. 添加StartActivity作为Launch Activity（因为我比较习惯用Java而不是Kotlin），所以项目在不是必须要用到Kotlin的地方，都默认采用Java来搭建
3. 添加Java 8 特性Lambda表达式支持

		compileOptions {
		    sourceCompatibility JavaVersion.VERSION_1_8
		    targetCompatibility JavaVersion.VERSION_1_8
		}
4. 完善项目目录结构
	1. [完善应用目录结构]所有folder都可以在AndroidStudio中查看new->Folder

			app/src/main/aidl
			app/src/main/jni
			app/src/main/assets
			app/src/main/rs
	2. [完善资源目录结构]所有资源类型可以在AndroidStudio查看new->Android Resource Directory中查看。

			res/animator/
			res/anim/
			res/color/
			res/drawable/
			res/font/
			res/interpolator/
			res/layout/
			res/menu/
			res/mipmap/
			res/navigation/
			res/raw/
			res/transition/
			res/values/
			res/xml/
			
	3. 创建屏幕适配目录结构

			//todo
			
5. abc

[完善应用目录结构]:https://developer.android.com/studio/projects
[完善资源目录结构]:https://developer.android.com/guide/topics/resources/providing-resources
