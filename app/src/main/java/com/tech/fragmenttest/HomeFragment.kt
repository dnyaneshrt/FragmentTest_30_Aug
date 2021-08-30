package com.tech.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.home_frag.view.*

//1. create a class as a child of androidx.fragment.app.Fragment
class HomeFragment:Fragment() {

    //2. same like onCreate() method in MainActivity ,in fragment onCreateView() method invoked

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //inlflate the fragment xml file using LayoutInflater
     var view= inflater.inflate(R.layout.home_frag,container,false)

        view.btn_click.setOnClickListener {
            Toast.makeText(activity,"clicked",Toast.LENGTH_SHORT).show()
        }
     return view


    }
}