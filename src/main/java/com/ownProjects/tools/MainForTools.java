package com.ownProjects.tools;

public class MainForTools {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{0, 2, 45, 67, 8, 97, 11, 1, 33};
        ToolsForArrays.reverseArray(array);
        ToolsForArrays.displayArray(array);
        ToolsForArrays.displayBiggerThan(array, 33);
        System.out.println(ToolsForArrays.maximal(array));
    }
}
