// In the name of Allah, the Most Gracious, the Most Merciful
// C: FardinMahadi

#include <bits/stdc++.h>
using namespace std;

#define ll long long

void merge(vector<int>& arr, int low, int mid, int high) {
    vector<int> temp(high - low + 1);
    int i = low, j = mid + 1, k = 0;
    while (i <= mid && j <= high) {
        if (arr[i] >= arr[j]) temp[k++] = arr[i++];
        else temp[k++] = arr[j++];
    }
    while (i <= mid) temp[k++] = arr[i++];
    while (j <= high) temp[k++] = arr[j++];
    for (int idx = 0; idx < temp.size(); idx++) arr[low + idx] = temp[idx];
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
    int n; cin >> n;

    vector<int> arr(n);
    for (auto &it: arr) cin >> it;

    mergeSort(arr, 0, n - 1);
    for(auto &i : arr) cout << i << " ";
    cout << endl;

    return 0;
}
