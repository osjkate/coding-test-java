package boj.step_by_step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (char x : s.toCharArray()) {
            sum += Character.getNumericValue(x);
        }
        System.out.println(sum);
    }
}
