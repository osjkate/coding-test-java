package boj.study.week1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class week1_3_p_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (arr_1, arr_2) -> {
            if (arr_1[1] == arr_2[1]) {
                return arr_1[0] - arr_2[0];
            }
            else {
                return arr_1[1] - arr_2[1];
            }
        });
        for (int i = 0; i < N; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        bw.close();
    }
}
