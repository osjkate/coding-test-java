package boj.study.week6;

import java.io.*;
import java.util.StringTokenizer;

public class week6_5_p10451 {
    static int[][] arr;
    static int count;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int N, num;
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1][N + 1];

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                num = Integer.parseInt(st.nextToken());
                arr[j][num] = 1;
            }

            count = 0;
            visited = new boolean[N + 1];

            bw.write(cycle(N, 1) + "\n");
        }
        bw.close();
    }

    public static int cycle(int N, int start) {
        visited[start] = true;
        for (int i = 1; i <= N; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                visited[i] = true;
                cycle(N, i);
            } else if (arr[start][i] == 1 && visited[i]) {
                count++;
                break;
            }
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                cycle(N, i);
            }
        }
        return count;


    }
}
