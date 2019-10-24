package com.example.basketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getstartedBtn.setOnClickListener(){
            val secondlayout = Intent(this, Main2Activity::class.java)
            startActivity(secondlayout)
        }
    }
}
