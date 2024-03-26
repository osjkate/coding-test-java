package boj.study.week7;

import java.io.*;
import java.util.StringTokenizer;

public class p1_2961 {
    static int N;
    static int[] S, B;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        S = new int[N];
        B = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
        DFS(1, 0, 0, 0);
        bw.write(answer + "");
        bw.close();
    }

    // 전체를 탐색하는 DFS
    public static void DFS(int s, int b, int depth, int selectedCount) {
        if (depth == N) {
            if (selectedCount != 0 && Math.abs(s - b) < answer) {
                answer = Math.abs(s - b);
            }
            return;
        }
        // 해당 재료를 포함하거나, 포함하지 않거나
        DFS(s * S[depth], b + B[depth], depth + 1, selectedCount + 1);
        DFS(s, b, depth + 1, selectedCount);
    }
}
