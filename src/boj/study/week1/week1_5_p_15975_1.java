package boj.study.week1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class week1_5_p_15975_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        long sum = 0;

        Arrays.sort(arr, (arr_1, arr_2) -> {
            if (arr_1[1] == arr_2[1]) {
                return (int) (arr_1[0] - arr_2[0]);
            } else {
                return (int) (arr_1[1] - arr_2[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (arr[i][1] == arr[i + 1][1]) {
                    sum += Math.abs(arr[i][0] - arr[i + 1][0]);
                }
            }
            else if (i == N - 1) {
                if (arr[i][1] == arr[i - 1][1]) {
                    sum += Math.abs(arr[i][0] - arr[i - 1][0]);
                }
            }
            else {
                if (arr[i][1] == arr[i + 1][1] && arr[i][1] == arr[i - 1][1]) {
                    sum += Math.min(Math.abs(arr[i][0] - arr[i + 1][0]),
                            Math.abs(arr[i][0] - arr[i - 1][0]));
                }
                else if (arr[i][1] == arr[i + 1][1]) sum += Math.abs(arr[i][0] - arr[i + 1][0]);
                else if (arr[i][1] == arr[i - 1][1]) sum += Math.abs(arr[i][0] - arr[i - 1][0]);
            }
//            bw.write(", sum = " + sum + "\n");
        }
        bw.write(sum + "");
        bw.close();
    }
}
