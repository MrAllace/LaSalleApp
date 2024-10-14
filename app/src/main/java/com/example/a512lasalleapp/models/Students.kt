package com.example.a512lasalleapp.models

import java.util.Date

data class Students (
    val id : Int,
    val name : String,
    val birthDate: Date,
    val email: String,
    val career : String,
    val semester : Int,
    val courses : MutableList<Courses>,
    val gpa : Float,
    val image : String
)


