package com.example.appandroidrequisicoesapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appandroidrequisicoesapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        Toast.makeText(applicationContext, "Clicou!", Toast.LENGTH_SHORT).show()
    }
}