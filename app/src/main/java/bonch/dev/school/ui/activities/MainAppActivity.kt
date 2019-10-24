package bonch.dev.school.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragments
import bonch.dev.school.ui.fragments.PasswordFragments
import bonch.dev.school.ui.fragments.ProfileFragments

class MainAppActivity : AppCompatActivity() {

    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        val chatFragments = ChatFragments()
        fm.beginTransaction()
            .add(R.id.fragments, chatFragments)
            .commit()
    }

     fun toProfileFragments(){
        val profileFragments = ProfileFragments()
        fm.beginTransaction()
            .replace(R.id.fragments, profileFragments)
            .addToBackStack("profile_fragments")
            .commit()
    }

    fun toPasswordFragments(){
        val passwordFragments = PasswordFragments()
        passwordFragments.show(fm, "dialog")
    }







}
