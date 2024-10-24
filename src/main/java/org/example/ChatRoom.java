package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;
    private List<User> users;

    public ChatRoom(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                //
            }
        }
    }
}