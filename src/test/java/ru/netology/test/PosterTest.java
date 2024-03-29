package ru.netology.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;
import ru.netology.domain.Poster;

public class PosterTest {

    Films film1 = new Films("Бладшот", "боевик");
    Films film2 = new Films("Вперёд", "мультфильм");
    Films film3 = new Films("Отель Белград", "комедия");
    Films film4 = new Films("Джентельмены", "боевик");
    Films film5 = new Films("Человек-невидимка", "ужасы");
    Films film6 = new Films("Тролли. Мировой тур", "мультфильм");
    Films film7 = new Films("Номер один", "комедия");
    Poster post = new Poster();
    Poster post1 = new Poster(3);
    Poster post2 = new Poster(7);
    Poster post3 = new Poster(10);


    @Test
    public void shouldAddFilms() {
        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);
        post.add(film6);
        post.add(film7);
        post.findAll();
        Films[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Films[] actual = post.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFind5LastFilms() {
        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);
        post.add(film6);
        post.add(film7);
        Films[] expected = {film7, film6, film5, film4, film3};
        Films[] actual = post.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind3LastFilms() {
        post1.add(film1);
        post1.add(film2);
        post1.add(film3);
        post1.add(film4);
        post1.add(film5);
        post1.add(film6);
        post1.add(film7);
        Films[] expected = {film7, film6, film5};
        Films[] actual = post1.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind7LastFilms() {
        post2.add(film1);
        post2.add(film2);
        post2.add(film3);
        post2.add(film4);
        post2.add(film5);
        post2.add(film6);
        post2.add(film7);
        Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Films[] actual = post2.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void notShouldFindMoreMax() {
        post3.add(film1);
        post3.add(film2);
        post3.add(film3);
        post3.add(film4);
        post3.add(film5);
        post3.add(film6);
        post3.add(film7);
        Films[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Films[] actual = post3.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }


}