package smith.tukahirwa;

import java.util.List;

public class Author extends Person{
    List<Book> books;
    public Author(String name, Address address, String email, String phone) {
        super(name, address, email, phone);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    // implement

}
