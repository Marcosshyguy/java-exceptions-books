package org.exercise.java;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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


        input.close();


        FileWriter writer = null;

        try {
            writer = new FileWriter("books.txt");
            for (int i = 0; i < bookshelf.length; i++) {
                Book book = bookshelf[i];
                String writetitle = book.getTitle();
                int writepageNum = book.getPageNumber();
                String writeauthor = book.getAuthor();
                String writepublisher = book.getPublisher();
                String line = writetitle + "," + writepageNum + "," + writeauthor + "," + writepublisher + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            File file = new File("books.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String readTitle = parts[0];
                int readPageNum = Integer.parseInt(parts[1]);
                String readAuthor = parts[2];
                String readPublisher = parts[3];
                System.out.println("Titolo: " + readTitle);
                System.out.println("Numero di pagine: " + readPageNum);
                System.out.println("Autore: " + readAuthor);
                System.out.println("Editore: " + readPublisher);
                System.out.println();
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
