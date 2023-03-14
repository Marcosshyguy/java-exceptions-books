package org.exercise.java;

public class Main {
    public static void main(String[] args) {
        try {
            Book libro = new Book("bye", -3, "luigi", "gdgdg");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
