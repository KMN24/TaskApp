package kg.kmn.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun onClickOpenCalcAct(view: View) {
        // Open calculator activity, in short I will do 25th Task
        val intent = Intent(this, Calculator::class.java)
        startActivity(intent)

    }
}