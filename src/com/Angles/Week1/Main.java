package com.Angles.Week1;
//Connor Angles
//3/5
//CSCI 1660
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Taskstuffs collection = new Taskstuffs();
        ViewTask view = new ViewTask(collection);
        view.run();
    }
}

