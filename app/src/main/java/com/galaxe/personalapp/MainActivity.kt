package com.galaxe.personalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel: " + "7326486107")
        startActivity(dialIntent)
    }
    fun calendar (view: View) {

        intent = Intent(this, CalActivity::class.java)
        startActivity(intent)
    }

}