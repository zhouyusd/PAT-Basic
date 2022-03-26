import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int da = sc.nextInt();
        int b = sc.nextInt();
        int db = sc.nextInt();
        int pa = 0, pb = 0;
        while (a > 0) {
            if (a % 10 == da) {
                pa = pa * 10 + da;
            }
            a /= 10;
        }
        while (b > 0) {
            if (b % 10 == db) {
                pb = pb * 10 + db;
            }
            b /= 10;
        }
        System.out.println(pa + pb);
        sc.close();
    }
}