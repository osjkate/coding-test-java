package boj.silver;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class p_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String[] s;
        String extension;
        for (int i = 0; i < N; i++) {
            s = br.readLine().split("\\.");
            extension = s[1];
            if (map.containsKey(extension)) {
                map.put(extension, map.get(extension) + 1);
            } else {
                map.put(extension, 1);
            }
        }
        String[] keyArr = map.keySet().toArray(new String[0]);
        Arrays.sort(keyArr);
        for (String x : keyArr) {
            bw.write(x + " " + map.get(x) + "\n");
        }
        bw.close();
    }
}
