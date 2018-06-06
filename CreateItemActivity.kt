package com.example.rohith.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_create_item.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_fragment1.*


class CreateItemActivity : AppCompatActivity(),
        Fragment1.myinterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val message =intent.getStringExtra("message");
        setContentView(R.layout.activity_create_item)
//        val txtView = text1
//        text1.setText(message);
            var countDownTimer :Long =180000
            object : CountDownTimer(countDownTimer, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                        if(millisUntilFinished/1000-((millisUntilFinished/60000)*60)>=10) {
                            mTextField.text = "min remaining: " + (millisUntilFinished / 60000) + ":" + (millisUntilFinished / 1000 - ((millisUntilFinished / 60000) * 60))
                        }
                    else
                        {
                            mTextField.text = "min remaining: " + (millisUntilFinished / 60000) + ":" + 0+ (millisUntilFinished / 1000 - ((millisUntilFinished / 60000) * 60))
                        }
                }

                override fun onFinish() {
                    mTextField.setText("done!")
                }
            }.start()
        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().add(R.id.frag1, fragment1).commit()
    }
    override fun onButtonClick(text: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun onStartCick() {
        Toast.makeText(this, "Start Quiz", Toast.LENGTH_SHORT).show()
    }
}