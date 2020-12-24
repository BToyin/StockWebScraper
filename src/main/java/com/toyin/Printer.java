package com.toyin;

public class Printer {


    public static void print(String message){

        System.err.println(message);
    }

    public static void print(Exception exception) {

        System.err.println("The Exception you received was:: " + exception.getMessage());
    }
}
