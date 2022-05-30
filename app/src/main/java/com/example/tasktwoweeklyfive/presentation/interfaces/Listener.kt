package com.example.tasktwoweeklyfive.presentation.interfaces

import com.example.tasktwoweeklyfive.data.model.Movie


interface Listener {
    fun onClickItem(movie: MutableList<Movie>, position: Int)
}

