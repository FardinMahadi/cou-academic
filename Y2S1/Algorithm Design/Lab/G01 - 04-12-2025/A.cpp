// In the name of Allah, the Most Gracious, the Most Merciful
// Groupt - 01 (Algorithm Design)

#include <bits/stdc++.h>
using namespace std;

void Solve()
{
    int n, fLargest, fIdx = 0, sLargest, sIdx = 0;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    fLargest = arr[0];
    sLargest = arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] > fLargest)
        {
            fLargest = arr[i];
            fIdx = i;
        }
    }

    for (int i = 1; i < n; i++)
    {
        if (arr[i] > sLargest && arr[i] < fLargest)
        {
            sLargest = arr[i];
            sIdx = i;
        }
    }

    cout << "First Largest Value = " << fLargest << " " << "Position: " << (fIdx + 1) << "\n";
    cout << "Second Largest Value = " << sLargest << " " << "Position: " << (sIdx + 1) << "\n";
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    Solve();

    return 0;
}