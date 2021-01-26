package com.my.twowaytls;

public class User {
    private int Id;
    private String name;
    private int age;
    private String MyWords;
    private long timestamp;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMyWords() {
        return MyWords;
    }

    public void setMyWords(String myWords) {
        MyWords = myWords;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
