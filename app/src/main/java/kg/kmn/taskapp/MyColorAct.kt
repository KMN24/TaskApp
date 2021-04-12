package kg.kmn.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// todo task 27
class MyColorAct : AppCompatActivity() {
    private lateinit var mShowColorTV : TextView
    private lateinit var mRootLayout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_color)
        mShowColorTV = findViewById(R.id.tv_showColor)
        mRootLayout = findViewById(R.id.root_layout)
    }

    fun onClickChangeBackgrndToRed(view: View) {
        mShowColorTV.text = getString(R.string.red)
        mRootLayout.background = getDrawable(R.color.colorRed)
    }
    fun onClickChangeBackgrndToYellow(view: View) {
        mShowColorTV.text = getString(R.string.yellow)
        mRootLayout.background = getDrawable(R.color.colorYellow)
    }
    fun onClickChangeBackgrndToGreen(view: View) {
        mShowColorTV.text = getString(R.string.green)
        mRootLayout.background = getDrawable(R.color.colorGreen)}
}