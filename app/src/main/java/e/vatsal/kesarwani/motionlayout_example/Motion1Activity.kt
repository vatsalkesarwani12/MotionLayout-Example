package e.vatsal.kesarwani.motionlayout_example

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Motion1Activity : AppCompatActivity() {

    companion object {
        fun start(context : Context) {
            context.startActivity(Intent(context, Motion1Activity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion1)

        findViewById<FloatingActionButton>(R.id.floatingActionButton).setOnClickListener{

            Motion2Activity.start(
                this
            )

        }
    }
}