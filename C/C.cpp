#include <iostream>
using namespace std;

int mapIndex(char a) {
    if (a == 'B') {
        return 0;
    }
    if (a == 'C') {
        return 1;
    }
    return 2;
}

int check(char a, char b) {
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
char maxWin(int a[3]) {
    if (a[0] >= a[1]) {
        if (a[0] >= a[2]) {
            return 'B';
        } else {
            return 'J';
        }
    } else {
        if (a[1] >= a[2]) {
            return 'C';
        } else {
            return 'J';
        }
    }
}

int cntJia[3], cntYi[3];
int winJia[3], winYi[3];
int main() {
    int n;
    char j, y;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> j >> y;
        switch (check(j, y)) {
        case 1:
            ++cntJia[0];
            ++cntYi[2];
            ++winJia[mapIndex(j)];
            break;
        case -1:
            ++cntJia[2];
            ++cntYi[0];
            ++winYi[mapIndex(y)];
        }
    }
    cntJia[1] = n - cntJia[0] - cntJia[2];
    cout << cntJia[0] << " " << cntJia[1] << " " << cntJia[2] << endl;
    cout << cntYi[0] << " " << cntJia[1] << " " << cntYi[2] << endl;
    cout << maxWin(winJia) << " " << maxWin(winYi) << endl;
    return 0;
}