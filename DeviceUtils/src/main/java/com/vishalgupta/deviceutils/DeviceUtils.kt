package com.vishalgupta.deviceutils

import android.os.Build

object DeviceUtils {
    fun getModelNumber(): String {
        return Build.MODEL
    }
    fun getPhoneName():String{
        return Build.MANUFACTURER;
    }
}