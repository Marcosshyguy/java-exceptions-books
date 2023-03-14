package org.exercise.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book libro = null;

        //set bookshelf lenght
        System.out.print("Quanti libri vuoi aggiungere: ");
        int arrayLength = Integer.parseInt(input.nextLine());
        Book[] bookshelf = new Book[arrayLength];
        System.out.print(Arrays.toString(bookshelf));

        System.out.print("Bene scegli un libro: ");
        String title = input.nextLine();
        System.out.print("Quante pagine ha: ");
        int pageNum = Integer.parseInt(input.nextLine());
        System.out.print("Dimmi il nome dell' autore:  ");
        String author = input.nextLine();
        System.out.print("Qual'è la casa editrice ");
        String publisher = input.nextLine();


        try {
            libro = new Book(title, pageNum, author, publisher);
            System.out.println(libro.toString());
        } catch (Exception e) {
            e.getMessage();
        }

//        try {
//            libro.setAuthor("dio");
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            libro.setPageNumber(10);
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

    }
}
