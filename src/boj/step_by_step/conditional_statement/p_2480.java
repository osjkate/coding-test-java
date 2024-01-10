package boj.step_by_step.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.util.Collections.max;

public class p_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (map.containsKey(k)) {
                int value = map.get(k);
                map.put(k, ++value);
            } else map.put(k, 1);
        }

        if (map.containsValue(3)) {
            for (int key : map.keySet()) {
                System.out.println(10000 + key * 1000);
            }
        }
        else if (map.containsValue(2)) {
            for (int key : map.keySet()) {
                if (map.get(key) == 2) System.out.println(1000 + key * 100);
            }
        } else System.out.println(max(map.keySet()) * 100);
    }
}
