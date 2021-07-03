package com.goprojectstudio.genap

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_knowledge : ImageButton
    lateinit var btn_eduvideo : ImageButton
    lateinit var btn_sharing : ImageButton
    lateinit var btn_pik : ImageButton
    lateinit var btn_quiz : ImageButton
    lateinit var btn_pelaporan : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_knowledge = findViewById(R.id.btn_knowledge)
        btn_eduvideo = findViewById(R.id.btn_eduvideo)
        btn_sharing = findViewById(R.id.btn_sharing)
        btn_pik = findViewById(R.id.btn_pik)
        btn_quiz = findViewById(R.id.btn_quiz)
        btn_pelaporan = findViewById(R.id.btn_pelaporan)

        btn_knowledge.setOnClickListener {
            var intent = Intent(this@MainActivity, KnowledgeActivity::class.java)
            startActivity(intent)
        }
        btn_eduvideo.setOnClickListener {
            var intent = Intent(this@MainActivity, EduVideoActivity::class.java)
            startActivity(intent)
        }
        btn_sharing.setOnClickListener {
            var intent = Intent(this@MainActivity, SharingActivity::class.java)
            startActivity(intent)
        }
        btn_pik.setOnClickListener {
            var intent = Intent(this@MainActivity, PikActivity::class.java)
            startActivity(intent)
        }
        btn_quiz.setOnClickListener {
            var intent = Intent(this@MainActivity, QuizActivity::class.java)
            startActivity(intent)
        }
        btn_pelaporan.setOnClickListener {
            var intent = Intent(this@MainActivity, PelaporanActivity::class.java)
            startActivity(intent)
        }
    }

    var doubleBackToExitOnce : Boolean = false

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true
        Toast.makeText(this, "Tekan tombol kembali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}