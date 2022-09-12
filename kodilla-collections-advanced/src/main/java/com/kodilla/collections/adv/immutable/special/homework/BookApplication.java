package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book = BookManager.createBook("J.R.R. Tolkien", "Silmarillion");
        Book book1 = BookManager.createBook("Drew Karpyshyn", "Darth Bane");
        Book book2 = BookManager.createBook("Henryk Sienkiewicz", "Quo Vadis");
        Book book3 = BookManager.createBook("J.R.R. Tolkien", "Silmarillion");

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


        System.out.println(book.hashCode() == book1.hashCode());
        System.out.println(book.hashCode() == book2.hashCode());
        System.out.println(book.hashCode() == book3.hashCode());
        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.hashCode() == book3.hashCode());
        System.out.println(book2.hashCode() == book3.hashCode());
    }
}
