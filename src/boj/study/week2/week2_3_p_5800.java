package boj.study.week2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class week2_3_p_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int N;
        int maxNum, minNum, maxDif, dif;

        for (int i = 0; i < X; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            maxNum = 0; minNum = 100; maxDif = 0;
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if (maxNum < arr[j]) maxNum = arr[j];
                if (minNum > arr[j]) minNum = arr[j];
            }
            Arrays.sort(arr);
            for (int j = 1; j < N; j++) {
                dif = Math.abs(arr[j] - arr[j - 1]);
                if (maxDif < dif) maxDif = dif;
            }
            bw.write("Class " + (i + 1) + "\n");
            bw.write("Max " + maxNum + ", Min " + minNum + ", Largest gap " + maxDif + "\n");
        }
        bw.close();
    }
}
