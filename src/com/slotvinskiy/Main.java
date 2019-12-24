package com.slotvinskiy;

import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();
    public static final int BOUNCE = 10;
    public static final int LIST_SIZE = 7;

    public static void main(String[] args) {

        MyList list = new MyList();
        fillArray(list, LIST_SIZE);
        System.out.println("Initialisation of new List: " + list.toString());
        list.sort();
        System.out.println("Sorted List: " + list.toString());
        System.out.println("List size is " + list.size());
        int index = 3;
        System.out.printf("To get List index %s: %s\n", index, list.get(index));
        int value = 77;
        list.set(index, value);
        System.out.printf("To set List index %s as %s: %s\n", index, value, list.toString());
        value = 55;
        list.add(value);
        System.out.printf("To add %s: %s\n", value, list.toString());
        printIsEmpty(list);
        index = 3;
        value = 33;
        list.add(index, value);
        System.out.printf("Insert %s in position %s: %s\n", value, index, list.toString());
        list.remove(index);
        System.out.printf("Remove value in position %s: %s\n", index, list.toString());
        value = 77;
        list.removeByValue(value);
        System.out.printf("Remove by value (%s): %s\n", value, list.toString());
        System.out.println("Method toArray" + list.toArray());
        System.out.println("Clear array");
        list.clear();
        System.out.println(list.toString());
        printIsEmpty(list);
    }

    private static void printIsEmpty(MyList list) {
        if (list.isEmpty()) {
            System.out.println("It's empty");
        } else {
            System.out.println("It's not empty");
        }
    }

    private static void fillArray(MyList List, int size) {
        for (int i = 0; i < size; i++) {
            List.add(RANDOM.nextInt(BOUNCE));
        }
    }
}

