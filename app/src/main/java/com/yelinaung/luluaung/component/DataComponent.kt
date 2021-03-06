package com.yelinaung.luluaung.component

import com.yelinaung.luluaung.module.DataModule
import com.yelinaung.luluaung.scope.RepoScope
import com.yelinaung.luluaung.views.activities.DetailActivity
import com.yelinaung.luluaung.views.activities.MainActivity
import dagger.Component

/**
 * Created by user on 9/5/16.
 */
@RepoScope
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(DataModule::class))
interface DataComponent : RemoteComponent {
    fun inject(mainActivity: MainActivity);
    fun inject(detailActivity: DetailActivity);
}