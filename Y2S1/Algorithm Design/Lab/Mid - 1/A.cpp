// In the name of Allah, the Most Gracious, the Most Merciful
// C: FardinMahadi

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n; cin >> n;

    vector<int> arr(n);
    for (auto &it: arr) cin >> it;

    int target;
    cin >> target;

    int res = -1;
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            res = mid;
            break;
        } else if (arr[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    cout << res << endl;

    return 0;
}
