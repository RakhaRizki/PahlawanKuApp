package com.example.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.belajarrecycleview.databinding.ActivityDetailsHeroBinding
import com.example.belajarrecycleview.databinding.ItemViewBinding
import com.example.belajarrecycleview.model.dataHeroes
import kotlin.math.log

class DetailsHeroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsHeroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<dataHeroes>( "DATA")

        Glide.with(this)
            .load(data!!.image)
            .into(binding.imgProfile)

        binding.tvName.text = data?.name
        binding.tvDescription.text = data?.description

        }
    }
