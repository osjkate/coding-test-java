package boj.step_by_step.deepening1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayList<String> grade = new ArrayList<>(Arrays.asList("F", "!", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"));

        int sum = 0;
        double sumScore = 0;

        int credit;
        int scoreTemp;
        double score;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            credit = Integer.parseInt(st.nextToken().substring(0, 1));
            scoreTemp = grade.indexOf(st.nextToken());
            if (scoreTemp == -1) continue;
            score = (double) scoreTemp * 0.5;
            sum += credit;
            sumScore += credit * score;
        }
        double ave = sumScore / sum;
        bw.write(ave + "");
        bw.close();
    }
}
