package ru.netology.domain;

public class Films {

    private String name;
    private String genre;

    public Films(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
    public String getName(){return name;};
    public void setName(String name){
        this.name = name;
    }
    public String getGenre(){return genre;};
    public void setGenre(String genre){
        this.genre = genre;
    }

}
