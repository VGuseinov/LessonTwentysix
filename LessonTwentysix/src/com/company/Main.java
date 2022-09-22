package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Синхронизация потоков
        /* Thread -> {
            ...
            synchronized (o) { // обязательно указать объект у кроторого вызывается wait()
                o.wait() // поток входит в режим ожидаия
                o.notify() // выводит поток из режима ожидания случайным образом
            }
            ...
         */

        Viber viber = new Viber();
        Telegram telegram = new Telegram();
        viber.start();
        telegram.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите новое сообщение");
            String s = scanner.next();
            Messenger.sendMessage(s);
        }
    }
}
