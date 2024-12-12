package com.example.viewpagermy2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewpagermy2.R
import com.example.viewpagermy2.utils.DataManager

class AddFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        val etName = view.findViewById<EditText>(R.id.etName)
        val etAge = view.findViewById<EditText>(R.id.etAge)
        val btnSave = view.findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            if (name.isNotEmpty() && age.isNotEmpty()) {
                DataManager.addData("$name, $age")
                Toast.makeText(context, "Ma'lumot saqlandi", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}