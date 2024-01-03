package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class hold2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(arr, key));
        }

//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < m; i++) {
//
//            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
//            if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
//                sb.append(1).append('\n');
//            }
//            else {
//                sb.append(0).append('\n');
//            }
//        }
//        System.out.println(sb);
    }

//    public static int binarySearch(int[] arr, int key) {
//        int from = 0;
//        int to = arr.length - 1;
//
//        while (from <= to) {
//            int mid = (from + to) / 2;
//
//            if (key < arr[mid]) {
//                to = mid - 1;
//            }
//            else if (key > arr[mid]) {
//                from = mid + 1;
//            }
//            else {
//                return 1;
//            }
//        }
//        return 0;
//    }

    public static int binarySearch(int[] arr, int key) {

        int lo = 0;					// 탐색 범위의 왼쪽 끝 인덱스
        int hi = arr.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스

        // lo가 hi보다 커지기 전까지 반복한다.
        while(lo <= hi) {

            int mid = (lo + hi) / 2;	// 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if(key < arr[mid]) {
                hi = mid - 1;
            }
            // key값이 중간 위치의 값보다 클 경우
            else if(key > arr[mid]) {
                lo = mid + 1;
            }
            // key값과 중간 위치의 값이 같을 경우
            else {
                return 1;
            }
        }

        // 찾고자 하는 값이 존재하지 않을 경우
        return 0;

    }
}
