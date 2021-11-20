package com.example.luxfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.luxfood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var foods = mutableListOf(R.drawable.orecchiette, R.drawable.penne_alla_vodka, R.drawable.spaghetti)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        populateFood()
        binding.imageView.setImageResource(R.drawable.orecchiette)
        binding.button.setOnClickListener{
            val random = (foods).shuffled().first()
            binding.imageView.setImageResource(random)
        }





    }
    private fun populateFood(){
        val food1 = Foods(
            R.drawable.orecchiette,
            "Orecchiette"
        )
        FoodList.add(food1)
        val food2 = Foods(
            R.drawable.spaghetti,
            "Spaghetti"
        )
        FoodList.add(food2)
        val food3 = Foods(
            R.drawable.penne_alla_vodka,
            "Penne Alla Vodka"
        )
        FoodList.add(food3)

    }
}