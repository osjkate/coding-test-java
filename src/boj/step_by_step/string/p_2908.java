package boj.step_by_step.string;

import java.io.*;
import java.util.StringTokenizer;

public class p_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        // 1. Collections.reverse()
//        ArrayList<Integer> array = new ArrayList<>();
//        Collections.reverse(array);

        // 2. 반복문 사용하기
        int a = reverse(A);
        int b = reverse(B);
        bw.write(Math.max(a, b) + "\n");
        bw.close();
    }

    static int reverse(char[] arr) {
        char[] reverse = new char[arr.length];
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        for (char x : reverse) {
            answer.append(x);
        }
        return Integer.parseInt(String.valueOf(answer));
    }
}
