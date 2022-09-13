package com.example.ocean_android_intro_13_e_15_09_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Detectar o clique no botão
        //Pegamos o elemento Button na tela pelo ID

       val btEnviar = findViewById<Button>(R.id.btEnviar)
        //pegamos o elemento TextView na tela, pelo ID
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

     // adicionamos um listener para o btEnviar
        btEnviar.setOnClickListener {
            //tudo que escrevermos dentro deste bloco será executado
            //assim que o button for clicado
           //alterar o texto do TextView
            tvResultado.text = "Bergson O GOSTOSÃO"
        }
    }
}