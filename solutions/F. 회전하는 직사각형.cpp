#include <bits/stdc++.h>
using namespace std;

int N, M;

void square() {
    bool flag = (M == 0);
    for (int i = 0; i < N + (int)flag; ++i) {
        for (int j = 0; j < N + 1 - (int)flag; ++j) {
            cout << "* ";
        }
        cout << '\n';
    }
}

void rotate_square() {
    bool flag = (M == 3);
    for (int i = 0; i < N; ++i) {
        for (int j = N - (int)flag; j > i; --j) {
            cout << "  ";
        }
        for (int j = 0; j < i * 2 + 1; ++j) {
            cout << "* ";
        }
        cout << '\n';
    }

    flag = !flag;
    for (int i = N - 1; i > -1; --i) {
        for (int j = N - (int)flag; j > i; --j) {
            cout << "  ";
        }
        for (int j = 0; j < i * 2 + 1; ++j) {
            cout << "* ";
        }
        cout << '\n';
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(nullptr);
    cin >> N >> M;
    M %= 4;
    if (M % 2 == 0) square();
    else rotate_square();
    return 0;
}
