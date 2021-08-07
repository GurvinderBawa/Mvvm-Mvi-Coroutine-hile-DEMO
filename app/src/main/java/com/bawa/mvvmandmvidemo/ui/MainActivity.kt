package com.bawa.mvvmandmvidemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bawa.mvvmandmvidemo.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/**
 * MVVM , MVI
 * Hilt
 * Databinding
 * Coroutines - Flow
 */


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}