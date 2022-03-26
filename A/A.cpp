#include <iostream>
using namespace std;

int main() {
    int a, da, b, db;
    cin >> a >> da >> b >> db;
    int pa = 0, pb = 0;
    while (a) {
        if (a % 10 == da) {
            pa = pa * 10 + da;
        }
        a /= 10;
    }
    while (b) {
        if (b % 10 == db) {
            pb = pb * 10 + db;
        }
        b /= 10;
    }
    cout << pa + pb << endl;
    return 0;
}