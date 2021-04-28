package ru.home.taxi;

import ru.home.taxi.enums.StatusOrder;

import java.util.Scanner;

public class OrderMaker {
//    private static StringBuilder inputString = new StringBuilder();

    public static Order makeOrder (Integer idClient) {
        Scanner input = new Scanner(System.in);
        Order order = new Order();
        order.setIdClient(idClient);
        order.setStatus(StatusOrder.NOTCONFIRMED);
        System.out.println("Откуда поедем?");
        order.setFromStreet(input.nextLine());
        System.out.println("Куда поедем?");
        order.setToStreet(input.nextLine());
        return order;




    }
}
