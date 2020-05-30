package com.suyash.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Burger King", "McDonalds", "Pizza", "Italian")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        foodname.text = "Burger King"
        decidebtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            foodname.text = foodList[randomFood]
        }

        addbtn.setOnClickListener{
            val newFood = addfood.text.toString()
            if (newFood.isNotEmpty()){
                foodList.add(newFood)
            }
            addfood.text.clear()
        }
    }
}
