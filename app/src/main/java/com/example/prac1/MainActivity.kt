package com.example.prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Darío Huallpa 10A
 * Práctica 1
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesyconstantes()
        tiposdedatos()

    }//Fin fun onCreate

    private fun variablesyconstantes(){
        var datos = "Primera variable"
        var datos2 = "Segunda variable"
        println(datos)
        println(datos2)

        //Constantes
        val datosC = "Primera constante"
        val datosC2 = datosC

        println(datosC)
        println(datosC2)

    }//Fin fun variablesyconstantes

    private fun tiposdedatos(){
        //Variables string
        var datoStr1: String = "Primer string\n" //String es redundante
        var datoStr2: String = "Segundo string"
        var datoStr3 = "$datoStr1 $datoStr2"

        println(datoStr3)

        //Entero -> Byte, Short, Int, Long
        var nint1: Int = 4 //Int es redundante
        var nint2 = 5
        var nint3 = nint1 + nint2
        println("Resultado de suma de enteros: $nint3")

        //Decimales -> Float, Double
        var ndob1: Double = 2.1 //Double es redundante
        var ndob2 = 2.2
        var nflt1:Float = 2.2f //Float es redundante
        val ndob3: Double = ndob1 + ndob2 + nflt1
        println("Resultado de double + double + float: $ndob3")

        nflt1 = (ndob1 + ndob2).toFloat() //Casting a float
        println("Resultado de double + double: $nflt1")

    }//Fin fun tiposdedatos

}//Fin class MainActivity
