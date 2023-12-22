package com.github.Yazip.LR3;
import java.util.Scanner;
// Класс издатель
public class Publisher {
    private String name;
    private String address;
    private String phone_num;
    private String email;
    private static int publisher_count = 0;
    // Конструктор без параметров
    public Publisher() {
        name = "";
        address = "";
        phone_num = "";
        email = "";
        ++publisher_count;
    }
    // Конструктор с 1 параметром
    public Publisher(String name) {
        this.name = name;
        ++publisher_count;
    }
    // Конструктор со всеми параметрами
    public Publisher(String name, String address, String phone_num, String email) {
        setPublisherData(name, address, phone_num, email);
        ++publisher_count;
    }
    // Сеттер
    public void setPublisherData(String name, String address, String phone_num, String email) {
        this.name = name;
        this.address = address;
        this.phone_num = phone_num.replaceAll("[^\\d]", "");
        this.email = email;
    }
    // Метод для пользовательского ввода данных
    public void enterPublisherData() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println();
        System.out.println("Введите название издателя:");
        name = scanner.nextLine();
        System.out.println("Введите адрес издателя:");
        address = scanner.nextLine();
        System.out.println("Введите номер телефона издателя:");
        phone_num = scanner.nextLine();
        System.out.println("Введите электронную почту издателя:");
        email = scanner.nextLine();
        System.out.println();
        System.out.println("Издатель " + name + " был успешно создан!");
    }
    // Геттер
    public void getPublisherData() {
        System.out.println();
        System.out.println("Информация об издателе:");
        System.out.println("Название: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Номер телефона: " + phone_num);
        System.out.println("Электронная почта: " + email);
    }
    public static int getPublisherCount() {
        return publisher_count;
    }
}
