package com.NovalinaPutri.tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtName: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnloginpage: Button
    private lateinit var btnlistview: Button
    private lateinit var btnrecycle: Button
    private lateinit var btnrecylebuah: Button
    private lateinit var btnmovie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        txtPassword = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnloginpage = findViewById(R.id.btnloginpage)
        btnlistview = findViewById(R.id.btnlistview)
        btnrecycle = findViewById(R.id.btnrecycle)
        btnrecylebuah = findViewById(R.id.btnrecyclebuah)
        btnmovie = findViewById(R.id.btnmovie)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnmovie.setOnClickListener() {
            val intent = Intent(this@MainActivity, MovieActivity::class.java)
            startActivity(intent)
        }

        btnloginpage.setOnClickListener() {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }
        btnlistview.setOnClickListener() {
            val intent = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intent)
        }
        btnrecylebuah.setOnClickListener() {
            val intent = Intent(this@MainActivity, RecyleBuahImageActivity::class.java)
            startActivity(intent)
        }
        btnrecycle.setOnClickListener() {
            val intent = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intent)
        }




                btnLogin.setOnClickListener {
                    val Name = txtName.text.toString()
                    val password = txtPassword.text.toString()

                    if (Name == "nova" && password == "123456") {
                        val intent = Intent(this, MainActivity2::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            this,
                            "username atau password salah",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                }

            }
        }



