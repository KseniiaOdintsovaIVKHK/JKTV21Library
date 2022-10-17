/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class History {
    private Book book;
    private Reader reader;
    private Date takeOnBook;
    private Date returnBook;

    public History() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOnBook() {
        return takeOnBook;
    }

    public void setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "History{" 
                + "book=" + book 
                + ", reader=" + reader 
                + ", takeOnBook=" + takeOnBook 
                + ", returnBook=" + returnBook 
                + '}';
    }
    
}
