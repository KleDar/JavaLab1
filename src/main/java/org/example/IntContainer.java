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
     * Получает элемент по индексу.
     * @param index индекс элемента
     * @return значение элемента
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера
     */
    public int get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Удаляет элемент по индексу.
     * @param index индекс элемента для удаления
     * @return значение удаленного элемента
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера
     */
    public int remove(int index) {
        checkIndex(index);
        int removedValue;
        if (index == 0) {
            removedValue = head.data;
            head = head.next;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            removedValue = previous.next.data;
            previous.next = previous.next.next;
        }
        size--;
        return removedValue;
    }

    /**
     * Возвращает количество элементов в контейнере.
     * @return размер контейнера
     */
    public int size() {
        return size;
    }
    /**
     * Проверяет, пуст ли контейнер.
     * @return true, если контейнер пуст, иначе false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Очищает контейнер, удаляя все элементы.
     */
    public void clear() {
        head = null;
        size = 0;
    }
    /**
     * Проверяет, что индекс находится в допустимых пределах.
     * @param index проверяемый индекс
     * @throws IndexOutOfBoundsException если индекс выходит за границы
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
