package com.example.hilt

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.hilt.presentation.MovieAdapter
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject


@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class HiltTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var moviesAdapter: MovieAdapter

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun testAdapter() {

    }
}
