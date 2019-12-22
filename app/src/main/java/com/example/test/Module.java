package com.example.test;

public class Module {

    private String title;
    private int id;

    public Module(String name, int id) {

        this.title = name;
        this.id = id;

    }

    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }

}
