package boj.step_by_step.string;

import java.io.*;

public class p_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        final String S = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = S.toCharArray();
//        for (char x : arr) {
//            System.out.println(x);
//        }
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = str.indexOf(arr[i]);
        }
        for (int x : answer) {
            bw.write(x + " ");
        }
        bw.close();
    }
}
