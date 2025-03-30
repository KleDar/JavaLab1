package org.example;

/**
 * Класс контейнера для хранения произвольного количества целых чисел.
 * Реализация основана на связанном списке.
 */
public class IntContainer {
    private Node head;
    private int size;

    /**
     * Внутренний класс для представления узла связанного списка.
     */
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
