package com.droidfeed.di

import com.droidfeed.di.main.MainFragmentModule
import com.droidfeed.di.main.MainModule
import com.droidfeed.ui.module.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Dogan Gulcan on 12/11/17.
 */
@Module
abstract class ActivityModule {

    @MainScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class, MainModule::class])
    abstract fun contributeMainActivity(): MainActivity

}