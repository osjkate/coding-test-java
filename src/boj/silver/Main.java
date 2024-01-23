package boj.silver;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int N;
        String[] arr;
        String first = "";
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < N; j++) {
                if (first.equals("")) {
                    first = arr[j];
                    answer = new StringBuilder(arr[j]);
                } else {
                    if (first.compareTo(arr[j]) < 0) {
                        answer.append(arr[j]);
                    } else {
                        first = arr[j];
                        answer.insert(0, arr[j]);
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.close();
    }
}
