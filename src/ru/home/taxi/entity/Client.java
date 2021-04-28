package ru.home.taxi.entity;

import ru.home.taxi.*;

import java.util.List;

public class Client implements Initiation {
    private Integer idClient = 1;
    List<Order> orders = FileReader.readOrders();                  //читаем файл с заказами

    public void init() {
        System.out.println("Здравствуйте клиент \n" +
                "д - Новый заказ? \n" +
                "н - Проверить статус заказов");
        if (YesNoAnswer.dialog()) {
            orders.add(OrderMaker.makeOrder(idClient));             //формируем заказ и добавляем в лист
            FileWriter.writeOrders(orders);                     //записываем в файл

        } else {                                                    // проверка статуса
            System.out.println("Проверяем статус ваших заказов");
            try {
                orders.stream().filter(it -> it.getIdClient().equals(idClient)).forEach(System.out::println);
            } catch (NullPointerException e) {
                System.out.println("У вас нет заказов");
            }
        }
    }
}
