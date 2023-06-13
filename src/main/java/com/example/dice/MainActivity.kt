package com.example.dice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            Toast.makeText(this,"Dice rolled",Toast.LENGTH_SHORT).show()
            rolldice()
        }


    }

private fun rolldice() {



    val drawableResource = when(Random().nextInt(6) + 1)
    {
        1->R.drawable.dice_1
        2->R.drawable.dice_2
        3->R.drawable.dice_3
        4->R.drawable.dice_4
        5->R.drawable.dice_5
        else ->R.drawable.dice_6
    }


    val diceImage : ImageView=findViewById((R.id.dice_image))
    diceImage.setImageResource(drawableResource)

}
}