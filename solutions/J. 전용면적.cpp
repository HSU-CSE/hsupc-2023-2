#include <bits/stdc++.h>
using namespace std;

int N;

int is_prime(int n) {
    if (n < 2) {
        return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(false), cin.tie(nullptr);
    cin >> N;

    int num, ans = N;
    for (int i = 0; i < N; ++i) {
        cin >> num;
        if (is_prime(2 * num + 1)) ans--;
    }
    cout << ans;

    return 0;
}
