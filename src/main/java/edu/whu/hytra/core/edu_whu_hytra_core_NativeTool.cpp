#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL Java_edu_whu_hytra_core_NativeTool_Java_1Hello_1sayHello(JNIEnv *env, jobject)
{
    return env->NewStringUTF("hello");
}


