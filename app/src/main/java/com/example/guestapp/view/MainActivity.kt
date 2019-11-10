package com.example.guestapp.view
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.Toast
import com.example.guestapp.R
import com.example.guestapp.adaptor.GuestAdapter
import com.example.guestapp.model.Guest
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private val fileName = "MyGuestList4.txt"
    private var guestList = mutableListOf<Guest>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check_in_button.setOnClickListener { _ ->

            val name = name_edittext.text.toString()
            val room = room_number_edit_text.text.toString().toInt()
            val price = price_edit_text.text.toString().toInt()

            val reservation = Guest(name, room, price)

            val userIntent = Intent(this, Display_Activity::class.java)
            userIntent.putExtra("name_key", reservation)
            startActivity(userIntent)

        }

    }




}