package boj.study.week6;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class week6_3_p1260 {
    static boolean[] visited_arr;
    static int[][] tree;
    static int count;
    static int N;
    static Queue<Integer> que = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        tree = new int[1001][1001];
        visited_arr = new boolean[1001];

        // 간선이 있으면 그 부분을 1로 만들어줌
        // 인접 행렬 사용
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree[x][y] = tree[y][x] = 1;
        }

        DFS(V);
        System.out.println();
        // 다시 방문 노드 초기화 -> DFS와 BFS는 방문한 노드를 다시 방문하지 않음
        visited_arr = new boolean[1001];
        BFS(V);

    }
    public static void DFS(int start) {
        visited_arr[start] = true;
        System.out.print(start + " ");

        // 정점을 모두 돌았다면, return
        if (count == N) {
            return;
        }
        count++;

        // 만약 start와 간선이 있고, 방문하지 않았으면 그 점을 기준으로 다시 DFS
        // 재귀 사용
        for (int i = 1; i <= N; i++) {
            if (tree[start][i] == 1 && !visited_arr[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int start) {
        que.offer(start);
        visited_arr[start] = true;
        System.out.print(start + " ");

        while (!que.isEmpty()) {
            start = que.poll();

            for (int i = 1; i <= N; i++) {
                if (tree[start][i] == 1 && !visited_arr[i]) {
                    que.offer(i);
                    visited_arr[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
