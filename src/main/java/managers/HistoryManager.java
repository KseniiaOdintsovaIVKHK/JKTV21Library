/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HistoryManager {
    private final Scanner scanner = new Scanner(System.in);
    public History takeOnBook(Book[] books,Reader[] readers){
        History history = new History();
        // Вывести нумерованный список читателей
        // Выбрать указанного читателя из массива
        // Выбрать нумерованный список книг
        // Выбрать указанную книгу из массива
        // Вставить читателя и книгу в history
        // Добавить дату выдачи книги в history
        System.out.println("Список читателей: ");
        ReaderManager readerManager = new ReaderManager();
        readerManager.printListReaders(readers);
        System.out.print("Выберите номер читателя из списка: ");
        int numberReader = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Список книг: ");
        BookManager bookManager = new BookManager();
        bookManager.printListBooks(books);
        System.out.print("Выберите номер книги из списка: ");
        int numberBook = scanner.nextInt(); scanner.nextLine();
        
        history.setBook(books[numberBook - 1]);
        history.setReader(readers[numberReader - 1]);
        history.setTakeOnBook(new GregorianCalendar().getTime());
        return history;
    }

    public void printListTakeOnBooks(History[] histories) {
        for (int i = 0; i < histories.length; i++) {
            if(histories[i].getReturnBook() == null && histories[i].getTakeOnBook() != null){
                System.out.printf("%d. %s. Выдана: %s%n"
                        ,i+1
                        ,histories[i].getBook().getTitle()
                        ,histories[i].getTakeOnBook());
            }
        }
    }
    
}
