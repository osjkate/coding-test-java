package boj.study.week7;

import java.io.*;
import java.util.StringTokenizer;

public class p4_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int idx = 0, i = 0;
        for (i = 0; i < N; i++) {
            if (arr[i] > K) {
                idx = i - 1;
                break;
            }
        }
        if (i == N) idx = N - 1;
        int count = 0;
        while (K != 0) {
            if (K < arr[idx]) idx -= 1;
            else {
                K -= arr[idx];
                count++;
            }
        }
        bw.write(count + "");
        bw.close();
    }
}
