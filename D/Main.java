import java.util.*;

public class Main {
    private static void reverse(char[] result) {
        int l = 0, r = result.length - 1;
        while (l < r) {
            char temp = result[l];
            result[l] = result[r];
            result[r] = temp;
            ++l;
            --r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String nn = String.format("%04d", n);
        if (nn.charAt(0) == nn.charAt(1) && nn.charAt(1) == nn.charAt(2) && nn.charAt(2) == nn.charAt(3)) {
            System.out.printf("%s - %s = 0000\n", nn, nn);
        } else {
            char[] result = nn.toCharArray();
            Arrays.asList(result);
            while (true) {
                Arrays.sort(result);
                int after = Integer.parseInt(String.valueOf(result));
                reverse(result);
                int before = Integer.parseInt(String.valueOf(result));
                String rst = String.format("%04d", before - after);
                result = rst.toCharArray();
                System.out.printf("%04d - %04d = %s\n", before, after, rst);
                if (rst.equals("6174")) {
                    break;
                }
            }
        }
    }
}
