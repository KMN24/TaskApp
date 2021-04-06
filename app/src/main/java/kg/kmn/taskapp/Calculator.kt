package kg.kmn.taskapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// todo 25th task
class Calculator : AppCompatActivity() {

    private lateinit var mNumber1 : EditText
    private lateinit var mNumber2 : EditText
    private lateinit var mResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)
        title = "Calculator"

        mNumber1 = findViewById(R.id.et_number1)
        mNumber2 = findViewById(R.id.et_number2)
        mResult = findViewById(R.id.tv_result)

    }

    fun onClickAddition(view: View) {
        if (mNumber1.text.toString().isNotEmpty() && mNumber2.text.toString().isNotEmpty()){
            mResult.text = "${mNumber1.text.toString().toFloat()} + ${mNumber2.text.toString().toFloat()} = " +
                    "${mNumber1.text.toString().toFloat() + mNumber2.text.toString().toFloat()} "
        }else{
            showToastInputAllInputs()
        }
    }
    fun onClickSubtraction(view: View) {
        if (mNumber1.text.toString().isNotEmpty() && mNumber2.text.toString().isNotEmpty()){
            mResult.text = "${mNumber1.text.toString().toFloat()} - ${mNumber2.text.toString().toFloat()} = " +
                    "${mNumber1.text.toString().toFloat() - mNumber2.text.toString().toFloat()} "
        }else{
            showToastInputAllInputs()
        }

    }
    fun onClickMultiplication(view: View) {
        if (mNumber1.text.toString().isNotEmpty() && mNumber2.text.toString().isNotEmpty()){
            mResult.text = "${mNumber1.text.toString().toFloat()} * ${mNumber2.text.toString().toFloat()} = " +
                    "${mNumber1.text.toString().toFloat() * mNumber2.text.toString().toFloat()} "
        }
        else showToastInputAllInputs()
    }

    fun onClickDivision(view: View) {
        if (mNumber1.text.toString().isNotEmpty() && mNumber2.text.toString().isNotEmpty()){

            if (mNumber2.text.toString().toFloat() != 0.0f){
                mResult.text = "${mNumber1.text.toString().toFloat()} / ${mNumber2.text.toString().toFloat()} = " +
                        "${mNumber1.text.toString().toFloat() / mNumber2.text.toString().toFloat()} "
            }else{
                mResult.text = getString(R.string.divide_by_zero)
            }
        }else{
            showToastInputAllInputs()
        }
    }

    fun showToastInputAllInputs(){
        Toast.makeText(this, "Please, enter all inputs", Toast.LENGTH_SHORT).show()
    }

}