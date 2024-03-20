package boj.study.week6;

import java.io.*;
import java.util.StringTokenizer;

public class week6_2_p15651 {
    static int[] arr;
    static StringBuffer sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        sb = new StringBuffer();
        dfs(N, M, 0);

        bw.write(sb.toString());
        bw.close();
    }


    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(N, M, depth + 1);
        }
    }
    // System.out.println();이게 너무 느려서 시간초과 뜸
}
