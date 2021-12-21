package com.galaxe.personalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*


class CalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

    }

    fun addCalendarEvent(view: View) {

        val beginTime = Calendar.getInstance()
        beginTime[2021, 12, 31, 4] = 30

        val endTime = Calendar.getInstance()
        endTime[2022, 1, 1, 1] = 30

        val calendarEvent: Calendar = Calendar.getInstance()
        val intent = Intent(Intent.ACTION_EDIT)
        intent.type = "vnd.android.cursor.item/event"
        intent.putExtra("beginTime", beginTime.timeInMillis)
        intent.putExtra("allDay", true)
        intent.putExtra("rule", "FREQ=YEARLY")
        intent.putExtra("endTime", endTime.timeInMillis)
        intent.putExtra("title", "New Years Party")
        startActivity(intent)
    }
}





//class CalActivity : AppCompatActivity() {
//
//    lateinit var title : EditText
//    lateinit var location : EditText
//    lateinit var description : EditText
//    lateinit var btnAdd : Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cal)
//        title = findViewById(R.id.title)
//        location = findViewById(R.id.location)
//        description = findViewById(R.id.description)
//        btnAdd = findViewById(R.id.btnAdd)
//
//
//    }
//
//
//    fun btnAdd(view: android.view.View){
//        if (title.text.toString().isEmpty() && location.text.toString().isEmpty()
//            && description.text.toString().isEmpty()){
//
//            intent  = Intent(Intent.ACTION_INSERT)
//            intent.data = (CalendarContract.CONTENT_URI)
//            intent.putExtra(CalendarContract.Events.TITLE, title.text.toString())
//            intent.putExtra(CalendarContract.Events.EVENT_LOCATION,location.text.toString())
//            intent.putExtra(CalendarContract.Events.DESCRIPTION, description.text.toString())
//            intent.putExtra(CalendarContract.Events.ALL_DAY, "true")
////            intent.putExtra(Intent.EXTRA_EMAIL, "test@gmail.com", "tes@yahoo.com", "test@apple.com")
//
//            if(intent.resolveActivity(packageManager) != null) startActivity(this.intent) else {
//                Toast.makeText(this, "no app available", Toast.LENGTH_SHORT).show()
//            }
//
//            startActivity(intent)
//
//
//        }else {
//            Toast.makeText(this, "Please fill in all of the fields", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//}






