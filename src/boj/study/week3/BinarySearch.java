package boj.study.week3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 11, 15, 30, 32, 45};
        int key = 8;
        int answer = solution(arr, key);
        System.out.println(answer);
    }
    public static int solution(int[] arr, int M) {
//        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (M == arr[mid]) {
                return mid;
            } else if (M > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("타겟이 존재하지 않음");
    }
}
