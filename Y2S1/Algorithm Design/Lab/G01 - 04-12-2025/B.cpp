// In the name of Allah, the Most Gracious, the Most Merciful
// Groupt - 01 (Algorithm Design)

#include <bits/stdc++.h>
using namespace std;

void Solve(int tc)
{
    int a, b;
    cin >> a >> b;

    if (a > b)
        cout << "Case " << tc << ": " << (a / b) << "\n";
    if (b > a)
        cout << "Case " << tc << ": " << (b / a) << "\n";
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int t = 1;
    cin >> t;
    for (int tc = 1; tc <= t; tc++)
        Solve(tc);

    return 0;
}