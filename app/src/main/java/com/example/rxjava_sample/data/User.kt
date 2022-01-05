package com.example.rxjava_sample.data

data class User (
    val name : String,
    val age : Int
)


val mUserList = mutableListOf(
    User("test", 11),
    User("test2", 13),
    User("test3", 15)
)