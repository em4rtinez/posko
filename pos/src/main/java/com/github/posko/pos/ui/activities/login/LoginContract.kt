package com.github.posko.pos.ui.activities.login

interface LoginContract {

    interface Presenter {

        fun takeView(view : View)

        fun checkSession()

        fun onLoginClicked(account_name : String, email : String, password: String)

    }

    interface View {

        fun showHomeActivity()

        fun showProgress(message : String)

        fun hideProgress()

        fun showDialog(message : String)

        fun showAccountNameError(message : String)

        fun showEmailError(message: String)

        fun showPasswordError(message : String)
    }
}