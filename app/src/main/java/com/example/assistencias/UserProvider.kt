package com.example.assistencias

class UserProvider {
    companion object {
        val users = listOf<User>(
            User(
                "luis@luis.com",
                "123",
            ),
            User(
                "123@123.com",
                "123",
            ),
            User(
                "jorge@jorge.com",
                "123",
            ),
        )
    }
}