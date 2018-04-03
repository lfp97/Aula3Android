package com.example.lucas.notas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    companion object
    {
        const val TOTAL_MEDIA= "total_media"
    }

    fun onClickCalcularFinal (view: View)
    {
        val mediaAntiga = intent.getIntExtra(TOTAL_MEDIA, 0)
        val notaFinal= findViewById<View>(R.id.editTextNotaFinal)
        val notaFinalComPeso= notaFinal.toString().toFloat() *3
        val mediaNova= mediaAntiga + notaFinalComPeso

        if (mediaNova >= 50)
            Toast.makeText(applicationContext, "Aluno aprovado! Media= " + mediaNova, Toast.LENGTH_LONG).show()
        else
            Toast.makeText(applicationContext, "Aluno reprovado! Media= " + mediaNova, Toast.LENGTH_LONG).show()
    }
}
