package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(Main.prosto(2));

    }
    public static String prosto(int value) {
        int temp = value;
        if (temp == 1) {
            String gradus = "Температура в Цельсиях";
            return gradus;
        } else if (temp == 2) {
            String gradus = "Температура в Фаренгейтах";
            return gradus;
        } else {
            System.out.println("Не правильный ввод");
        }
        return null;
    }
}
