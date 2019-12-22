package com.example.test;

public class Subject {

//    private int id;
    private String title;
    private int id;

    public Subject(String name, int id) {

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
