package com.noureddine10kh.tic_tac_toe_home_work_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.noureddine10kh.tic_tac_toe_home_work_2.databinding.PlayerChooseBinding

class ChoosePlayer : AppCompatActivity() {
    lateinit var binding :PlayerChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = PlayerChooseBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.playWithFriends.setOnClickListener {
            val intent = Intent(this, PlayGame::class.java)
            intent.putExtra("gameMode", friends)
            startActivity(intent)
        }

       binding.playWithAi.setOnClickListener {
            val intent = Intent(this, PlayGame::class.java)
            intent.putExtra("gameMode", AI)
            startActivity(intent)
        }
    }
}