package ru.netology.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;
import ru.netology.domain.Poster;

public class PosterTest {

    Films film1 = new Films("Бладшот","боевик");
    Films film2 = new Films("Вперёд", "мультфильм");
    Films film3 = new Films("Отель Белград","комедия");
    Films film4 = new Films("Джентельмены", "боевик");
    Films film5 = new Films("Человек-невидимка", "ужасы");
    Films film6 = new Films("Тролли. Мировой тур", "мультфильм");
    Films film7 = new Films("Номер один", "комедия");
    Poster post = new Poster();

    @Test
    public void shouldAddFilms(){
        post.add(film1);
        post.add(film2);
        post.add(film3);
        post.add(film4);
        post.add(film5);
        post.add(film6);
        post.add(film7);
        post.findAll();
        Films[] expected = {film1,film2,film3,film4,film5,film6,film7};
        Films [] actual = post.findAll();
        

    }
}
