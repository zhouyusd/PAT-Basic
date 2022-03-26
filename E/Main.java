import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<Goods> goodses = new TreeSet<>();
        String[] line1 = reader.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        double d = Double.parseDouble(line1[1]);
        String[] kucuns = reader.readLine().split(" ");
        String[] values = reader.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            goodses.add(new Goods(Double.parseDouble(kucuns[i]), Double.parseDouble(values[i])));
        }
        double maxProfit = 0;
        for (Goods goods : goodses) {
            if (d >= goods.kucun) {
                maxProfit += goods.value;
                d -= goods.kucun;
            } else {
                maxProfit += goods.unit * d;
                break;
            }
        }
        System.out.printf("%.2f\n", maxProfit);
    }
}

class Goods implements Comparable<Goods> {
    public double kucun;
    public double value;
    public double unit;

    public Goods(double kucun, double value) {
        this.kucun = kucun;
        this.value = value;
        this.unit = value / kucun;
    }

    @Override
    public int compareTo(Goods o) {
        return o.unit > this.unit ? 1 : -1;
    }
}
