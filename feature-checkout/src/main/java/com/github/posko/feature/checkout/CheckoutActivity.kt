package com.github.posko.feature.checkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.posko.feature.base.BaseActivity
import com.github.posko.feature.base.replace

class CheckoutActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_activity)

        replace(R.id.flContainer, CheckoutFragment())
    }
}
