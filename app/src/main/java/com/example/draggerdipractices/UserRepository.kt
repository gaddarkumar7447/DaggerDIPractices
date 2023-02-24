package com.example.draggerdipractices

import android.util.Log

class UserRepository {

    fun saveUser(name : String, email : String){
        Log.d("DI", "User has been save (UserRepository class)")
    }
}