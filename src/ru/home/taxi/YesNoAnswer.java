package ru.home.taxi;

import java.util.Scanner;

public class YesNoAnswer {
    public static boolean dialog() {
        Scanner input = new Scanner(System.in);
        while (true) {
            StringBuilder answer = new StringBuilder(input.nextLine());
            switch (answer.toString().toLowerCase()) {
                case "д": {
                    return true;
                }
                case "н": {
                    return false;
                }
                default: {
                    System.out.println("Некорректный ввод");
                }
            }
        }
    }
}
