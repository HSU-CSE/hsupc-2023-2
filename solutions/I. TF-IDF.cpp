#include <bits/stdc++.h>
using namespace std;

int N, M;
vector<map<string, int>> tf;
map<string, int> df;

void solve(int d) {
    vector<pair<long double, string>> ans;
    for (auto [word, cnt] : tf[d]) {
        long double tfidf = log10((long double)N / (1 + df[word]));
        ans.push_back({tfidf, word});
    }

    sort(ans.begin(), ans.end(), greater<>());
    for (auto [tfidf, word] : ans) {
        cout << word << ' ';
    }
    cout << '\n';
}

int main() {
    ios::sync_with_stdio(false), cin.tie(nullptr);

    cin >> N >> M;
    cin.ignore();
    tf.resize(N);

    for (int i = 0; i < N; ++i) {
        string document, word;
        getline(cin, document);
        stringstream ss(document);
        while (ss >> word) {
            tf[i][word]++;
        }
        for (auto [word, count] : tf[i]) {
            df[word]++;
        }
    }

    for (int i = 0; i < M; ++i) {
        int d;
        cin >> d;
        solve(d - 1);
    }

    return 0;
}