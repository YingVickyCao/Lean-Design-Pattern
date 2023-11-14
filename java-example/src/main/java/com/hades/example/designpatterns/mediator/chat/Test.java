package com.hades.example.designpatterns.mediator.chat;

public class Test {
    public static void main(String[] args) {
        IChatRoom chatRoom = new ChartRoom();

        User user1 = new ChatUser("1", "Alex", chatRoom);
        User user2 = new ChatUser("2", "David", chatRoom);
        User user3 = new ChatUser("3", "Candy", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("1", "Hi Alex");
        user1.send("2", "Hi David");
    }
}
