package com.example.userinteractions

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var toastButton : Button
    lateinit var snackBar : Button
    lateinit var layout : ConstraintLayout
    lateinit var dialog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton = findViewById(R.id.toastButton)
        snackBar = findViewById(R.id.snackbarMessage)
        layout = findViewById(R.id.myLayout)
        dialog = findViewById(R.id.dialogButton)

        toastButton.setOnClickListener {
            Toast.makeText(applicationContext,"This is testing toast message",Toast.LENGTH_LONG).show()
            //parameter 1 - applicationContext, this (only in the same method), this@MainActivity
            //Para 2 - the actual message
            //Para 3 - duration of message
        }

        snackBar.setOnClickListener {
            Snackbar.make(layout,"This is a snackbar message,So close it!",Snackbar.LENGTH_SHORT)
                .setAction("CLOSE", View.OnClickListener {

                }).show()
        }

        dialog.setOnClickListener {

            showAlertDialog()

        }
    }

    fun showAlertDialog(){
        var alert = AlertDialog.Builder(this@MainActivity)

        alert.setTitle("Change")
            .setMessage("Do you want to Change the text of the Button?")
            .setIcon(R.drawable.baseline_brush_24)
            .setCancelable(false)
            .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, which ->
                dialogInterface.cancel() //when user selects No , we close dialog
            })
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, which ->
                dialog.text = " This is Changed Text!"
            })

        alert.create().show() // creating the alert and displaying
    }
}