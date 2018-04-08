package com.example.lucas.notas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCalcular (view: View)
    {
        val editTextNota1= findViewById<View>(R.id.editTextPrimeiraNota) as EditText
        val nota1ComPeso= editTextNota1.text.toString().toFloat() *3

        val editTextNota2= findViewById<View>(R.id.editTextSegundaNota) as EditText
        val nota2ComPeso= editTextNota2.text.toString().toFloat() *4

        val media= nota1ComPeso + nota2ComPeso
        //Toast.makeText(applicationContext, "Media= " + media, Toast.LENGTH_LONG).show()

        if (media >= 29 && media < 49)
        {
            val notaIntent= Intent(this, Main2Activity::class.java)
            notaIntent.putExtra(Main2Activity.TOTAL_MEDIA, media)
            startActivity(notaIntent)
        }
        if (media >= 49) //aprovado
            Toast.makeText(applicationContext, "Aluno aprovado! Media= " + media, Toast.LENGTH_LONG).show()
        if (media < 29)
            Toast.makeText(applicationContext, "Aluno reprovado sem direito à final! Media= " + media, Toast.LENGTH_LONG).show()
    }
}
