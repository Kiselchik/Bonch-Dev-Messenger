package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.R

class SignInActivity : AppCompatActivity() {


    private lateinit var signInButton: Button
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_activity)
        initializeView()
        setListener()
    }

    private fun initializeView(){
        signInButton = findViewById(R.id.sign_in_button)
        signUpButton = findViewById(R.id.sign_up_button)
    }


    private fun setListener(){

        signInButton.setOnClickListener{
            val intent = Intent(this@SignInActivity,MainAppActivity::class.java)
            startActivity(intent)

        }

        signUpButton.setOnClickListener{
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }


}
