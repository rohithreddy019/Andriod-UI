package com.example.rohith.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragment1.*
import android.R.attr.fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


//// TODO: Rename parameter
//// arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
class Fragment1 : Fragment() {
    var activityCallback: Fragment1.myinterface? = null

    public interface myinterface {
        fun onButtonClick(text: String)
    }

//    override fun onAttach(context: Context?) {
//        super.onAttach(context)
//        try {
//            activityCallback = context as myinterface
//        } catch (e: ClassCastException) {
//            throw ClassCastException(context?.toString()
//                    + " must implement ToolbarListener")
//        }
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)
        val startquiz = view.findViewById<Button>(R.id.startquiz)
        startquiz.setOnClickListener {
            val fragment2 = Fragment2()
            //     this@Fragment1.activity?.
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragment2)?.commit()
        }
        return view
    }
}
//            }
//        val end=view.findViewById<Button>(R.id.end1)
//        end.setOnClickListener {
//            val fragmentend = Fragmentend()
//                 this@Fragment1.activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.frag1, fragmentend)?.commit()
//        }

//    }
//}

