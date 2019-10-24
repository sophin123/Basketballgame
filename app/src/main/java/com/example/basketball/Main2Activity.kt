package com.example.basketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : BaseActivity() {
    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false
        selectedleague = "Mens"
    }

    fun onWomensClicked(view: View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        selectedleague = "Womens"
    }

    fun onCoedClicked(view:View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false
        selectedleague = "Co-Ed"
    }

    fun leaguetoskill(view: View){
        if(selectedleague != ""){
            val skillintent = Intent(this, SkillActivity::class.java)
            skillintent.putExtra(EXTRA_CONSTANT, selectedleague)
            startActivity(skillintent)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }


    }



}
