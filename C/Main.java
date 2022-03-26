import java.io.*;
import java.util.*;

public class Main {
    // 输入
    static class Reader {
        static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        static int nextInt() throws IOException {
            in.nextToken();
            return (int) in.nval;
        }

        static String next() throws IOException {
            in.nextToken();
            return in.sval;
        }
    }

    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    private static int check(char a, char b) {
        if (a == b) {
            return 0;
        }
        if (a == 'J' && b == 'B') {
            return 1;
        }
        if (a == 'B' && b == 'C') {
            return 1;
        }
        if (a == 'C' && b == 'J') {
            return 1;
        }
        return -1;
    }

    // a[0]: B
    // a[1]: C
    // a[2]: J
    private static char maxWin(int[] a) {
        if (a[0] >= a[1] && a[0] >= a[2]) {
            return 'B';
        }
        if (a[1] >= a[0] && a[1] >= a[2]) {
            return 'C';
        }
        return 'J';
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] cntJia = new int[3];
        int[] winJia = new int[3];
        int[] winYi = new int[3];
        Map<Character, Integer> map = new HashMap<>();
        map.put('B', 0);
        map.put('C', 1);
        map.put('J', 2);
        int n = Reader.nextInt();
        for (int i = 0; i < n; ++i) {
            char j = Reader.next().charAt(0);
            char y = Reader.next().charAt(0);
            switch (check(j, y)) {
                case 1:
                    ++cntJia[0];
                    ++winJia[map.get(j)];
                    break;
                case -1:
                    ++cntJia[2];
                    ++winYi[map.get(y)];
            }
        }
        cntJia[1] = n - cntJia[0] - cntJia[2];
        out.println(cntJia[0] + " " + cntJia[1] + " " + cntJia[2]);
        out.println(cntJia[2] + " " + cntJia[1] + " " + cntJia[0]);
        out.println(maxWin(winJia) + " " + maxWin(winYi));
        out.flush();
    }
}
