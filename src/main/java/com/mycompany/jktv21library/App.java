/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jktv21library;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;
import managers.BookManager;
import managers.HistoryManager;
import managers.ReaderManager;

/**
 *
 * @author Admin
 */
public class App {
    private Book[] books;
    private Reader[] readers;
    private History[] histories;
    private final BookManager bookManager;
    private final ReaderManager readerManager;
    private final HistoryManager historyManager;

    public App() {
        this.books = new Book[0];
        this.readers = new Reader[0];
        this.histories = new History[0];
        testAddBook();
        testAddReader();
        bookManager = new BookManager();
        readerManager = new ReaderManager();
        historyManager = new HistoryManager();
       
    }
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список книг");
            System.out.println("6. Редактирование книги");
            System.out.println("7. Список читателей");
            System.out.println("8. Список выданных книг");
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("____________________");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("Задача 0. Закрыть приложение");
                    break;
                case 1:
                    System.out.println("Задача 1. Добавить книгу");
                    this.books = Arrays.copyOf(this.books, this.books.length+1);
                    this.books[this.books.length-1] = bookManager.createBook();
                    break;
                case 2:
                    System.out.println("Задача 2. Добавить читателя");
                    this.readers = Arrays.copyOf(this.readers, this.readers.length+1);
                    this.readers[this.readers.length-1] = readerManager.createReader();
                    break;
                case 3:
                    System.out.println("Задача 3. Выдать книгу");
                    this.histories = Arrays.copyOf(this.histories, this.histories.length + 1);
                    this.histories[this.histories.length - 1] = historyManager.takeOnBook(books, readers);
                    break;
                case 4:
                    System.out.println("Задача 4. Вернуть книгу");
                    
                    break;
                case 5:
                    System.out.println("Задача 5. Список книг");
                    bookManager.printListBooks(books);
                    break;
                case 6:
                    System.out.println("Задача 6. Редактирование книги");
                    System.out.println("Список книг: ");
                    bookManager.printListBooks(books);
                    System.out.print("Выберите номер книги для редактирования: ");
                    int numBookForEdit = scanner.nextInt();
                    scanner.nextLine();
                    books[numBookForEdit-1] = bookManager.changeBook(books[numBookForEdit-1]);
                    break;
                case 7:
                    System.out.println("Задача 7. Список читателей");
                    readerManager.printListReaders(readers);
                    break;    
                case 8:
                    System.out.println("Задача 8. Список выданных книг");
                    historyManager.printListTakeOnBooks(this.histories);
                    break;    
                default:
                    System.out.println("Выберите задачу из списка");
            }
            System.out.println("=======---------========");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }

    private void testAddBook() {
        
        Book book = new Book();
        book.setTitle("Book for editing");
        Author author = new Author();
        author.setFirstname("firstname");
        author.setLastname("lastname");
        Author[] bookAuthors = new Author[1];
        bookAuthors[0] = author;
        book.setAuthors(bookAuthors);
        this.books = Arrays.copyOf(this.books, this.books.length+1);
        this.books[this.books.length-1] = book;
    }
    private void testAddReader(){
        
        Reader reader = new Reader("Ivan","Ivanov","54566556");
//        reader.setFirstname("Ivan");
//        reader.setLastname("Ivanov");
        this.readers = Arrays.copyOf(this.readers, this.readers.length+1);
        this.readers[this.readers.length-1] = reader;
    }
}
