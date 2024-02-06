package boj.study.week1;

import java.io.*;
import java.util.*;

public class week1_4_p_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }


        // 중복 제거
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        // Comparator 를 람다식으로 지정해주기
        // 양수를 반환하면 더 크다는 의미 -> 뒤로
        // 음수를 반환하면 더 작다는 의미 -> 앞으로
        Collections.sort(list, (x, y) -> {
            if (x.length() != y.length()) {
                return x.length() - y.length();
            } else {
                return x.compareTo(y);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.close();
    }
}
