#include "com_noveogroup_android_application_NativeLibrary.h"
#include <jni.h>

JNIEXPORT jint JNICALL Java_com_noveogroup_android_1application_NativeLibrary_sum
  (JNIEnv *env, jclass obj, jint a, jint b)
{
  return a + b;
}

JNIEXPORT jstring JNICALL Java_com_noveogroup_android_1application_NativeLibrary_getUTF8String
  (JNIEnv *env, jclass obj)
{
  return (env)->NewStringUTF("Bon après-midi");
}
