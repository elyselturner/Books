package com.example.bookExercise;

/**
 * Created by elyseturner on 9/16/14.
 */
public class Book {
    private static double numOfBooksIHave;
    private double booksInLibrary;
    private String coverColor;
    private String authorName;
    private int numOfPages;


    public static double booksInLibrary(){
        return numOfBooksIHave;
    }

    public void setReadingIsAwesome(){

    }

    public void readingIsAwesome(){
        return System.out.println("Reading is awesome!");
    }

}
