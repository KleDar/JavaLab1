package org.example;

import org.example.IntContainer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing IntContainer implementation");

        // Создаем экземпляр контейнера
        IntContainer container = new IntContainer();

        // Добавляем элементы
        System.out.println("\nAdding elements:");
        for (int i = 1; i <= 5; i++) {
            container.add(i * 10);
            System.out.println("Added: " + (i * 10));
        }

        // Выводим размер контейнера
        System.out.println("\nContainer size: " + container.size());

        // Выводим все элементы
        System.out.println("\nContainer elements:");
        for (int i = 0; i < container.size(); i++) {
            System.out.println("Element at index " + i + ": " + container.get(i));
        }

        // Удаляем элемент и выводим результат
        System.out.println("\nRemoving element at index 2:");
        int removed = container.remove(2);
        System.out.println("Removed: " + removed);

        // Выводим оставшиеся элементы
        System.out.println("\nContainer elements after removal:");
        for (int i = 0; i < container.size(); i++) {
            System.out.println("Element at index " + i + ": " + container.get(i));
        }
    }
}