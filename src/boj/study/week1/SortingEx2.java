package boj.study.week1;

import java.util.Arrays;

public class SortingEx2 {

    public static void main(String[] args) {
        int[] array = {230, 10, 60, 550, 40, 220, 20};
        System.out.println("힙 정렬");
        heapSort(array);
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("--------------------------------------------");
        System.out.println("계수 정렬");
        int[] array2 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        radixSort(array2, array2.length);
        for (int x : array2) {
            System.out.print(x + " ");
        }
    }
    /**
     * 병합 정렬
     */
    public void mergeSort(int[] array, int left, int right) {
        int mid = (left + right) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);

    }

    public void merge(int[] array, int left, int mid, int right) {
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

        /**
         * 둘 중 한 배열이 모두 소진되었을 때,
         * 나머지 배열을 끝까지 넣어줌
         */
        while (i < ll) {
            array[k++] = L[i++];
        }
        while (j < rl) {
            array[k++] = R[j++];
        }
    }

    /**
     * 힙 정렬
     */
    // 길이 & 정렬 전 초기 루트
    public static void heapify(int array[], int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        // 왼쪽 자식 노드
        if (l < n && array[p] < array[l]) {
            p = l;
        }
        if (r < n && array[p] < array[r]) {
            p = r;
        }

        // p가 바뀌었으면, == i(루트 노드가 제일 큰 값이 아니라면
        if (i != p) {
            swap(array, p, i);
            heapify(array, n, p);
        }
    }


    public static void heapSort(int[] array) {
        int n = array.length;
        // [4, 2, 7, 1, 6, 5, 3]

        // max heap 초기화
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
            // (array, 7, 2) -> 2, 5, 6 -> [4, 2, 7, 1, 6, 5, 3]
            // (array, 7, 1) -> 1, 3, 4 -> [4, 6, 7, 1, 2, 5, 3]
            // (array, 7, 0) -> 0, 1, 2 -> [7, 6, 4, 1, 2, 5, 3]
            // (array, 7, 2) -> 2, 5, 6 -> [7, 6, 5, 1, 2, 4, 3]
        }

        // extract 연산
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    /**
     *
     * @param arr
     * @param n : 갯수
     * @param exp : 자릿수
     */
    public static void countSort(int[] arr, int n, int exp) {
        // {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
        int[] buffer = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // exp의 자릿수에 해당하는 count 증가
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
            // 514 / 10 = 51 -> 1
            // 514 / 1 = 514 -> 4
        }
        // count == [1, 0, 1, 1, 2, 2, 3, 2, 2, 1]

        // 누적합 구하기
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // count == [1, 1, 2, 3, 5, 7, 10, 12, 14, 15]

        // 일반적인 Counting sort 과정
        for (i = n - 1; i >= 0; i--) {
            buffer[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        // buffer == [50, 2, 3, 44, 4, 5, 15, 36, 26, 46, 0, 47, 27, 38, 48, 19]

        for (i = 0; i < n; i++) {
            arr[i] = buffer[i];
        }
    }

    public static void radixSort(int arr[], int n) {
        // 최댓값의 자릿수만큼 counting 정렬 반복
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    public static int getMax(int[] arr, int n) {
        int maxNum = 0;
        for (int x : arr) {
            if (maxNum < x) {
                maxNum = x;
            }
        }
        return maxNum;
    }
    public static void countingSort(int[] arr, int n) {
        // {5, 4, 3, 2, 1}

        int[] buffer = new int[n];
        int m = getMax(arr, n);
        int[] count = new int[m + 1];
        // 최댓값이 담길 수 있도록 사이즈 잡기

        // count 배열의 값을 증가시켜주기
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // count == {0, 1, 1, 1, 1, 1}

        // 누적합 구해주기
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // count == {0, 1, 2, 3, 4, 5}

        for (int i = arr.length - 1; i >= 0; i--) {
            count[arr[i]]--;
            buffer[count[arr[i]]] = arr[i];
        }
    }

}
