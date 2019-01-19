package com.example.nh.recyclerviewexample;

import java.io.Serializable;

public class Contact implements Serializable{

    private String name;
    private String lastMessage;
    private int image;

    public Contact(String name, String lastMessage, int image) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
