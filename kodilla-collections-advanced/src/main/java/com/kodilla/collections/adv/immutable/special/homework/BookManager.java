package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String author, String title) {
        Book checkbook = new Book(author, title);

        for (Book checkbooks : books) {
            if (checkbooks.getTitle().equals(title) && checkbooks.getAuthor().equals(author)) {
                System.out.println(" same title and author");

                return checkbooks;
            }

        }
        books.add(checkbook);
        return checkbook;
    }
}
