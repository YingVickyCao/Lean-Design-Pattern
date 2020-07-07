package com.hades.example.designpatterns.mediator.chat;

public class ChatUser extends User {
    public ChatUser(String id, String name, IChatRoom Mediator) {
        super(id, name, Mediator);
    }

    @Override
    public void send(String id, String message) {
        if (null != mMediator) {
            mMediator.sendMessage(id, message);
        }
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receive message:" + message);
    }
}
