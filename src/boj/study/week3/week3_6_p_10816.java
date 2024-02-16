package boj.study.week3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 틀림
public class week3_6_p_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            bw.write(count(arr, Integer.parseInt(st.nextToken())) + " ");
        }
        bw.close();
    }

    public static int count(ArrayList<Integer> arr, int key) {
        int count = 0;
        while (true) {
            if (binarySearch(arr, key) == -1) {
                break;
            } else {
                count++;
                arr.remove(binarySearch(arr, key));
            }
        }
        return count;
    }
    public static int binarySearch(ArrayList<Integer> arr, int key) {
        int start = 0;
        int end = arr.size() - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == arr.get(mid)) {
                return mid;
            } else if (key > arr.get(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
