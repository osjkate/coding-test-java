package boj.study.week1;

import java.util.Arrays;

public class SortingEx {
    void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    void insertionSort(int[] arr) {
        int temp, prev;
        for (int index = 1; index < arr.length; index++) {
            temp = arr[index];
            prev = index - 1;
            while ((prev >= 0) && (arr[prev] > temp)) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivot = start;
        int low = start + 1;
        int hight = end;

        while (low <= hight) {
            while (low <= end && arr[low] <= arr[pivot]) low++;
            while (hight > start && arr[hight] >= arr[pivot]) hight--;
            if (low > hight) swap(arr, hight, pivot);
            else swap(arr, low, pivot);
        }

        quickSort(arr, start, hight - 1);
        quickSort(arr, hight + 1, end);
    }

    void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
