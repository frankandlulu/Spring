package org.example.DI;

public class Book {
    private String bookname;
    private String author;

    public Book(String bookname,String author) {
        System.out.println("构造函数执行了");
        this.bookname = bookname;
        this.author=author;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
