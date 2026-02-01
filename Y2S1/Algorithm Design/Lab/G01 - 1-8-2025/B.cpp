// In the name of Allah, the Most Gracious, the Most Merciful
// C: Group - 01

#include <bits/stdc++.h>
using namespace std;

long long inversionCount = 0;

void merge(vector<int>& arr, int low, int mid, int high) {
    vector<int> temp(high - low + 1);
    int i = low, j = mid + 1, k = 0;
    while (i <= mid && j <= high) {
        if (arr[i] >= arr[j]) temp[k++] = arr[i++];
        else {
            temp[k++] = arr[j++];
            inversionCount += (mid - i + 1);
        }
    }
    while (i <= mid) temp[k++] = arr[i++];
    while (j <= high) temp[k++] = arr[j++];
    for (int idx = 0; idx < temp.size(); idx++) {
        arr[low + idx] = temp[idx];
    }
}

void mergeSort(vector<int>& arr, int low, int high) {
    if (low < high) {
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

int main() {
    int tc;
    cin >> tc;

    for (int i = 1; i <= tc; i++) {
        int n;
        cin >> n;

        vector<int> arr(n);
        for (int i = 0; i < n; i++) cin >> arr[i];

        inversionCount = 0;
        mergeSort(arr, 0, n - 1);

        cout << "Case " << i << ": ";
        for (int i = 0; i < n; i++) cout << arr[i] << " ";
        cout << endl;
    }

    return 0;
}
