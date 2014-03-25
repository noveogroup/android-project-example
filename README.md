android-project-example
=======================

It is project for fast create android applications, using latest gradle android plugin,   checking style and lint. Now, project provides two type of projects: **android-simple-example** and **android-extend-example**.

How to use
-----------------------

It's simple! You shoud download [setup.gradle](setup.gradle) and run tasks **_create_** with argument **_instanceName_**. For example create your instance **android-simple-example** (by default):
```bash
 $ cd <you-projects-foldes>
 $ wget https://github.com/tttzof351/android-project-example/raw/master/setup.gradle
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

Details
----------------------
More in detail you can read about types of projects in readme files:

 + [android-simple-example](android-simple-example/README.md)
 + [android-extend-example](android-extended-example/README.md)
