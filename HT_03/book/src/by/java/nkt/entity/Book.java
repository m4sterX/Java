package by.java.nkt.entity;

import java.util.Objects;

public class Book {
    private int id;
    private String author;
    private String publishingHouse;
    private int publicationYear;
    private int numberOfPages;
    private double price;
    private double typeOfBinding;

    public Book(int id, String author, String publishingHouse, int publicationYear, int numberOfPages, double price, double typeOfBinding) {
        this.id = id;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", publishingHouse=" + publishingHouse +
                ", publicationYear=" + publicationYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfBinding=" + typeOfBinding +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                publishingHouse == book.publishingHouse &&
                publicationYear == book.publicationYear &&
                numberOfPages == book.numberOfPages &&
                Double.compare(book.price, price) == 0 &&
                Double.compare(book.typeOfBinding, typeOfBinding) == 0 &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, publishingHouse, publicationYear, numberOfPages, price, typeOfBinding);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(double typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}
