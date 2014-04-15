android-project-example
=======================

It is project for fast create android applications, using latest gradle android plugin,   checking style and lint. Now, project provides two type of projects: **android-simple-example** and **android-extend-example**.

How to use
-----------------------

It's simple! You shoud download [setup.gradle](setup.gradle) and run tasks **_create_** with argument **_instanceName_**. For example create your instance **android-simple-example** (by default):
```bash
 $ cd <you-projects-foldes>
 $ wget https://github.com/noveogroup/android-project-example/raw/master/setup.gradle
 $ gradle -b setup.gradle create -PinstanceName=MyFunnyApp
```
If you want create instance of **android-extend-example** you must add parameter **_projectType_**. For exapmle:
```bash
 $ gradle -b setup.gradle create -PinstanceName=MyFunnyApp -PprojectType=android-extended-example
```

In result you should get:

```bash
 $ ls
 $ my-funny-app  setup.gradle
```

Static Analyzers
-----------------------

By default, build script will perform static code analysys and aggregate results. **Build task will fail if any analyzers report errors or warnings.** However, you can always choose not to use one or all of them.
To disable all analyzers, except Lint, remove following line from your build.gradle script:
```groovy
apply from: rootProject.file('gradle/check.gradle')
```

### Lint
http://tools.android.com/tips/lint

Lint configuration can be found in build.gradle file:
```groovy
lintOptions {
    abortOnError true
    checkAllWarnings true
    warningsAsErrors true
    disable 'AllowBackup', 'ContentDescription', 'InvalidPackage', 'SelectableText', 'SpUsage'
}
```
You can always suppress Lint warnings using @SuppressLint() annotation.
See http://tools.android.com/tips/lint/suppressing-lint-warnings for more details.

Results can be found in ./build/lint-results.html

### FindBugs
http://findbugs.sourceforge.net

FindBug configuration files can be found in ./gradle/config/findbugs folder.

To suppress FindBug warnings add following dependency to your module:
```groovy
compile 'com.google.code.findbugs:annotations:2.0.+'
```
You can then use @SuppressFBWarnings() annotation.

See http://findbugs.sourceforge.net/manual/index.html for more details.

Results can be found in ./build/reports/findbugs

### PMD
http://pmd.sourceforge.net

PMD configuration file can be found in ./gradle/config/pmd folder.

To suppress PMD warning you can use @SuppressWarnings("PMD[.%RULE%]") annotation.

See http://pmd.sourceforge.net/pmd-5.1.0/suppressing.html for more details.

Results can be found in ./build/reports/pmd

### CheckStyle
http://checkstyle.sourceforge.net

CheckStyle configuration files can be found in ./gradle/config/checkstyle folder.

You can disable check for some code fragment using following comments:
```java
//CHECKSTYLE:OFF
String s= "Some"+
"poorly "     +     "formatted"+" code";
//CHECKSTYLE:ON
```

Results can be found in ./build/reports/checkstyle

Details
----------------------

More in detail you can read about types of projects in readme files:

 + [android-simple-example](android-simple-example/README.md)
 + [android-extend-example](android-extended-example/README.md)
