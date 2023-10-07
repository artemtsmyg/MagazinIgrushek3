package org.example;

import org.example.МагазинИгрушек3.ToyStore;

/**
 * Класс который запускает игру.
 */
public class App {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        /**
         * Добавляем игрушки в магазин
         */
        toyStore.put(1, "конструктор", 2);
        toyStore.put(2, "робот", 2);
        toyStore.put(3, "кукла", 1);
        toyStore.put(4, "машинка", 3);
        toyStore.put(5, "трактор", 3);
        toyStore.put(6, "пистолетик", 7);
        toyStore.put(7, "мишка", 5);
        toyStore.put(8, "пикачу", 10);
        toyStore.put(9, "шарики", 9);
        toyStore.put(10, "автоматик", 4);

        /**
         * Запускаем розыгрыш и записываем результаты в файл
         */
        toyStore.runAndWriteToFile("результаты_розыгрыша.txt");
    }
}