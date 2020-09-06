package com.example.SimuladorDeCofrinho_Hessel

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(component:View){

        if(input_nome.length() == 0){
            Toast.makeText(this,"Informe seu nome :3", Toast.LENGTH_SHORT).show()
            return
        }

        if(input_meses.length() == 0){
            Toast.makeText(this,"Informe os meses :D", Toast.LENGTH_SHORT).show()
            return
        }

        if(input_guardar.length() == 0){
            Toast.makeText(this,"Informe quando de din din você vai guardar :0", Toast.LENGTH_SHORT).show()
            return
        }

        val nomeUsuario = input_nome.text.toString()
        val qtdMeses = input_meses.text.toString().toInt()
        val dindin = input_guardar.text.toString().toDouble()

        val resultado = qtdMeses * dindin

        resultado_numero.text = "R$ %.2f".format(resultado)

        resultado_tempo.text = "em %d meses".format(qtdMeses)

        if(resultado >= 0 && resultado <= 1000){
            resultado_info.text = "%s, que cofrinho mixuruca >:(".format(nomeUsuario)
            resultado_info.setTextColor(Color.RED)
        }else if(resultado >= 1001 && resultado <= 5000){
            resultado_info.text = "%s, que cofrinho top ;)".format(nomeUsuario)
            resultado_info.setTextColor(Color.GRAY)
        }else{
            resultado_info.text = "%s, cofrinho maior do que a Nick Minaj :D".format(nomeUsuario)
            resultado_info.setTextColor(Color.BLUE)
        }
    }

}