package com.github.posko.pos.injection.modules

import com.github.posko.pos.injection.annotations.ActivityScoped
import com.github.posko.pos.ui.activities.home.HomeActivity
import com.github.posko.pos.ui.activities.login.LoginActivity
import com.github.posko.pos.ui.activities.login.LoginActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindings {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    abstract fun loginActivity() : LoginActivity

    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun homeActivity() : HomeActivity
}