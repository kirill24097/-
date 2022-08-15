package HW_1_9;

import java.util.Objects;

public class Book {
    private final String name;
    private int year;
    private final Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

     ///package HW_1_10;

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o ==null|| getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name,book.name) &&  Objects.equals(author, book.author);
    }
    @Override
    public String toString() {
        return "книга  " +
                "название книги= " + name +  "  " +
                "автор=  " + author +
                "год выпуска=  " + year + "  " ;


    }
    
    
}

