package ru.ezhak.dataStructure;

public class ArrayMethod {
    public static int[] add(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = num;
        return newArr;
    }

    public static int[] add(int[] arr, int ind, int num) {
        if (arr.length < ind) return ArrayMethod.add(arr, num);
        else if (0 > ind) ind = 0;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < ind; i++) {
            newArr[i] = arr[i];
        }
        newArr[ind] = num;
        for (int i = ind + 1; i < arr.length + 1; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
