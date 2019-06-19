package com.github.posko.feature.splash

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.posko.toolkit.ui.delay
import javax.inject.Inject


class SplashFragment : Fragment() {

    @Inject lateinit var splashNavigation: SplashNavigation

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_splash, container, false)

        delay(5000) {
            splashNavigation.onDoneSplash(this)
        }

        return view
    }

}
