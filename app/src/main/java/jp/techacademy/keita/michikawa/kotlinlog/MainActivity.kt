package jp.techacademy.keita.michikawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 103, hobby = "basketball")
        val human2 = Human("花子", 133, hobby = "traveling")

        human1.say()
        human1.think()
        human2.say()
        human2.think()

    }
}