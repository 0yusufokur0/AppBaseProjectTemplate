package com.resurrection.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.resurrection.app.databinding.ActivityMainBinding
import com.resurrection.base.core.activity.BaseActivity
import com.resurrection.base.extensions.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(
    R.layout.activity_main,MainViewModel::class.java
) {
    override fun init(savedInstanceState: Bundle?) {
        toast("hello world")

    }

}