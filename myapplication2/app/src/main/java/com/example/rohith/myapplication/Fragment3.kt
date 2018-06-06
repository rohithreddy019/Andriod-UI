package com.example.rohith.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_fragment3, container, false)
        val prev2 = view.findViewById<Button>(R.id.prev2)
        prev2.setOnClickListener {
            val fragment2 = Fragment2()
            this@Fragment3.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragment2)?.commit()
        }
        val next2 = view.findViewById<Button>(R.id.next2)
        next2.setOnClickListener {
            val fragment4 = Fragment4()
            this@Fragment3.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragment4)?.commit()
        }
        val end1 = view.findViewById<Button>(R.id.end2)
        end1.setOnClickListener {
            val fragmentend = Fragmentend()
            this@Fragment3.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragmentend)?.commit()
        }
        return view
    }
}
