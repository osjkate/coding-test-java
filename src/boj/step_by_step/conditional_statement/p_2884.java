package boj.step_by_step.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M < 45) {
            if (H == 0) {
                H = 23;

            } else H -= 1;
            M = 60 - (45 - M);
        } else M -= 45;
        System.out.println(H + " " + M);
    }
}
