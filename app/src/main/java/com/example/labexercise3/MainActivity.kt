package com.example.labexercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isEmpty

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.buttonCalculate).setOnClickListener{
            calPre(it)

        }

        findViewById<Button>(R.id.buttonReset).setOnClickListener {
            clear(it)
        }


    }


    private fun calPre(view: View){

        //age part
        val spinnerAge = findViewById<Spinner>(R.id.spinnerAge)
        val size = spinnerAge.selectedItemPosition + 1

        //gender
        val gen = findViewById<RadioGroup>(R.id.radioGroupGender)
        val genG = gen.checkedRadioButtonId
        val radiogen = findViewById<RadioButton>(genG)
        val valradio = radiogen.text

        //Smoke Condition

        val smokeBox = findViewById<CheckBox>(R.id.checkBoxSmoker)
        val isSmoker = smokeBox.isChecked

        var premium = 0



            textViewPremium.setText(R.string.insurance_premium)
                if( size == 1)
                {
                    premium += 60
                }
                else if (size == 2)
                {
                    premium += 70
                    if(valradio == "Male")
                    {
                        premium += 50
                    }
                    if (isSmoker)
                    {
                        premium += 100
                    }
                }

                else if (size == 3)
                {
                    premium += 90
                    if(valradio == "Male")
                    {
                        premium += 100
                    }
                    if (isSmoker)
                    {
                        premium += 150
                    }
                }
                else if (size == 4)
                {
                    premium += 120
                    if(valradio == "Male")
                    {
                        premium += 150
                    }
                    if (isSmoker)
                    {
                        premium += 200
                    }
                }
                else if (size == 5)
                {
                    premium += 150
                    if(valradio == "Male")
                    {
                        premium += 200
                    }
                    if (isSmoker)
                    {
                        premium += 250
                    }
                }
                else if (size == 6)
                {
                    premium += 150
                    if(valradio == "Male")
                    {
                        premium += 200
                    }
                    if (isSmoker)
                    {
                        premium += 300
                    }
                }
        textViewPremium.setText(textViewPremium.text.toString().plus(premium.toString()))

    }


    fun clear(view: View){
        spinnerAge.setSelection(0)
        checkBoxSmoker.isChecked = false
        radioGroupGender.check(R.id.radioButtonMale)
        textViewPremium.setText(R.string.insurance_premium)
    }
}







