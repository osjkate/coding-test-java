package boj.study.week2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class week2_2_p_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0, score, index;
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            score = Collections.max(arr);
            sum += score;
            index = arr.indexOf(score);
            num.add(index + 1);
            arr.set(index, 0);
        }
        Collections.sort(num);
        bw.write(sum + "\n");
        for (int x : num) {
            bw.write(x + " ");
        }
        bw.close();
    }
}
