package com.example.project1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val nota3 = Integer.parseInt(nota3.text.toString())
            val nota4 = Integer.parseInt(nota4.text.toString())
            val nota5 = Integer.parseInt(nota5.text.toString())
            val media = (nota1 + nota2 +nota3 + nota4 + nota5)/5
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media >=5 && faltas <=10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:"+ media+"\n" + "Faltas:"+faltas)
                resultado.setTextColor(Color .GREEN)
            }
            else {
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final:"+ media+"\n" + "Faltas:"+faltas)
                resultado.setTextColor(Color .RED)
            }
        }
    }
}