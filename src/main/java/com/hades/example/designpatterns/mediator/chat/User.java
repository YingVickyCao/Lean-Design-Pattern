package com.hades.example.designpatterns.mediator.chat;

public abstract class User {
    protected String id;
    protected String name;
    protected IChatRoom mMediator;

    public User(String id, String name, IChatRoom Mediator) {
        this.id = id;
        this.name = name;
        mMediator = Mediator;
    }

    public IChatRoom getMediator() {
        return mMediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String id, String message);

    public abstract void receive(String message);
}
