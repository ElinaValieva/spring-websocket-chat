package com.example.chat.model

data class Message(
        var type: MessageType? = null,
        var content: String? = null,
        var sender: String? = null
)