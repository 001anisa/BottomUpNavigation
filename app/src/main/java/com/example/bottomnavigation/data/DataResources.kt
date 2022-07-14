package com.example.bottomnavigation.data


import com.example.bottomnavigation.R
import com.example.bottomnavigation.model.Banner

class DataResources {
        fun loadBanners(): List<Banner> {
            return listOf<Banner>(
                Banner(R.string.Name,R.string.Price,R.drawable.banner1),
                Banner(R.string.Name,R.string.Price,R.drawable.banner2),
                Banner(R.string.Name,R.string.Price,R.drawable.banner3),
                Banner(R.string.Name,R.string.Price,R.drawable.banner4),
                Banner(R.string.Name,R.string.Price,R.drawable.banner5)


            )
        }
    }
