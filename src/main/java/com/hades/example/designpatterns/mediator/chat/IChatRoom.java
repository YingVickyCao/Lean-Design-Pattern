package com.hades.example.designpatterns.mediator.chat;

/**
 * Mediator Interface
 */
public interface IChatRoom {
    void sendMessage(String id, String message);
    void addUser(User user);
}
