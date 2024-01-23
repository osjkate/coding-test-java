package boj.step_by_step.deepening1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class p_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        str = str.toUpperCase();
        for (char x : str.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        char maxChar = '?';
        int maxNum = 0;
        for (char x : map.keySet()) {
            if (map.get(x) > maxNum) {
                maxChar = x;
                maxNum = map.get(x);
            } else if (map.get(x) == maxNum) {
                maxChar = '?';
            }
        }
        bw.write(maxChar);
        bw.close();
    }
}
