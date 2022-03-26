#include <iostream>
using namespace std;

int main() {
    string a;
    int b;
    cin >> a >> b;
    int sz = a.size();
    int div = (a[0] - '0') / b;
    int mod = (a[0] - '0') % b;
    if (div || sz == 1) {
        cout << div;
    }
    for (int i = 1; i < sz; ++i) {
        div = (mod * 10 + a[i] - '0') / b;
        mod = (mod * 10 + a[i] - '0') % b;
        cout << div;
    }
    cout << " " << mod << endl;
    return 0;
}