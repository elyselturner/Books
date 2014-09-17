package com.example.bookExercise;

/**
 * Created by elyseturner on 9/16/14.
 */
public class Book {
    private static double numOfBooksIHave;
    private static String print;
    private double booksInLibrary;
    private String coverColor;
    private String authorName;
    private String bookInfo;



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

    public void setAuthorName(String inputAuthorName){
        authorName = inputAuthorName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public static void readingIsAwesome(){
        System.out.println( "Reading is awesome!");
    }
    public void print(){
        System.out.println("This book looks pretty great! It has a " + coverColor + " cover, by " + authorName);
    }

}
