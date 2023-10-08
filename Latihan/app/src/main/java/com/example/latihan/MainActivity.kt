package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinir var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)

        val usernamee = intent.getParcelableExtra<user>("user")?.username
        val password = intent.getParcelableExtra<user>("user")?.password
        tv.text = "username: $usernamee dan password : $password"

        val btnImplic: Button = findViewById(R.id.btn_implicit)
        btnImplic.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_implicit -> {
//                val message = "Halo Tes"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type= "text/plan"
//                startActivity(intent)

                val intent = Intent()
                intent.putExtra("history","Anda Sudah Login")
                setResult(RESULT_OK,intent)
                finish()

            }
        }
    }
}