package com.shijunhong.fuckthecustomcontrols

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shijunhong.fuckthecustomcontrols.one.OneActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            startActivity(Intent(this,OneActivity::class.java))
        }

    }
}