package org.example;

import java.util.ArrayList;

public class Task06 {
    public static void main(String[] args) {
        Libary libary = new Libary(new ArrayList<>());
        Book book = new Book("Горе от ума", "Грибоедов");
        libary.addBook(book);
        libary.addBook(null);
        libary.setName_student("Ivanov");
        libary.setNumberticket(10);
        libary.setNumbergroup(112);
        System.out.println(libary.getName_student());
        System.out.println(libary.getNumberticket());
        System.out.println(libary.getNumbergroup());
        System.out.println();
        Book book1=libary.getBook("Горе от ума", "Грибоедов");
        if(book1 != null){
            System.out.println(book1);
        }else{
            System.out.println("Кончились книги");
        }
    }
}
