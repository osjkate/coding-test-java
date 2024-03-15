package boj.study.week5;

import java.io.*;
import java.util.StringTokenizer;

public class week5_3_p15649 {
    static boolean[] visit;
    static int[] arr;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);
    }

    public static void dfs(int N, int M, int depth) throws IOException{
        // 재귀의 깊이가 M이 되면 배열 출력
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            // 해당 노드를 방문하지 않은 경우
            if (!visit[i]) {
                visit[i] = true;    // 방문 상태로 변경
                arr[depth] = i + 1; // 깊이 (재귀 횟수)를 index로 하여 i + 1의 값을 저장한다.
                dfs(N, M, depth + 1); // 다음 자식 노드 방문을 위해 depth를 1 증가시키면서 재귀 호출

                // 자식 노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경한다.
                visit[i] = false;
            }
        }
    }
}
