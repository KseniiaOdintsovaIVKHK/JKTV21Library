/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entity.Book;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ReaderManager {
    private final Scanner scanner = new Scanner(System.in);
    public Reader createReader(){
        Reader reader = new Reader();
        System.out.print("Имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Фамилия читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Телефон читателя: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }

    public void printListReaders(Reader[] readers) {
        for (int i = 0; i < readers.length; i++) {
            Reader reader = readers[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,reader.getFirstname()
                    ,reader.getLastname()
                    ,reader.getPhone()
            );
        }
    }
    
}
