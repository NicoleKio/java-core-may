package hw1;

import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private String[] authors;
    private String gender;

    public Book() {
    }

    public Book(String title, int pages, String[] authors, String gender) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String[] getAuthors() {
        return authors;
    }
    public String getGender() {
        return gender;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", authors=" + authors +
                ", gender='" + gender + '\'' +
                '}';
    }
}
