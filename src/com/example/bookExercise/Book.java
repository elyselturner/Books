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

    public void setCoverColor(String inputCoverColor){
        coverColor = inputCoverColor;
    }

    public String getCoverColor(){
        return coverColor;
    }

//    public String readingIsAwesome(){
//        return System.out.println("Reading is awesome!");
//    }

}
