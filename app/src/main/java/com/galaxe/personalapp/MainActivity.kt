package com.galaxe.personalapp

import android.content.Intent
import android.graphics.Color.RED
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

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
    fun choose(view: View){

        val textMessage = "This is a sample message"
        val i = Intent()
        i.action = Intent.ACTION_SEND
        i.type = "text/plain"
        i.putExtra(Intent.EXTRA_TEXT, textMessage)

        // an intent chooser to force a choose dialog

        startActivity(Intent.createChooser(i,"Select an app:"))
    }
    fun snackbar(view: View) {
        val snackBar = Snackbar.make(view, "Hello!", Snackbar.LENGTH_INDEFINITE)
            .setAction("Dismiss") {
//                on click btn
            }
            .setActionTextColor(ContextCompat.getColor(this, R.color.red))
        val snackBarView = snackBar.view
        val txt =
            snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        snackBarView.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
        txt.setTextColor(ContextCompat.getColor(this, R.color.black))

        snackBar.show()
    }



}