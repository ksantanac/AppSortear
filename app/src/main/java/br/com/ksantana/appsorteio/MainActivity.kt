package br.com.ksantana.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Btn", "Um número foi sorteado")
    }
    // Função para o botão clicado
    fun sortearNumero(view: View) {

        // Encontrar  o textvieqw com id textresultado no layout
        val texto = findViewById<TextView>(R.id.textView)

        // Gerando numero aleatorio entre 0 e 10
        val numero = Random().nextInt(11)

        // Define o txto do texview para mostrar i numero sorteado
        texto.text = "Número: $numero"

    }

}