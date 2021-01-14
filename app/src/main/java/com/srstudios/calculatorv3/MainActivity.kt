package com.srstudios.calculatorv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


   public fun butNumberevent(view:View){//event for all number pads

        val buselect= view as Button
       if(isnewop){
           editshow.setText("")
       }
       isnewop=false
        var buclickvalue: String =editshow.text.toString()
        when(buselect.id){
            bu0.id->{
                buclickvalue+="0"
            }
            bu1.id->{
                buclickvalue+="1"
            }
            bu2.id->{
                buclickvalue+="2"
            }
            bu3.id->{
                buclickvalue+="3"
            }
            bu4.id->{
                buclickvalue+="4"
            }
            bu5.id->{
                buclickvalue+="5"
            }
            bu6.id->{
                buclickvalue+="6"
            }
            bu7.id->{
                buclickvalue+="7"
            }
            bu8.id->{
                buclickvalue+="8"
            }
            bu9.id->{
                buclickvalue+="9"
            }
            bupm.id->{
                buclickvalue ="-"+buclickvalue
            }
            budot.id->{
                buclickvalue+="."
            }


        }
       editshow.setText(buclickvalue)//this line shows the total value of buclickvalue

    }

    var op="+"
    var oldnum=""
    var isnewop=true
    //event for all operation buttons
    fun buopevent(view :View){
        val buselect= view as Button
        when(buselect.id){
            budiv.id->{
                op="/"
            }
            bumul.id->{
                op="*"
            }
            buadd.id->{
                op="+"
            }
            busub.id->{
                op="-"
            }
        }
        oldnum=editshow.text.toString()
        isnewop=true

    }
    //event for equal button
    fun buequalfun(view :View){
        val newnumber=editshow.text.toString()
        var res:Double?=null
        when(op){
            "/"->{
                res=oldnum.toDouble()/ newnumber.toDouble()
            }
            "*"->{
                res=oldnum.toDouble()* newnumber.toDouble()
            }
            "+"->{
                res=oldnum.toDouble()+ newnumber.toDouble()            }
            "-"->{
                res=oldnum.toDouble()- newnumber.toDouble()            }

        }
        editshow.setText(res.toString())
        isnewop=true

    }
    //event for percentage button
    fun buparchent(view :View){
        val number:Double=editshow.text.toString().toDouble()/100
        editshow.setText(number.toString())
    }
    //evert for AC button
    fun clearac(view :View){
        editshow.setText("0")
        isnewop=true
    }


}






























