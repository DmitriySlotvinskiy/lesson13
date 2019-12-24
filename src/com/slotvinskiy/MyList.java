package com.slotvinskiy;

import java.util.Arrays;

public class MyList {

    private int[] arr = new int[0];

    public int get(int index) {
        if (index >= arr.length) {
            printWarning(index);
            return -1;
        }
        return arr[index];
    }

    public void set(int index, int value) {
        if (index >= arr.length) {
            printWarning(index);
            return;
        }
        arr[index] = value;
    }

    public void add(int value) {

        int[] temp = Arrays.copyOf(arr, arr.length + 1);
        temp[arr.length] = value;
        arr = temp;
    }

    public void clear() {
        arr = new int[0];
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // опционально

    public void add(int index, int value) {
        if (index >= arr.length) {
            printWarning(index);
            return;
        }
        int[] temp = new int[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index, temp, index + 1, temp.length - index - 1);
        temp[index] = value;
        arr = temp;
    }

    public void remove(int index) {
        if (index >= arr.length) {
            printWarning(index);
            return;
        }
        int[] temp = new int[arr.length - 1];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, temp.length - index);
        arr = temp;
    }


    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                remove(i);
            }
        }
    }

    public int[] toArray() {
        return arr;
    }

    public void sort() {
        Arrays.sort(arr);
    }

    private void printWarning(int index) {
        System.out.printf((char) 27 + "[31mWarning! " + index +
                " is out of bound\n " + (char)27 + "[0m");
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}