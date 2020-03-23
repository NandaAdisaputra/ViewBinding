package com.nandaadisaputra.viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nandaadisaputra.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvName.text.toString()
        binding.btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "ini study view binding", Toast.LENGTH_SHORT).show()
        }
    }
}
