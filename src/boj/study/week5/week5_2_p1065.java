package boj.study.week5;

import java.io.*;
import java.util.stream.Stream;

public class week5_2_p1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            arr = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
            if (isHansu(arr)) {
                count++;
            }
        }
        bw.write(count + "");
        bw.close();
    }

    public static boolean isHansu(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
