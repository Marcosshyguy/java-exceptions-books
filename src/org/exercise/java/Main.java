package org.exercise.java;

public class Main {
    public static void main(String[] args) {
        Book libro = null;
        try {
            libro = new Book("Boccamara", 3, "Luigi", "GGG");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            libro.setAuthor("dio");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            libro.setPageNumber(10);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
