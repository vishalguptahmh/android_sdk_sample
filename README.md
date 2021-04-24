# android Lib

- Create new Module and select library
- create files in your module
- try the functionality in main app
- lets upload to github and create release
- create account on https://jitpack.io/ and login with your github account
- your are all set it.
```groovy
allprojects {
	repositories {
		//...
		maven { url 'https://jitpack.io' }
	}
}
```
```groovy
dependencies {
	implementation 'com.github.vishalguptahmh:android_sdk_sample:1.0.1'
}
```

