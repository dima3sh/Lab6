package org.job.com;

import org.job.com.entity.Book;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>(){
            {
                put("book1", new Book("book1", "John", "Snow", Book.Genre.CLASSIC));
                put("book2", new Book("book2", "John", "Snow", Book.Genre.CLASSIC));
                put("book3", new Book("book3", "John", "Snow", Book.Genre.CLASSIC));
                put("book4", new Book("book4", "John", "Snow", Book.Genre.CLASSIC));
                put("book5", new Book("book5", "John", "Snow", Book.Genre.CLASSIC));
                put("book6", new Book("book6", "John", "Snow", Book.Genre.CLASSIC));
                put("book7", new Book("book7", "John", "Snow", Book.Genre.CLASSIC));
                put("book8", new Book("book8", "John", "Snow", Book.Genre.CLASSIC));
                put("book9", new Book("book9", "John", "Snow", Book.Genre.CLASSIC));
                put("book10", new Book("book10", "John", "Snow", Book.Genre.CLASSIC));
                put("book11", new Book("book11", "John", "Snow", Book.Genre.CLASSIC));
                put("book12", new Book("book12", "John", "Snow", Book.Genre.CLASSIC));
                put("book13", new Book("book13", "John", "Snow", Book.Genre.CLASSIC));
                put("book14", new Book("book14", "John", "Snow", Book.Genre.CLASSIC));
                put("book15", new Book("book15", "John", "Snow", Book.Genre.CLASSIC));
            }
        };


    }
}
