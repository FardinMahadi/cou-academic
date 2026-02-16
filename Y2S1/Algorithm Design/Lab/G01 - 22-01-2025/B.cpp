#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    if (!(cin >> n)) return 0;

    vector<int> c(n);
    for (int i = 0; i < n; i++) cin >> c[i];

    int x;
    cin >> x;

    sort(c.rbegin(), c.rend());

    int totalCoins = 0;

    for (int i = 0; i < n; i++) {
        if (x == 0) break;

        if (x >= c[i]) {
            totalCoins += x / c[i];
            x %= c[i];
        }
    }

    cout << totalCoins << endl;

    return 0;
}
