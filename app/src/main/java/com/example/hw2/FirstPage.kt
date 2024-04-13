package com.example.hw2

import android.R
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.example.hw2.databinding.FragmentFirstPageBinding
import com.google.android.material.snackbar.Snackbar


class FirstPage : Fragment() {

    private lateinit var binding: FragmentFirstPageBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstPageBinding.inflate(inflater,container, false)

        binding.add.setOnClickListener {

            val getTextView1Id = binding.editTextText
            val getTextView2Id = binding.editTextText2
            if(getTextView1Id.getText().toString().trim().equals("") || getTextView2Id.getText().toString().trim().equals(""))
            {
                Snackbar.make(it, "Fill all the blanks.", Snackbar.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }


}