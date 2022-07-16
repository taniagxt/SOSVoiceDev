package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.Registro)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "OnPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(tag, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "OnDestroy")
    }
}

object btnRegistro {

}
