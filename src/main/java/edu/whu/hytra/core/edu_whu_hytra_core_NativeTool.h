/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class edu_whu_hytra_core_NativeTool */

#ifndef _Included_edu_whu_hytra_core_NativeTool
#define _Included_edu_whu_hytra_core_NativeTool
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     edu_whu_hytra_core_NativeTool
 * Method:    Java_Hello_sayHello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_edu_whu_hytra_core_NativeTool_Java_1Hello_1sayHello
  (JNIEnv *, jobject);

/*
 * Class:     edu_whu_hytra_core_NativeTool
 * Method:    get
 * Signature: (Ljava/lang/String;)Ljava/util/Set;
 */
JNIEXPORT jobject JNICALL Java_edu_whu_hytra_core_NativeTool_get
  (JNIEnv *, jobject, jstring);

/*
 * Class:     edu_whu_hytra_core_NativeTool
 * Method:    insert
 * Signature: (Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_edu_whu_hytra_core_NativeTool_insert
  (JNIEnv *, jobject, jstring, jstring);

#ifdef __cplusplus
}
#endif
#endif
