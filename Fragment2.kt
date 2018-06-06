package com.example.rohith.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_fragment2.*


class Fragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment2, container, false)
        val next1 = view.findViewById<Button>(R.id.next1)
        next1.setOnClickListener {
            val fragment3 = Fragment3()
                 this@Fragment2.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragment3)?.commit()
        }
        val end1 = view.findViewById<Button>(R.id.end1)
        end1.setOnClickListener {
            val fragmentend = Fragmentend()
            this@Fragment2.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragmentend)?.commit()
        }
        return view
    }
}
