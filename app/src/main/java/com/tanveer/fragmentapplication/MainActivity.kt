package com.tanveer.fragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tanveer.fragmentapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     var binding: ActivityMainBinding? = null
    var number = 0
    lateinit var activityInterface: ActivityInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
       binding?.btnRed?. setOnClickListener{
           activityInterface.changeColor(1)
       }
        binding?.btnGreen?.setOnClickListener{
            activityInterface.changeColor(2)
        }
        binding?.btnBlue?.setOnClickListener{
            activityInterface.changeColor(3)
        }
    }
    fun incrementNumber(){
        number++
        binding?.btnNumber?.setText(number.toString())
    }
    fun decrementNumber(){
        number--
        binding?.btnNumber?.setText(number.toString())
    }
    fun resetNumber(){
        number=0
        binding?.btnNumber?.setText(number.toString())
    }

}