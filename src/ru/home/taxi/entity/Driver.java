package ru.home.taxi.entity;

import ru.home.taxi.*;

import java.util.List;

public class Driver implements Initiation {

    private Integer idDriver = 1;
    List<Order> orders = FileReader.readOrders();                  //читаем файл с заказами

    public void init() {
        System.out.println("Здарова водила, покатаемся\n" +
                "д - Посмотреть заказы для текущего водителя \n" +
                "н - выход");

        if (YesNoAnswer.dialog()) {
            System.out.println("Проверяем заказы");
            try {
                orders.stream().filter(it -> it.getIdDriver().equals(idDriver)).forEach(System.out::println);
            } catch (NullPointerException e) {
                System.out.println("У вас нет заказов");
            }
        }
        return;
    }
}