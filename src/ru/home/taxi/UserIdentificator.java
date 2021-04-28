package ru.home.taxi;

import java.util.Scanner;

public class UserIdentificator {                                            //проверка кто пришел
    public static Integer selector () {
        Scanner input = new Scanner(System.in);
        while (true) {
            StringBuilder answer = new StringBuilder(input.nextLine());
            try {
                int inputInt = Integer.parseInt(answer.toString());
                if (inputInt >= 0 && inputInt < 5) {
                    return inputInt;
                } else {
                    System.out.println("Некорректный ввод");
                    continue;
                }
            }
                catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");
                    continue;
            }
        }
    }
}
