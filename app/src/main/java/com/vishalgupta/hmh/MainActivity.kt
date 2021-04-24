package com.vishalgupta.hmh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishalgupta.deviceutils.DeviceUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model.text = DeviceUtils.getModelNumber() +" - "+ DeviceUtils.getPhoneName()
    }

}