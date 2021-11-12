package com.luzmag.programacionmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onActivity(view: View) {
        val intento = Intent(this,SaleRegister::class.java)
        startActivity(intento)
    }
}