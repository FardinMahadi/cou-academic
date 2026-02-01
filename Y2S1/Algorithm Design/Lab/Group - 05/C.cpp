// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 05

#include <bits/stdc++.h>
using namespace std;

#define SORT_UNIQUE(c) (sort(c.begin(), c.end()), c.resize(distance(c.begin(), unique(c.begin(), c.end()))))

int main()
{
    int n;
    cin >> n;

    vector<int> arr;
    for (int i = 0; i < n; i++)
    {
        int num;
        cin >> num;
        arr.push_back(num);
    }

    cout << arr.size() << endl;

    return 0;
}