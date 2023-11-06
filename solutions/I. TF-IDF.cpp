#include <bits/stdc++.h>
using namespace std;

int N, M;
vector<map<string, int>> tf;
map<string, int> df;

double tfidf(int n, int cnt) {
    return log10((double)n / (1 + cnt));
}

int compare(const pair<string, int> &a, const pair<string, int> &b) {
    if (a.second == b.second) return a.first < b.first;
    else return tfidf(N, a.second) > tfidf(N, b.second);
}

void solve(int d) {
    vector<pair<string, int>> ans;
    for (auto [word, cnt] : tf[d]) {
        ans.emplace_back(word, df[word]);
    }

    sort(ans.begin(), ans.end(), compare);
    for (auto [word, cnt] : ans) {
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
        for (auto [w, cnt] : tf[i]) {
            df[w]++;
        }
    }

    for (int i = 0; i < M; ++i) {
        int d;
        cin >> d;
        solve(d - 1);
    }

    return 0;
}