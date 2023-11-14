package com.hades.example.designpatterns.mediator.chat;

import java.util.HashMap;
import java.util.Map;

/**
 * Mediator
 */
public class ChartRoom implements IChatRoom {
    private Map<String, User> mUserMap = new HashMap<>();

    @Override
    public void sendMessage(String id, String message) {
        User user = mUserMap.get(id);
        if (null != user) {
            user.receive(message);
        }
    }

    @Override
    public void addUser(User user) {
        mUserMap.put(user.getId(), user);
    }
}
