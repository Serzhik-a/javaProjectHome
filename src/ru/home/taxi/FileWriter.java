package ru.home.taxi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileWriter {
    public static void writeOrders (List<Order> list) {
         try {
            FileOutputStream fileOutputStream = new FileOutputStream("orders.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
             System.out.println("Проблемы с записью в файл");
        }
        System.out.println("Заказ добавлен!");

    }
}