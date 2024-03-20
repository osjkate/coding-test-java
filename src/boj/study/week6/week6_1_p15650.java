package boj.study.week6;

import java.io.*;
import java.util.StringTokenizer;

public class week6_1_p15650 {
    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];
        arr = new int[M];

        dfs(N, M, 0, 1);
    }

    // before 값을 받아서 for 문 돌때, 전의 값보다 높은 값부터 돌 수 있도록 설정
    public static void dfs(int N, int M, int depth, int before) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = before; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                dfs(N, M, depth + 1, i);
                visit[i] = false;
            }
        }
    }
}
