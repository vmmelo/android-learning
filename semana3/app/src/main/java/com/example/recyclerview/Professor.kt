package com.example.recyclerview

class Professor(val nome:String, val login:String) {
    val site:String = "https://www.cin.ufpe.br/~$login"
    val email = "$login@cin.ufpe.br"
}