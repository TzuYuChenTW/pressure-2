package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Diet_food7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_food7)

        //設定隱藏標題
        getSupportActionBar()?.hide();
        val back3 = findViewById<ImageButton>(R.id.back3)

        //食物名稱
        val foodname = findViewById<TextView>(R.id.foodname)
        foodname.text = "巧克力"
        //營養成分
        val Element = findViewById<TextView>(R.id.Element)
        Element.text = "富含有可可和多酚等成分"

        //功效
        val effect = findViewById<TextView>(R.id.effect)
        effect.text = "有助於減輕焦慮和壓力"

        back3.setOnClickListener {
            finish()
        }
    }
}