// In the name of Allah, the Most Gracious, the Most Merciful
// C: FardinMahadi

/*  ______  __        __  ______  _____
   / ____/ /  \     / / / |_) ) /    _|
  / /___  / /\ \  / / / /--<  /_/| |
 / ____/ / /  \ \/ / / /_)  )   _| |_
/_/     /_/    \___/ /_/____/   |_____| */

#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>

using namespace std;
using namespace __gnu_pbds;

using ll = long long;
using ld = long double;

// PBDS: order_of_key(x) = # of elements < x
// PBDS: find_by_order(k) = iterator to k-th element (0-indexed)
// For duplicates: use ordered_multiset<T> and insert {value, unique_id}
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> using ordered_multiset = tree<pair<T,int>, null_type, less<pair<T,int>>, rb_tree_tag, tree_order_statistics_node_update>;

#define sp                  ' '
#define nl                  '\n'
#define F                   first
#define S                   second
#define popb                pop_back
#define popf                pop_front
#define pb                  push_back
#define pf                  push_front
#define gcd(x,y)            __gcd(x,y)
#define ceildiv(a,b)        ((a+b-1)/b)
#define sz(x)               ((int)(x).size())
#define no                  cout << "NO" << nl
#define yes                 cout << "YES" << nl
#define all(a)              (a.begin()),(a.end())
#define SUM(a)              accumulate(all(a),0LL)
#define cinv(v)             for(auto &i : v) cin >> i
#define fixedpoint(x)       cout << fixed << setprecision(x)
#define coutv(v)            for(auto &i : v) cout << i << sp
#define UNIQUE(X)           (X).erase(unique(all(X)),(X).end())
#define SORT_UNIQUE(c)      (sort(c.begin(),c.end()), c.resize(distance(c.begin(),unique(c.begin(),c.end()))))

inline ll lcm(ll a, ll b) {
    if (a == 0 || b == 0) return 0;
    ll g = __gcd(a, b);
#if defined(__SIZEOF_INT128__)
    return (ll)((__int128)a / g * b);
#else
    return a / g * b;
#endif
}

// Debug (LOCAL)
#ifndef ONLINE_JUDGE
void __print(char x) { cerr << '\'' << x << '\''; }
void __print(const char *x) { cerr << '"' << x << '"'; }
void __print(const string &x) { cerr << '"' << x << '"'; }
void __print(bool x) { cerr << (x ? "true" : "false"); }

template<typename T> typename enable_if<is_arithmetic<T>::value>::type __print(const T &x) { cerr << x; }

template<typename T>
typename enable_if<!is_arithmetic<T>::value>::type __print(const T &x) {
    int f = 0;
    cerr << '{';
    for (auto it = x.begin(); it != x.end(); ++it) {
        if (f++) cerr << ", ";
        __print(*it);
    }
    cerr << '}';
}

template<typename A, typename B> void __print(const pair<A, B> &p) { cerr << '('; __print(p.first); cerr << ", "; __print(p.second); cerr << ')'; }
template<typename T> void __print(const vector<T> &v) { cerr << '['; for (int i = 0; i < (int)v.size(); i++) { if (i) cerr << ", "; __print(v[i]); } cerr << ']'; }

void _print() { cerr << "]" << nl; }
template <typename T, typename... V>
void _print(T t, V... v) { __print(t); if (sizeof...(v)) cerr << ", "; _print(v...); }

#define debug(...) do { cerr << "[" << #__VA_ARGS__ << "] = ["; _print(__VA_ARGS__); } while(0)
#else
#define debug(...) do {} while(0)
#endif

// Helpers
template<class T> bool chmin(T &a, const T &b){ if(b < a){ a = b; return true; } return false; }
template<class T> bool chmax(T &a, const T &b){ if(a < b){ a = b; return true; } return false; }
template<class T> vector<T> compress(vector<T> v){ sort(v.begin(), v.end()); v.erase(unique(v.begin(), v.end()), v.end()); return v; }

// Constants
const double PI = acos(-1.0);
constexpr int N = 100000 + 5;
constexpr ll LINF = (1LL<<62);
constexpr int INF = 1000000000;
constexpr int MOD = 1000000007;

void Solve(int tc) {

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    for (int tc = 1; tc <= t; tc++) Solve(tc);

    return 0;
}
