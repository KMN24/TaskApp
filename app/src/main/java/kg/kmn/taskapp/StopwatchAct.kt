package kg.kmn.taskapp

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity

// todo task 26
class StopwatchAct : AppCompatActivity(){

    private lateinit var mStartBtn : Button
    private lateinit var mStopBtn : Button
    private lateinit var mResetBtn : Button
    private lateinit var mChronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stopwatch_layout)

        mStartBtn = findViewById(R.id.btn_start)
        mStopBtn = findViewById(R.id.btn_stop)
        mResetBtn = findViewById(R.id.btn_reset)
        mChronometer = findViewById(R.id.chronometer)

        mStopBtn.isEnabled = false
        mResetBtn.isEnabled = false

    }

    fun onClickStart(view: View) {
        mChronometer.start()
        mStartBtn.isEnabled = false
        mStopBtn.isEnabled = true
        mResetBtn.isEnabled = true
    }
    fun onClickStop(view: View) {
        mChronometer.stop()
        mStartBtn.isEnabled = true
        mStopBtn.isEnabled = false
        mResetBtn.isEnabled = true
    }
    fun onClickReset(view: View) {
        mChronometer.base = SystemClock.elapsedRealtime()
        mStartBtn.isEnabled = true
        mStopBtn.isEnabled = false
        mResetBtn.isEnabled = false
    }
}