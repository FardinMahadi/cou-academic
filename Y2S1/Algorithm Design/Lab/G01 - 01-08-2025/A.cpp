// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 01

#include <bits/stdc++.h>
using namespace std;

int main() {
    int tc;
    cin >> tc;

    for (int i = 1; i <= tc; i++) {
        long long int n;
        cin >> n;

        bool isNegative = (n < 0);
        if (isNegative) n *= -1;

        long long int reversed = 0;
        while (n != 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        cout << "Case " << i << ": ";
        if (isNegative) reversed *= -1;
        cout << reversed << endl;
    }

    return 0;
}
