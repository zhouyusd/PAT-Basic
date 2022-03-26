import java.io.*;

public class Main {
    // 输入
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // 输出
    static PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] inputs = reader.readLine().split(" ");
        String a = inputs[0];
        int b = inputs[1].charAt(0) - 48;
        int div = (a.charAt(0) - 48) / b;
        int mod = (a.charAt(0) - 48) % b;
        if (div > 0 || a.length() == 1) {
            writer.print(div);
        }
        for (int i = 1; i < a.length(); ++i) {
            div = (mod * 10 + a.charAt(i) - 48) / b;
            mod = (mod * 10 + a.charAt(i) - 48) % b;
            writer.print(div);
        }
        writer.println(" " + mod);
        writer.flush();
    }
}
