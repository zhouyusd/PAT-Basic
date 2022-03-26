#include <algorithm>
#include <iostream>
using namespace std;

void fill_zero(string &s, int width = 4) {
    while (int(s.size()) < width) {
        s = "0" + s;
    }
}

int main() {
    string n;
    cin >> n;
    fill_zero(n);
    if (n[0] == n[1] && n[1] == n[2] && n[2] == n[3]) {
        cout << n << " - " << n << " = 0000" << endl;
    } else {
        string result = n;
        while (1) {
            sort(result.begin(), result.end(), greater<char>());
            string before = result;
            reverse(result.begin(), result.end());
            string after = result;
            result = to_string(stoi(before) - stoi(after));
            fill_zero(result);
            cout << before << " - " << after << " = " << result << endl;
            if (result == "6174") {
                break;
            }
        }
    }
    return 0;
}