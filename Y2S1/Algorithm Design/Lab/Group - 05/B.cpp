// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 05

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int tc;
    cin >> tc;

    for (int i = 0; i < tc; i++)
    {
        int n, m, a;
        cin >> n >> m >> a;
        cout << ((ceil((float)n / a)) * ceil((float)m / a)) << endl;
    }

    return 0;
}