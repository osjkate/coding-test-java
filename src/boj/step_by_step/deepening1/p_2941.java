package boj.step_by_step.deepening1;

import java.io.*;

public class p_2941 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char[] spell = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < spell.length; i++) {
            if (i == spell.length - 1) {
                cnt++;
                break;
            }
            switch (spell[i]) {
                case 'c':

                    if (spell[i+1] == '=' || spell[i+1] == '-') {
                        i++;
                        cnt++;
                    } else cnt++;
                    break;
                case 'd':
                    if (spell[i+1] == '-') {
                        i++;
                        cnt++;
                    } else if (spell[i + 1] == 'z') {
                        if (i + 1 == str.length() - 1) {
                            cnt += 2;
                            i++;
                            break;
                        }
                        if (spell[i + 2] == '=') {
                            i += 2;
                            cnt++;
                        }
                    } else cnt++;
                    break;
                case 'l': case 'n':
                    if (spell[i + 1] == 'j') {
                        i++;
                        cnt++;
                    } else cnt++;
                    break;
                case 's': case 'z':
                    if (spell[i + 1] == '=') {
                        i++;
                        cnt++;
                    } else cnt++;
                    break;
                default:
                    cnt++;
            }
        }
        bw.write(cnt + "");
        bw.close();
    }*/
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], "!");
            }
        }
        bw.write(str.length() + "");
        bw.close();
    }
}
