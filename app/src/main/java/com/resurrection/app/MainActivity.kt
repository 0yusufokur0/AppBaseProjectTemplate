package com.resurrection.app

import android.os.Bundle
import com.resurrection.app.databinding.ActivityMainBinding
import com.resurrection.base.core.activity.CoreActivity
import com.resurrection.base.extensions.delegated.viewdatabinding.dataBinding
import com.resurrection.base.extensions.delegated.viewmodel.viewModel
import com.resurrection.base.extensions.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : CoreActivity(R.layout.activity_main) {

    val binding by dataBinding<ActivityMainBinding>()
    val viewModel by viewModel<MainViewModel>()
    override fun init(savedInstanceState: Bundle?) {
        toast("hello world")

    }

}