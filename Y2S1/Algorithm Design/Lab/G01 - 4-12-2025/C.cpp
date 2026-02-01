// In the name of Allah, the Most Gracious, the Most Merciful
// Groupt - 01 (Algorithm Design)

#include <bits/stdc++.h>
using namespace std;

void Solve(int tc)
{
    int n, tar;
    cin >> n >> tar;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int left = 0, right = n - 1;
    int mid = (left + right) / 2;

    while (left <= right)
    {
        if (tar == arr[mid])
        {
            cout << "Case " << tc << ": " << mid << "\n";
            return;
        }
        if (tar < arr[mid])
        {
            right = mid - 1;
            mid = (left + right) / 2;
        }
        if (tar > arr[mid])
        {
            left = mid + 1;
            mid = (left + right) / 2;
        }
    }

    cout << "Case " << tc << ": " << -1 << "\n";
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