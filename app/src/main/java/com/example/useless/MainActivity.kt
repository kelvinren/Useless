package com.example.useless

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var usefulViewModel: UsefulViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //Initialize a RecyclerView adapater

        //Initialize the View Model


        fab.setOnClickListener { view ->
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            //    .setAction("Action", null).show()
            val intent = Intent(this, AddActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                //Save a useful record to the database
                Toast.makeText(this, "Record saved", Toast.LENGTH_SHORT).show()
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object{
        const val REQUEST_CODE = 1
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
