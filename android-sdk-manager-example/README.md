Android Example
===============

It is an example of project configuration.

**TODO**: add more information for customers

Setup Android SDK
-----------------

You can set ANDROID_SDK and ANDROID_NDK_HOME environment variables or add sdk.dir and ndk.dir properties in your local.properties file.

Signing Application
-------------------

Place keystore files to &lt;PROJECT&gt;/keystore/ directory and write signing properties in a configuration file

release.keystore is an example. alias: release, password: qwerty

HOWTO
-----

To clean project:

    ./gradlew clean

To build project:

    ./gradlew build

To assemble code without checking and install debug version of the application on a device:

    ./gradlew installDebug
