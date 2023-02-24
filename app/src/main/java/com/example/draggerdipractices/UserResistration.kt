package com.example.draggerdipractices

class UserResistration(private var userRepository: UserRepository, private var emailServices: EmailServices) {

    fun resisterEmail(name : String, email : String){
        userRepository.saveUser(name, email)
        emailServices.sendEmail(name, email, "Gaddar Kumar")
    }
}