#include <algorithm>
#include <cstdio>
#include <iostream>
using namespace std;

struct Goods {
    double kucun;
    double value;
    double unit;

    bool operator<(const Goods &oth) const { return unit > oth.unit; }
} goodses[1010];

int main() {
    int n;
    double d;
    cin >> n >> d;
    for (int i = 0; i < n; ++i) {
        cin >> goodses[i].kucun;
    }
    for (int i = 0; i < n; ++i) {
        cin >> goodses[i].value;
        goodses[i].unit = goodses[i].value / goodses[i].kucun;
    }
    sort(goodses, goodses + n);
    double maxProfit = 0;
    for (int i = 0; i < n; ++i) {
        if (d >= goodses[i].kucun) {
            maxProfit += goodses[i].value;
            d -= goodses[i].kucun;
        } else {
            maxProfit += goodses[i].unit * d;
            break;
        }
    }
    printf("%.2f\n", maxProfit);
    return 0;
}