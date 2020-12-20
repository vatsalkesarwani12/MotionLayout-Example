package e.vatsal.kesarwani.motionlayout_example

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View.inflate
import android.widget.ImageView
import android.widget.Toolbar

class Motion2Activity : AppCompatActivity() {

    companion object {
        fun start(context : Context) {
            context.startActivity(Intent(context, Motion2Activity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion2)
        setSupportActionBar(findViewById(R.id.toolbar1))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<ImageView>(R.id.imageView2).setOnClickListener{

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        if (item.itemId == R.id.imageView) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}