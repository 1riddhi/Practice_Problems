import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "title= " + title +", author = " + author + ", publicationYear = " + publicationYear;
    }
}

public class AuthorBook {
    public static void main(String[] args) {
        // List of books
        List<Book> books = Arrays.asList(
                new Book("Java", "author-1", 2023),
                new Book("C++", "author-2", 2019),
                new Book("JavaScript", "author-1", 2010)

        );


        Map<String, List<Book>> map = books.stream().collect(Collectors.groupingBy(Book::getAuthor));

        System.out.println(map);


    }
}
