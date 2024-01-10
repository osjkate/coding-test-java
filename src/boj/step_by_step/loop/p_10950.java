package boj.step_by_step.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        String s;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + B[i]);
        }
    }
}
