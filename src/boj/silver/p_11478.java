package boj.silver;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class p_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Set set = new TreeSet();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                set.add(str.substring(i, j + 1));   // substring에서 마지막은 안들어감
            }
        }
        bw.write(set.size() + "");
        bw.close();
    }
}
