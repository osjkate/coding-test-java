package boj.study.week1;

import java.io.*;

public class p_2751_week1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//        Arrays.sort(arr);
        quickSort(arr);
        for (int x : arr) {
            bw.write(x + "\n");
        }
        bw.close();
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = start;
        int low = start + 1;
        int high = end;

        while (low <= high) {
            while (low <= end && arr[low] <= arr[pivot]) low++;
            while (high >= start + 1 && arr[high] >= arr[pivot]) high--;
            if (low > high) break;
            swap(arr, low, high);
        }


        swap(arr, pivot, high);

        quickSort(arr,  start, high - 1);
        quickSort(arr, high + 1, end);
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // 퀵 정렬로 하면 시간초과 뜸..
}
