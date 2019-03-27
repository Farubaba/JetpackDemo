
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
4、