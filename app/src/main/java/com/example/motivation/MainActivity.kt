package com.example.motivation

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clickSCHET (view: View){
        var her: EditText = findViewById(R.id.editTextTextPersonName)
       var  herl = her.text.toString()
       val intent: Intent = Intent(this@MainActivity,VizovActivity::class.java)
        intent.putExtra("name", herl)
// запуск SecondActivity
        startActivity(intent)


        var x: Double = (21.0+33.0)/18.0
        var y = x.toString()


        val toast = Toast.makeText(applicationContext, y, Toast.LENGTH_SHORT)

        toast.show()




    }

}




