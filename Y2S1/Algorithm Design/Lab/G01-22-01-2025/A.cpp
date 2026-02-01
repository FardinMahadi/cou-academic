// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 01

#include <bits/stdc++.h>
using namespace std;

int main() {
    int w, n;
    cin >> w >> n;

    vector<pair<int, int>> items(n);
    for (int i = 0; i < n; i++) cin >> items[i].first >> items[i].second;

    vector<pair<double, int>> unit(n);
    for (int i = 0; i < n; i++)
        unit[i] = make_pair((double)items[i].second / items[i].first, i);

    sort(unit.begin(), unit.end(), greater<pair<double, int>>());

    double res = 0.0;
    int currentW = 0;

    for (int i = 0; i < n; i++) {
        int idx = unit[i].second;

        if (currentW + items[idx].first <= w) {
            currentW += items[idx].first;
            res += items[idx].second;
        } else {
            int remaining = w - currentW;
            res += items[idx].second *
                   ((double)remaining / items[idx].first);
            break;
        }
    }

    cout << fixed << setprecision(1) << res << "\n";

    return 0;
}
