package boj.study.week1;

import java.io.*;
import java.util.Arrays;

public class p_2750_week1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
//        Arrays.sort(arr);
        mergeSort(arr, 0, N - 1);
        for (int x : arr) {
            bw.write(x + "\n");
        }
        bw.close();
    }

    static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    static void merge(int[] array, int left, int mid, int right) {
        int[] L = Arrays.copyOfRange(array, left, mid + 1);
        int[] R = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        int ll = L.length, rl = R.length;
        while (i < ll && j < rl) {
            if (L[i] <= R[j]) {
                array[k] = L[i++];
            } else {
                array[k] = R[j++];
            }
            k++;
        }

        while (i < ll) {
            array[k++] = L[i++];
        }
        while (j < rl) {
            array[k++] = R[j++];
        }
    }
}
