package com.bmajik.daggerhiltsample.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.bmajik.daggerhiltsample.data.IMainRepo
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.unmockkAll
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


class HomeViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @MockK
    lateinit var mainRepo: IMainRepo

    @InjectMockKs
    lateinit var homeViewModel: HomeViewModel


    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        mainRepo = mockk<IMainRepo>()
        homeViewModel = HomeViewModel(mainRepo)
    }

    @After
    fun tearDown() {
        unmockkAll()
    }

    @Test
    fun `test `() {
        every {
            mainRepo.getData()
        } returns "Test"

        assertEquals("Test", homeViewModel.title)
    }

}