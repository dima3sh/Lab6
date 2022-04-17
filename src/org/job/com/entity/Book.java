package org.job.com.entity;

public class Book {

    private String name;
    private String authorFirstName;
    private String authorLastName;
    private Genre genre;

    public Book(String name, String authorFirstName, String authorLastName, Genre genre) {
        this.name = name;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public enum Genre {
        CLASSIC,
        DRAMA,
        FANTASY,
        COMEDY
    }
}
