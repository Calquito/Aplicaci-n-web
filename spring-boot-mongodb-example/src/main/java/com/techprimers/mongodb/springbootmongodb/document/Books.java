package com.techprimers.mongodb.springbootmongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Books{//<T extends Comparable<T>>{
    @Id
    private int bookId;
    private String book_Name;
    private int pageNumber;
    private String writer;
    private String bookGenre;
    ////////////////////////////////////////////////////
    ////////////////Builder/////////////////////////////
    ////////////////////////////////////////////////////
    public Books(int bookId, String book_Name, int pageNumber, String writer, String bookGenre){
        this.bookId = bookId;
        this.book_Name = book_Name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.bookGenre = bookGenre;
    }

    ////////////////////////////////////////////////////
    ////////////////Getters/////////////////////////////
    ////////////////////////////////////////////////////
    public int getBookId() {
        return bookId;
    }
    public String getBook_Name() {
        return book_Name;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public String getWriter() {
        return writer;
    }
    public String getbookGenre() {
        return bookGenre;
    }
    ////////////////////////////////////////////////////
    ////////////////Setters/////////////////////////////
    ////////////////////////////////////////////////////
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public void setbookGenre(String gender) {
        this.bookGenre = gender;
    }
}
