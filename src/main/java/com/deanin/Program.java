package com.deanin;

public class Program {
    public static void main(String[] args) {
        int subscriberCount = 3999;
        String initialPlug = "Don't forget to subscribe because I'm at ";
        String finalPlug = " subscribers and your sub counts!";
        String shamelessPlug = initialPlug + subscriberCount + finalPlug;
        System.out.println(shamelessPlug);
    }
}
