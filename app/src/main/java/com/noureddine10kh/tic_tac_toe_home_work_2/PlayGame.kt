package com.noureddine10kh.tic_tac_toe_home_work_2

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.noureddine10kh.tic_tac_toe_home_work_2.databinding.GamePlayBinding
import com.noureddine10kh.tic_tac_toe_home_work_2.databinding.PlayerChooseBinding
import java.util.*

class PlayGame : AppCompatActivity(),View.OnClickListener {

    lateinit var gameBinding : GamePlayBinding
    lateinit var gameMode: GameMode
    var currentPlayer = PLAYER1
    var scoreXPlayer = 0
    var scoreOPlayer = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        gameBinding = GamePlayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(gameBinding.root)
        back()

        if (intent.extras != null) {
            when (intent.extras!!["gameMode"]) {
                AI -> {
                    gameMode = GameMode.PLAY_WITH_AI
                    gameBinding.player2.text = "AI: $scoreOPlayer"
                    gameBinding.player1.text = "PLAYER1: $scoreXPlayer"
                }
                friends -> {
                    gameMode = GameMode.PLAY_WITH_FRIENDS
                    gameBinding.player2.text = "PLAYER2: $scoreOPlayer"
                    gameBinding.player1.text = "PLAYER1: $scoreXPlayer"
                }
            }
        }
        gameBinding.btn1.setOnClickListener(this)
        gameBinding.btn2.setOnClickListener(this)
        gameBinding.btn3.setOnClickListener(this)
        gameBinding.btn4.setOnClickListener(this)
        gameBinding.btn5.setOnClickListener(this)
        gameBinding.btn6.setOnClickListener(this)
        gameBinding.btn7.setOnClickListener(this)
        gameBinding.btn8.setOnClickListener(this)
        gameBinding.btn9.setOnClickListener(this)
        gameBinding.resetBtn.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        when(view?.id){
            R.id.reset_btn -> reset(board)
            else -> playGame(view?.id,currentPlayer)
        }
    }

    private fun reset(board: Array<CharArray>) {

        for (row in 0..2){
            for (col in 0..2){
                board[row][col] = '_'
            }
        }

        gameBinding.btn1.text = ""
        gameBinding.btn1.isEnabled = true
        gameBinding.btn2.text = ""
        gameBinding.btn2.isEnabled = true
        gameBinding.btn3.text = ""
        gameBinding.btn3.isEnabled = true
        gameBinding.btn4.text = ""
        gameBinding.btn4.isEnabled = true
        gameBinding.btn5.text = ""
        gameBinding.btn5.isEnabled = true
        gameBinding.btn6.text = ""
        gameBinding.btn6.isEnabled = true
        gameBinding.btn7.text = ""
        gameBinding.btn7.isEnabled = true
        gameBinding.btn8.text = ""
        gameBinding.btn8.isEnabled = true
        gameBinding.btn9.text = ""
        gameBinding.btn9.isEnabled = true
    }

    private fun playGame(id: Int?, player: Char?) {
        when(id){
            R.id.btn_1->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn1.text = "X"
                        board[0][0] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn1.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn1.isEnabled = false
                    }else{
                        gameBinding.btn1.text = "O"
                        board[0][0] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn1.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn1.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn1.text = "X"
                        board[0][0] = 'x'
                        currentPlayer = AI
                        gameBinding.btn1.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn1.isEnabled = false
                    }
                }
            }
            R.id.btn_2->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn2.text = "X"
                        board[0][1] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn2.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn2.isEnabled = false
                    }else{
                        gameBinding.btn2.text = "O"
                        board[0][1] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn2.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn2.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn2.text = "X"
                        board[0][1] = 'x'
                        currentPlayer = AI
                        gameBinding.btn2.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn2.isEnabled = false
                    }
                }
            }
            R.id.btn_3->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn3.text = "X"
                        board[0][2] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn3.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn3.isEnabled = false
                    }else{
                        gameBinding.btn3.text = "O"
                        board[0][2] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn3.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn3.isEnabled = false
                    }
                }else{
                    if(player == PLAYER1){
                        gameBinding.btn3.text = "X"
                        board[0][2] = 'x'
                        currentPlayer = AI
                        gameBinding.btn3.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn3.isEnabled = false

                    }
                }
            }
            R.id.btn_4->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn4.text = "X"
                        board[1][0] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn4.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn4.isEnabled = false
                    }else{
                        gameBinding.btn4.text = "O"
                        board[1][0] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn4.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn4.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn4.text = "X"
                        board[1][0] = 'x'
                        currentPlayer = AI
                        gameBinding.btn4.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn4.isEnabled = false
                    }
                }
            }
            R.id.btn_5->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn5.text = "X"
                        board[1][1] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn5.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn5.isEnabled = false
                    }else{
                        gameBinding.btn5.text = "O"
                        board[1][1] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn5.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn5.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn5.text = "X"
                        board[1][1] = 'x'
                        currentPlayer = AI
                        gameBinding.btn5.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn5.isEnabled = false
                    }
                }
            }
            R.id.btn_6->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn6.text = "X"
                        board[1][2] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn6.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn6.isEnabled = false
                    }else{
                        gameBinding.btn6.text = "O"
                        board[1][2]  = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn6.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn6.isEnabled = false

                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn6.text = "X"
                        board[1][2]  = 'x'
                        currentPlayer = AI
                        gameBinding.btn6.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn6.isEnabled = false
                    }
                }
            }
            R.id.btn_7->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn7.text = "X"
                        board[2][0] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn7.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn7.isEnabled = false
                    }else{
                        gameBinding.btn7.text = "O"
                        board[2][0] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn7.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn7.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn7.text = "X"
                        board[2][0] = 'x'
                        currentPlayer = AI
                        gameBinding.btn7.setTextColor(Color.parseColor("#FF0000"))
                    }
                }
            }
            R.id.btn_8->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn8.text = "X"
                        board[2][1] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn8.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn8.isEnabled = false
                    }else{
                        gameBinding.btn8.text = "O"
                        board[2][1] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn8.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn8.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn8.text = "X"
                        board[2][1] = 'x'
                        currentPlayer = AI
                        gameBinding.btn8.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn8.isEnabled = false
                    }
                }
            }
            R.id.btn_9->{
                if(gameMode==GameMode.PLAY_WITH_FRIENDS){
                    if(player== PLAYER1){
                        gameBinding.btn9.text = "X"
                        board[2][2] = 'x'
                        currentPlayer = PLAYER2
                        gameBinding.btn9.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn9.isEnabled = false
                    }else{
                        gameBinding.btn9.text = "O"
                        board[2][2] = 'o'
                        currentPlayer = PLAYER1
                        gameBinding.btn9.setTextColor(Color.parseColor("#FFFF00"))
                        gameBinding.btn9.isEnabled = false
                    }
                }else{
                    if(player== PLAYER1){
                        gameBinding.btn9.text = "X"
                        board[2][2] = 'x'
                        currentPlayer = AI
                        gameBinding.btn9.setTextColor(Color.parseColor("#FF0000"))
                        gameBinding.btn9.isEnabled = false
                    }
                }
            }
        }

        checkWinner(board)
        aIMove(board,currentPlayer)
    }

    private fun checkWinner(board: Array<CharArray>) {
        if(evaluate(board)!=NOTHING) {
            when(evaluate(board)){
                PLAYER1_WIN ->{
                    scoreXPlayer++
                    Toast.makeText(this,"PLAYER 1 WIN !", Toast.LENGTH_SHORT).show()
                    gameBinding.player1.text = "PLAYER1: $scoreXPlayer"
                    reset(board)
                }
                PLAYER2_WIN ->{
                    scoreOPlayer++
                    Toast.makeText(this,"PLAYER 2 WIN !", Toast.LENGTH_SHORT).show()
                    gameBinding.player2.text = "PLAYER2: $scoreOPlayer"
                    reset(board)
                }
                AI_WIN ->{
                    scoreOPlayer++
                    Toast.makeText(this,"AI WIN !", Toast.LENGTH_SHORT).show()
                    gameBinding.player2.text = "AI: $scoreOPlayer"
                    reset(board)
                }
                DRAW ->{
                    Toast.makeText(this,"DRAW !", Toast.LENGTH_SHORT).show()
                    reset(board)
                }
            }
        }
    }

    private fun aIMove(board: Array<CharArray>,player: Char?){
        if(player== AI && gameMode==GameMode.PLAY_WITH_AI){
            simpleAi(board)
        }
    }

    private fun evaluate(board: Array<CharArray>):Int{

        // Checking for Rows for X or O victory

        for (row in 0..2) {
            if (board[row][0] == PLAYER1 && board[row][1] == PLAYER1 && board[row][2] == PLAYER1) {
                return PLAYER1_WIN
            } else if (board[row][0] == PLAYER2 && board[row][1] == PLAYER2 && board[row][2] == PLAYER2 && gameMode==GameMode.PLAY_WITH_FRIENDS) {
                return PLAYER2_WIN
            } else if (board[row][0] == AI && board[row][1] == AI && board[row][2] == AI) {
                return AI_WIN
            }
        }


        // Checking for Columns for X or O victory

        for (col in 0..2) {
            // check if empty cell
            if (board[0][col] == PLAYER1 && board[1][col] == PLAYER1 && board[2][col] == PLAYER1) {
                return PLAYER1_WIN
            } else if (board[0][col] == PLAYER2 && board[1][col] == PLAYER2 && board[2][col] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
                return PLAYER2_WIN
            } else if (board[0][col] == AI && board[1][col] == AI && board[2][col] == AI) {
                return AI_WIN
            }

        }

        // Checking for Diagonals for X or O victory.
        if (board[0][0] == PLAYER1 && board[1][1] == PLAYER1 && board[2][2] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][0] == PLAYER2 && board[1][1] == PLAYER2 && board[2][2] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][0] == AI && board[1][1] == AI && board[2][2] == AI) {
            return AI_WIN
        }


        // Checking for Diagonals for X or O victory.
        if (board[0][2] == PLAYER1 && board[1][1] == PLAYER1 && board[2][0] == PLAYER1) {
            return PLAYER1_WIN
        } else if (board[0][2] == PLAYER2 && board[1][1] == PLAYER2 && board[2][0] == PLAYER2&&gameMode==GameMode.PLAY_WITH_FRIENDS) {
            return PLAYER2_WIN
        } else if (board[0][2] == AI && board[1][1] == AI && board[2][0] == AI) {
            return AI_WIN
        }

        if(!isSpotAvailable(board)){
            return DRAW
        }

        return NOTHING

    }

    private fun isSpotAvailable(board: Array<CharArray>): Boolean {
        for(row in 0..2){
            for (col in 0..2){
                if(board[row][col]=='_'){
                    return true
                }
            }
        }
        return false
    }

    private fun simpleAi(board: Array<CharArray>) {
        val availableSpot = getAvailableSpot(board)
        // is spot available
        if(availableSpot.size>0){
            val random = Random()
            val move = random.nextInt(availableSpot.size)
            val row = availableSpot[move][0]
            val col = availableSpot[move][1]

            if(row==0&&col==0){
                gameBinding.btn1.text = "O"
                gameBinding.btn1.isEnabled = false
                board[0][0] = AI
                gameBinding.btn1.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==0&&col==1){
                gameBinding.btn2.text = "O"
                gameBinding.btn2.isEnabled = false
                board[0][1] = AI
                gameBinding.btn2.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==0&&col==2){
                gameBinding.btn3.text = "O"
                gameBinding.btn3.isEnabled = false
                board[0][2] = AI
                gameBinding.btn3.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==1&&col==0){
                gameBinding.btn4.text = "O"
                gameBinding.btn4.isEnabled = false
                board[1][0] = AI
                gameBinding.btn4.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==1&&col==1){
                gameBinding.btn5.text = "O"
                gameBinding.btn5.isEnabled = false
                board[1][1] = AI
                gameBinding.btn5.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }else if(row==1&&col==2){
                gameBinding.btn6.text = "O"
                gameBinding.btn6.isEnabled = false
                board[1][2] = AI
                gameBinding.btn6.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==0){
                gameBinding.btn7.text = "O"
                gameBinding.btn7.isEnabled = false
                board[2][0] = AI
                gameBinding.btn7.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==1){
                gameBinding.btn8.text = "O"
                gameBinding.btn8.isEnabled = false
                board[2][1] = AI
                gameBinding.btn8.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }
            else if(row==2&&col==2){
                gameBinding.btn9.text = "O"
                gameBinding.btn9.isEnabled = false
                board[2][2] = AI
                gameBinding.btn9.setTextColor(Color.parseColor("#FFFF00"))
                currentPlayer = PLAYER1
            }

            checkWinner(board)

        }

    }

    private fun getAvailableSpot(board: Array<CharArray>) : ArrayList<Array<Int>> {
        val availableSpot : ArrayList<Array<Int>> = arrayListOf()
        for (row in 0..2){
            for (col in 0..2){
                if(board[row][col]=='_'){
                    availableSpot.add(arrayOf(row,col))
                }
            }
        }
        return availableSpot
    }

    private fun back() {
        gameBinding.back.setOnClickListener {
            finish()
        }
    }


}