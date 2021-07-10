package com.hllbr.globalscope_runbloking_kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Scope == Kapsam == bir kod bloku içerisinde bir tanımlama yapıldıysa başka bir kod bloku içersinde kapsamda/bağlantıda değildir.
        GlobalScope uygulamanın kendisinde yani bütün uygulamada application içerisinde çalıştırabileceğimiz bir bir kapsamda açıyor corputines
        Bu çok fazla karşılaşılan bir durum değil bir noktada veri çekilir ve işlem yapılacaksa yapılır genelde

        runBloking == coroutinesler için bir scope oluşturuyor fakat bloklayarak oluşturuyor.
        runBloking geldiğinde işlemlerin çalışmasını durduruyor.
        Bunu kullanmak  herzaman mantıklı olmayabilir.


        ***Genelde CoroutinesScope olarak ifade edilen bir yapıyı kullanırız
        Bu yapıda bir scope oluşturuyor içerisindeki tüm coroutines bitene kadar çalışmaya devam ediyor.

        Bu yapıyı uygulamak için daha önceden belirlenmesi gereken durumlar bulunuyor.


        println("run bloking start")
        runBlocking {
            launch {
                //yeni bir coroutines başlatıp içerisinde bulunduğumuz güncel thread neyse onu bloklamaz.
                delay(5000)
                println("run bloking")
            }
        }
        //run bloking aradaki işlem bitene kadar alt kısımları blokluyor
        println("run bloking end")

         */
        println("globalScope start")
        GlobalScope.launch {
            delay(6000)
            println("GlobalScope")
        }
        //GlobalScope main thredleri bloklamadan işlemi gerçekleştiriyor.
        println("globalScope end")
    }
}