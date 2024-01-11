package ru.netology.domain;
public class Poster {

    private Films[] films = new Films[0];

    public void setFilms(Films[] films){
        this.films = films;

    }

    public void add(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        Films[] lastFilms = new Films[5];
        Films[] all = findAll();
        for (int i = 0; i < lastFilms.length; i++) {
            lastFilms[i] = all[all.length - 1 - i];


        }
        return lastFilms;


    }

    public Films[] findLast(int quantity) {
        int resultLength = quantity;
        Films[] lastFilms = new Films[resultLength];
        Films[] all = findAll();
        for (int i = 0; i < lastFilms.length; i++) {
            lastFilms[i] = all[all.length - 1 - i];


        }
        return lastFilms;
    }
}