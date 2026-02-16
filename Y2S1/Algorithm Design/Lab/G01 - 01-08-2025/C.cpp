// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 01

#include <bits/stdc++.h>
using namespace std;

int main() {
    int tc;
    cin >> tc;

    while (tc--) {
        string str;
        cin >> str;

        int n = str.size();
        int answer = n;

        for (int p = 1; p <= n; p++) {
            if (n % p != 0) continue;

            bool ok = true;
            for (int i = p; i < n; i++) {
                if (str[i] != str[i % p]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                answer = p;
                break;
            }
        }

        cout << answer << endl;
    }

    return 0;
}
