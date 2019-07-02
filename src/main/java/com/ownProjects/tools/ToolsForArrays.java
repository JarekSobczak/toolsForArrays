package com.ownProjects.tools;

public class ToolsForArrays {

    public static <T> void displayArray(T[] array) {
        for (T component : array) {
            System.out.println(component);
        }
    }

    public static <T> void reverseArray(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static <T extends Comparable<T>> void displayBiggerThan(T[] array, T biggerThan) {
        for (T component : array) {
            if (component.compareTo(biggerThan) > 0) {
                System.out.println(component);
            }
        }
    }

    public static <T extends Comparable<T>> T maximal(T[] array) {
        if (array.length == 0) {
            return null;
        }
        T maximal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maximal) > 0) {
                maximal = array[i];
            }
        }
        return maximal;
    }
}
