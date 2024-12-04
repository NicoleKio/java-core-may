package hw1;

import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private ArrayList<String> authors;
    private String gender;

    public Book(String title, int pages, ArrayList<String> authors, String gender) {
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
    public ArrayList<String> getAuthors() {
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
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
