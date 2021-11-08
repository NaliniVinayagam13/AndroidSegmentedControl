package com.cvag.androidsegmentedcontrol

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rankedPlaces {

            // set initial checked segment (null by default)
            initialCheckedIndex = 0

            // init with segments programmatically without RadioButton as a child in xml
            initWithItems {
                // takes only list of strings
                listOf("Nationalwide", "Local")
            }

            // notifies when segment was checked
            onSegmentChecked { segment ->

                Toast.makeText(context, "Checked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
