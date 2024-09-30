## Android MipMap vs Drawables 

So what is the reason behind this app launcher icon keep 
in mipmap instead of drawables

A large number of Android Devices uses a higher resolution
launcher icons 

mipmap-mdpi
mipmap-hdpi
mipmap-xhdpi
mipmap-xxhdpi

This all folder will not remove after publishing in playstore 
but drawable will keep only specific varient drawable






### What is a layout in android

A layout defines the visual structure for a user interface such as ui for an activity or app widget

All layouts are the subclasses of the viewGroup class and each subclass provides unique way to display the views we nest within it


Linear layout organises its children into single horizontal or vertical row . It creates a scrollbar if the length of the window exceeds the length go the screen

Relative Layout enables us to specify the location of child view relative to each other


Constraint Layout allows positioning Childers to each other and the parent . But also offers other powerful positioning and sizing strategies including horizontal or vertical child “chains” with custom spacing, arbitrary horizontal/vertical “guidelines” and custom child size aspect ratios

FrameLayout blocks out an area on the screen to display a single item

Grid layout displays items in a two dimensional scrollable grid



When we click homeback press
onPause
onStop

And open
onRestart
onStart
onResume

If we click bacokpress
onPause
onStop
onDestroy

Again recent screen open
onCreate
onStart
onResume
onPause
onStop
onDestroy


Another again comes back
onRestart will call
onStart call
onResume()



Three types of compiler
1. Kt to java byte code operation
2. D8 making Dex file support
3. R8 is shrinking code


## Local Development


Here are some useful Gradle/adb commands for executing this example:
* ./gradlew clean build - Build the entire example and execute unit and integration tests plus lint check.
* ./gradlew installDebug - Install the debug apk on the current connected device.
* ./gradlew runUnitTests - Execute domain and data layer tests (both unit and integration).
* ./gradlew runAcceptanceTests - Execute espresso and instrumentation acceptance tests.



## Keyboard ShortCut

shift + ctrl + left and right to select all
move left and right

shift + ctrl longpress keydown up for return
ctrl + A + backspace - to clear all

shift + ctrl + F = find string and other file
double space - to filei n project level
command + E - Recent changes
Ctrl + shift + R

# Gradle commands
./gradlew app:dependencies
./gradlew yourmodule:dependencies > dependency.txt

./gradlew testDebugUnitTest

./gradlew assembleRelease --stacktrace



# Useful Code

Handler(Looper.getMainLooper()).post(Runnable {
logError(tag, "running 1 ${Thread.currentThread().name}")

})


CoroutineScope(Dispatchers.IO).launch {
logError(tag = tag, "IntentService")
}


https://stackoverflow.com/questions/60672406/how-to-use-coroutine-in-kotlin-to-call-a-function-every-second

// Repeat a function in coroutines

fun repeatFun(): Job {
return coroutineScope.launch {  
while(isActive) {
//do your network request here
delay(1000)
}
}
}

//start the loop
val repeatFun = repeatRequest()

//Cancel the loop
repeatFun.cancel()



## Adb install command
—————————————————
wget  https://dl.google.com/android/repository/platform-tools-latest-darwin.zip


