package org.example;

import java.util.ArrayList;

public class Libary {

    private ArrayList<Book> books;
    private int numberticket;
    private String name_student;
    private int numbergroup;

    public Libary() {
        this.name_student = "Ivanov";
        this.numberticket = 10;
        this.numbergroup = 112;
    }

    public Libary(String name_student, int numberticket, int numbergroup) {
        this.numberticket = numberticket;
        this.name_student = name_student;
        this.numbergroup = numbergroup;
    }
    public int getNumberticket() {
        return numberticket;
    }

    public void setNumberticket(int numberticket) {
        this.numberticket = numberticket;
    }
    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }
    public int getNumbergroup() {
        return numbergroup;
    }

    public void setNumbergroup(int numbergroup) {
        this.numbergroup = numbergroup;
    }
    public Libary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public Book getBook(String name, String author) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name) && book.getAuthor().equals(author)) {
                books.remove(i);
                return book;
            }
        }
        return null;
    }
}
