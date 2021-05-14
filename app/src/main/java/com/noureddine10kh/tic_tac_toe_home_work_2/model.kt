package com.noureddine10kh.tic_tac_toe_home_work_2

const val PLAYER1 = 'x'
const val PLAYER2 = 'o'
const val AI = 'o'
var friends = PLAYER1
const val NOTHING = -1
const val AI_WIN = 1
const val PLAYER1_WIN = -10
const val PLAYER2_WIN = 0
const val DRAW = 5

enum class GameMode{
    PLAY_WITH_FRIENDS,PLAY_WITH_AI
}


val board : Array<CharArray> = arrayOf(
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_'),
    charArrayOf('_','_','_')
)