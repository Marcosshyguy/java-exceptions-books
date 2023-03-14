package org.exercise.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title = "";
        int pageNum = 0;
        String author = "";
        String publisher = "";
        Book libro = null;
        int bookCounter = 0;
        //set bookshelf lenght
        System.out.print("Quanti libri vuoi aggiungere: ");
        int arrayLength = Integer.parseInt(input.nextLine());
        Book[] bookshelf = new Book[arrayLength];

        while (bookCounter < bookshelf.length){
            boolean flag = false;
            while(!flag){
//                asking question and use try catch as if condition
                System.out.print("Bene scegli un libro: ");

                try {
                    title = input.nextLine();
                } catch (Exception e) {
                    System.out.println("Titolo non valido");
                    break;
                }
                System.out.print("Quante pagine ha: ");

                try {
                    pageNum = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Scelta non valida");
                    break;
                }
                System.out.print("Dimmi il nome dell' autore:  ");

                try {
                    author = input.nextLine();
                } catch (Exception e) {
                    System.out.println("Scelta non valida");
                    break;
                }
                System.out.print("Qual'è la casa editrice ");

                try {
                    publisher = input.nextLine();
                } catch (Exception e) {
                    System.out.println("Scelta non valida");
                    break;
                }
                flag= true;
            }

//            push the book in bookshelf ig
            if(flag){
                try {
                    libro = new Book(title, pageNum, author, publisher);
                    System.out.println(libro.toString());
                } catch (Exception e) {
                    e.getMessage();
                }

                bookshelf[bookCounter] = libro;
                bookCounter++;
            }
        }



        System.out.println(Arrays.toString(bookshelf));

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
