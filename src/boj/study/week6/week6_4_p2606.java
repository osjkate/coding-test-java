package boj.study.week6;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class week6_4_p2606 {
    static boolean[] visited;
    static int[][] arr;
    static ArrayList<Integer> answer;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x, y;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                bw.write(arr[i][j] + " ");
//            }
//            bw.write("\n");
//        }
        count = 0;
        bw.write(dfsCount(N, 1) + "");
        bw.close();
    }

    public static int dfsCount(int N, int start) {
//        answer = new ArrayList<>();
//        answer.add(start);
        visited[start] = true;
        for (int i = 1; i <= N; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                count++;
                dfsCount(N, i);
            }
        }
        return count;
    }

}
