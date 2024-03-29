package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity

class ProfileFragments: androidx.fragment.app.Fragment() {

    private lateinit var changePassword: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        changePassword = view.findViewById(R.id.change_password)
        setListener()

        return view
    }


    private fun setListener(){
        changePassword.setOnClickListener{
            (context as MainAppActivity).toPasswordFragments()
        }
    }
}