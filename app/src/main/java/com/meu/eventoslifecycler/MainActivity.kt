package com.meu.eventoslifecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycler","CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycler","START")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycler","RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycler","PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycler","STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycler","DESTRUI")
    }

}