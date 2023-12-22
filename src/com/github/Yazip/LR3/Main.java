package com.github.Yazip.LR3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Publisher publisher = new Publisher("EKSMO", "123308, Moscow, Sorge str., 1, p.1.", "+7 (495) 411-68-86", "info@eksmo.ru");
        String genre_name = "Novel";
        for (int i = 0; i < 4; i++) {
            books[i] = new Book();
            books[i].enterBookData();
        }
        Book.findBooksByGenre(books, genre_name);
        System.out.println("Создано авторов: " + Author.getAuthorCount());
        System.out.println("Создано книг: " + Book.getBookCount());
        System.out.println("Создано жанров: " + Genre.getGenreCount());
        System.out.println("Создано журналов: " + Magazine.getMagazineCount());
        System.out.println("Создано издателей: " + Publisher.getPublisherCount());
        System.out.println();
        System.out.println("Вывод кол-ва книг жанра Novel через возврат целочисленного значения из метода через вспомогательный класс:");
        System.out.println(BookManager.countBooksByGenre(books, genre_name));
        System.out.println();
        System.out.println("Результат обработки строки (String): номер телефона содержит только цифры");
        publisher.getPublisherData();
        new Scanner(System.in).nextLine();
    }
}