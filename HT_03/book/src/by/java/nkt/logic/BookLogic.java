package by.java.nkt.logic;

import by.java.nkt.entity.Book;

import java.util.ArrayList;

public class BookLogic {
    public ArrayList<Book> findBooksByAuthor(String author, ArrayList<Book> books) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }

    public ArrayList<Book> findBooksByPublishingHouse(String publishingHouse, ArrayList<Book> books) {
        ArrayList<Book> booksByPublishingHose = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublishingHouse().equals(publishingHouse)) {
                booksByPublishingHose.add(books.get(i));
            }
        }
        return booksByPublishingHose;
    }
    public ArrayList<Book> findBooksByPublicationYear(int publicationYear, ArrayList<Book> books) {
        ArrayList<Book> booksByPublishingHose = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublicationYear() > publicationYear) {
                booksByPublishingHose.add(books.get(i));
            }
        }
        return booksByPublishingHose;
    }
}