package boj.study.week2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class week2_4_p_8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][5];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bw.write("정렬 전 \n");
        for (int i = 0; i < N; i++) {
            bw.write(i + 1 + "번째 : ");
            for (int x : arr[i]) {
                bw.write( x + " ");
            }
            bw.write("\n");
        }
        Arrays.sort(arr, (x, y) -> {
            if (x[1] != y[1]) return y[1] - x[1];
            else if (x[2] != y[2]) return y[2] - x[2];
            else if (x[3] != y[3]) return y[3] - x[3];
            else {
                x[4] = y[4] + 1;
                return 0;
            }
        });

        bw.write("정렬 후 \n");
        for (int i = 0; i < N; i++) {
            bw.write(i + 1 + "번째 : ");
            for (int x : arr[i]) {
                bw.write( x + " ");
            }
            bw.write("\n");
        }
        int count = 1;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] == K) {
                bw.write(count - arr[i][4] + "");
            }
            count++;
        }

        bw.close();
    }
}
