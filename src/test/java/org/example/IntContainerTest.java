package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IntContainerTest {

    @Test
    public void testAddAndGet() {
        IntContainer container = new IntContainer();
        container.add(10);
        container.add(20);
        container.add(30);

        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
        assertEquals(30, container.get(2));
        assertEquals(3, container.size());
    }

    @Test
    public void testRemove() {
        IntContainer container = new IntContainer();
        container.add(10);
        container.add(20);
        container.add(30);

        int removed = container.remove(1);
        assertEquals(20, removed);
        assertEquals(2, container.size());
        assertEquals(10, container.get(0));
        assertEquals(30, container.get(1));
    }

    @Test
    public void testRemoveFirst() {
        IntContainer container = new IntContainer();
        container.add(10);
        container.add(20);

        int removed = container.remove(0);
        assertEquals(10, removed);
        assertEquals(1, container.size());
        assertEquals(20, container.get(0));
    }

    @Test
    public void testRemoveLast() {
        IntContainer container = new IntContainer();
        container.add(10);
        container.add(20);

        int removed = container.remove(1);
        assertEquals(20, removed);
        assertEquals(1, container.size());
        assertEquals(10, container.get(0));
    }

    @Test
    public void testIsEmpty() {
        IntContainer container = new IntContainer();
        assertTrue(container.isEmpty());
        container.add(10);
        assertFalse(container.isEmpty());
        container.remove(0);
        assertTrue(container.isEmpty());
    }

    @Test
    public void testClear() {
        IntContainer container = new IntContainer();
        container.add(10);
        container.add(20);
        container.clear();
        assertTrue(container.isEmpty());
        assertEquals(0, container.size());
    }

    @Test
    public void testRemoveFromEmptyContainer() {
        IntContainer container = new IntContainer();
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }

    @Test
    public void testGetFromEmptyContainer() {
        IntContainer container = new IntContainer();
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
    }

    @Test
    public void testRemoveWithInvalidIndex() {
        IntContainer container = new IntContainer();
        container.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(1));
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(-1));
    }

    @Test
    public void testGetWithInvalidIndex() {
        IntContainer container = new IntContainer();
        container.add(10);
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(-1));
    }
}
