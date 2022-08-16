package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       findViewById<Button>(R.id.btn_txt).setOnClickListener{
           addNickName(it)
        }

    }
    private fun addNickName(view:View){
        val editNickNameTxt: EditText =findViewById(R.id.nickname_id_edit);
        val nickNameTxt: TextView =findViewById(R.id.nick_name_txt);

       nickNameTxt.text= editNickNameTxt.text
        editNickNameTxt.visibility = View.GONE
        view.visibility = View.GONE
        nickNameTxt.visibility = View.VISIBLE

        (getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager).hideSoftInputFromWindow(view.windowToken,0)

    }
}