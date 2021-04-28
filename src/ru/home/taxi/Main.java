package ru.home.taxi;

import ru.home.taxi.entity.Client;
import ru.home.taxi.entity.Driver;
import ru.home.taxi.entity.Initiation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите роль: \n" +
                "1 - Директор \n" +
                "2 - Диспетчер \n" +
                "3 - Клиент \n" +
                "4 - Водитель \n" +
                "0 - Выход");

        switch (UserIdentificator.selector()) {                                     //проверка кто пришел
            case (1): {
                System.out.println("Директор");
                break;
            }
            case (2): {
                System.out.println("Диспетчер");
                break;
            }
            case (3): {
                Initiation client = new Client();
                client.init();
                break;
            }
            case (4): {
                Initiation driver = new Driver();
                driver.init();
                break;
            }
            case (0): {
                return;
            }
        }

    }
}
