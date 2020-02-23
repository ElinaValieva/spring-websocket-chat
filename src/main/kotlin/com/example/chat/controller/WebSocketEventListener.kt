@file:Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package com.example.chat.controller

import com.example.chat.model.Message
import com.example.chat.model.MessageType
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.stereotype.Component
import org.springframework.web.socket.messaging.SessionConnectedEvent
import org.springframework.web.socket.messaging.SessionDisconnectEvent


@Component
class WebSocketEventListener {

    @Autowired
    private val messagingTemplate: SimpMessageSendingOperations? = null

    private val logger = KotlinLogging.logger {}

    @EventListener
    fun handleWebSocketConnectListener(event: SessionConnectedEvent?) {
        logger.info("Received a new web socket connection")
    }

    @EventListener
    fun handleWebSocketDisconnectListener(event: SessionDisconnectEvent) {
        val headerAccessor = StompHeaderAccessor.wrap(event.message)
        val username = headerAccessor.sessionAttributes?.get("username") as String?
        if (username != null) {
            logger.info("User Disconnected : $username")
            val chatMessage = Message()
            chatMessage.type = MessageType.LEAVE
            chatMessage.sender = username
            messagingTemplate!!.convertAndSend("/topic/public", chatMessage)
        }
    }
}