package com.pramodk.simpleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var checkBox:CheckBox
    private lateinit var cb_addidas:CheckBox
    private lateinit var cb_nike:CheckBox
    private lateinit var cb_converse:CheckBox
    private lateinit var cb_reebok:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox = findViewById(R.id.cb_single)
        cb_addidas = findViewById(R.id.cb_addidas)
        cb_nike = findViewById(R.id.cb_nike)
        cb_converse = findViewById(R.id.cb_converse)
        cb_reebok = findViewById(R.id.cb_reebok)

        // Single checked box
        checkBox.setOnClickListener(View.OnClickListener {
            if (checkBox.isChecked) {
                message(checkBox.text.toString() + " Checked")
            } else {
                message(checkBox.text.toString() + " UnChecked")
            }
        })

    }
    // multiple checkbox click method
    fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox
        if (cb_addidas == checked) {
            message(cb_addidas.text.toString() + if (cb_addidas.isChecked) " Checked " else " UnChecked ")
        }
        if (cb_nike == checked) {
            message(cb_nike.text.toString() + if (cb_nike.isChecked) " Checked " else " UnChecked ")
        }

        if (cb_converse == checked) {
            message(cb_converse.text.toString() + if (cb_converse.isChecked) " Checked " else " UnChecked ")
        }
        if (cb_reebok == checked) {
            message(cb_reebok.text.toString() + if (cb_reebok.isChecked) " Checked " else " UnChecked ")
        }

    }
    private fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}