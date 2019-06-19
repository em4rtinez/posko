package net.nueca.posko.app.navigations

import android.content.Intent
import com.github.posko.feature.login.LoginActivity
import com.github.posko.feature.splash.SplashFragment
import com.github.posko.feature.splash.SplashNavigation

/**
 * Created by edwinmartinez on June 20, 2019
 */
class SplashNavigationProvider : SplashNavigation {

    override fun onDoneSplash(fragment: SplashFragment) {
        val activity = fragment.activity!!
        val intent = Intent(activity, LoginActivity::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
}