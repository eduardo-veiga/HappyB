package com.example.happyb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nuvem : View = findViewById(R.id.nuvem)
        val sol : View = findViewById(R.id.sol)
        val happy : View = findViewById(R.id.happy)


        nuvem.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Nuvem::class.java)
            startActivity(intent)
        })

        sol.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Sol2::class.java)
            startActivity(intent)
        })

        happy.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Happy::class.java)
            startActivity(intent)
        })

    }
}