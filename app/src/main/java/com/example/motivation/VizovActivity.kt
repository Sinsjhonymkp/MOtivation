package com.example.motivation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_vizov.*

class VizovActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vizov)

        val arguments: Bundle? = intent.extras
// проверка arguments на null
     if (arguments != null) {
            // получение значение с ключом "hello" из arguments
            val name: String = arguments.get("name").toString()
            textView2.text = "Name: $name"


        }
        }

    fun OnClick(view: View) {
        val intent: Intent = Intent(this@VizovActivity, MainActivity::class.java)
         startActivity(intent)
    }

}
