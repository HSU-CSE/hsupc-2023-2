#include <bits/stdc++.h>
using namespace std;

typedef struct seat {
  int r, c, dist;
} seat;

int N, M;
vector<seat> seats;
int answer[100][100];

int dist_sqaure(int r, int c) {
    int bugi_r = -5;
    int bugi_c = M / 2;
    return (r - bugi_r) * (r - bugi_r) + (c - bugi_c) * (c - bugi_c);
}

int compare(seat p1, seat p2) {
    if (p1.dist == p2.dist)
        return p1.c < p2.c;
    else
        return p1.dist < p2.dist;
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);

    cin >> N >> M;
    for (int r = 0; r < N; ++r) {
        for (int c = 0; c < M; ++c) {
            seats.push_back({r, c, dist_sqaure(r, c)});
        }
    }

    sort(seats.begin(), seats.end(), compare);

    int idx = 1;
    for (seat s : seats) {
        answer[s.r][s.c] = idx++;
    }

    for (int r = 0; r < N; ++r) {
        for (int c = 0; c < M; ++c) {
            cout << answer[r][c] << ' ';
        }
        cout << '\n';
    }
    return 0;
}