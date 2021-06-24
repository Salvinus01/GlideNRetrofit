package com.oceanbrasil.glidenretrofit

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivAvatar = findViewById<ImageView>(R.id.ivAvatar)

        Glide.with(this).load("https://super.abril.com.br/wp-content/uploads/2001/06/afinal-o-que-ecc81-amor.jpeg").into(ivAvatar)

    }
}