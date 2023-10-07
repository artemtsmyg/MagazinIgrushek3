package org.example.МагазинИгрушек3;


/**
 * Класс, представляющий игрушку.
 */
class Toy implements Comparable<Toy> {
    private int id;         // Уникальный идентификатор игрушки
    private String name;    // Название игрушки
    private int weight;     // Вес игрушки

    /**
     * Конструктор для создания экземпляра игрушки.
     *
     * @param id     Уникальный идентификатор игрушки
     * @param name   Название игрушки
     * @param weight Вес игрушки
     */
    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    /**
     * Метод для получения уникального идентификатора игрушки.
     *
     * @return Уникальный идентификатор игрушки
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для получения названия игрушки.
     *
     * @return Название игрушки
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для получения веса игрушки.
     *
     * @return Вес игрушки
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Метод для сравнения игрушек по весу.
     *
     * @param other Другая игрушка
     * @return Результат сравнения по весу
     */
    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.weight, other.weight);
    }
}