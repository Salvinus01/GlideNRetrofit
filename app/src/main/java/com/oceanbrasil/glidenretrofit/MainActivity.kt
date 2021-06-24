package com.oceanbrasil.glidenretrofit

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivAvatar = findViewById<ImageView>(R.id.ivAvatar)

        Glide.with(this).load("https://super.abril.com.br/wp-content/uploads/2001/06/afinal-o-que-ecc81-amor.jpeg").into(ivAvatar)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(GitHubService::class.java)
        val repos: Call<List<Repo?>?>? = service.listRepos("octocat")

        repos?.enqueue(
            object : Callback<List<Repo?>?> {
                override fun onResponse(
                    call: Call<List<Repo?>?>,
                    response: Response<List<Repo?>?>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<List<Repo?>?>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            }
        )



    }
}