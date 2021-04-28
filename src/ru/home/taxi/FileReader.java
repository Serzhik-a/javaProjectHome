package ru.home.taxi;

import java.io.*;
import java.util.List;

public class FileReader {
    public static List <Order> readOrders () {
        List<Order> list = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("orders.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            list = (List<Order>) objectInputStream.readObject();
            fileInputStream.close();
            System.out.println("Успешно считано из файла!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Проблемы с чтением из файла");

        }
        return list;
            }
}
