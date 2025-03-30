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

    /**
     * Добавляет элемент в конец контейнера.
     * @param value целое число для добавления
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Возвращает количество элементов в контейнере.
     * @return размер контейнера
     */
    public int size() {
        return size;
    }

}
