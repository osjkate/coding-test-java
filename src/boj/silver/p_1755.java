package boj.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class p_1755 {
    static String[] en = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        LinkedList<String> listS = new LinkedList<>();
        LinkedList<Integer> listN = new LinkedList<>();

        for (int i = M; i <= N; i++) {
            int ten = i / 10;
            int one = i % 10;

            if (ten == 0) {
                listS.add(en[one]);
                continue;
            }
            listS.add(en[ten] + " " + en[one]);
        }

        // 사전 순으로 배열
        listS.sort(null);

        while (!listS.isEmpty()) {
            String temp = listS.poll();
            if (temp.contains(" ")) {
                st = new StringTokenizer(temp);
                int ten = findnum(st.nextToken());
                int one = findnum(st.nextToken());
                listN.add(ten * 10 + one);
            } else {
                listN.add(findnum(temp));
            }
        }
        while (!listN.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                if (listN.isEmpty()) {
                    return;
                }
                System.out.print(listN.poll() + " ");
//                bw.write(listN.poll() + " ");
            }
            System.out.println();
//            bw.write("\n");
        }
        bw.close();
    }
    static int findnum(String input) {
        for (int i = 0; i <= 9; i++) {
            if (input.equals(en[i])) {
                return i;
            }
        }
        return 0;
    }
}
