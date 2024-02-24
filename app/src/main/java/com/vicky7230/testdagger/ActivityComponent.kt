package com.vicky7230.testdagger

import android.content.Intent
import android.os.Bundle
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent
@ActivityScoped
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance savedInstanceState: Bundle?,
                   @BindsInstance intent: Intent
        ): ActivityComponent
    }

    fun inject(mainActivity: MainActivity)
}