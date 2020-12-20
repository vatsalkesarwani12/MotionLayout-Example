package e.vatsal.kesarwani.motionlayout_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    companion object {
        const val TIME_LIMIT = 2000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(
            Looper.getMainLooper()
        ).postDelayed({
            Motion1Activity.start(
                this
            )
        },
            TIME_LIMIT
        )

    }
}