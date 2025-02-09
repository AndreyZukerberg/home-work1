package org.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = 0;
        while (true) {
            System.out.print("Введите год в формате yyyy: ");
            int year = scanner.nextInt();
            System.out.print("Введите кол-во дней в году: ");
            int days = scanner.nextInt();

            if (year % 400 == 0) {
                if (days == 366) { scores = scores + 1;
                } else {
                    System.out.println("Неправильно! В этом году 366 дней!");
                    break;
                }
            } else if (year % 100 == 0) {
                if (days == 365) { scores = scores + 1;
                } else {
                    System.out.println("Неправильно! В этом году 365 дней!");
                    break;
                }
            } else if (year % 4 == 0) {
                if (days == 366) { scores = scores + 1;
                } else {
                    System.out.println("Неправильно! В этом году 366 дней!");
                    break;
                }
            } else {
                if (days == 365) { scores = scores + 1; }
                else {System.out.println("Неправильно! В этом году 365 дней!");
                    break;}
            }
        }
        System.out.println("Ваш счёт: " + scores);
    }
}