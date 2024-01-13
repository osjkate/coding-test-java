package boj.step_by_step.string;

import java.io.*;

public class p_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int sum = 0;
        for (char x : str.toCharArray()) {
            int k = x;
            if (k < 68) {
                sum += 3;
            } else if (k < 71) {
                sum += 4;
            } else if (k < 74) {
                sum += 5;
            } else if (k < 77) {
                sum += 6;
            } else if (k < 80) {
                sum += 7;
            } else if (k < 84) {
                sum += 8; // PQRS
            } else if (k < 87) {
                sum += 9;
            } else {
                sum += 10;
            }
        }
        bw.write(sum + "\n");
        bw.close();
    }
}
