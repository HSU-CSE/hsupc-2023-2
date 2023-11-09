#include <iostream>
#include <unordered_map>
#define fast ios::sync_with_stdio(0),cin.tie(0)
#define endl '\n'
/*
    pb : E. 196(large)
*/
using namespace std;
int main() {
    fast;
    int T;
    cin >> T;
    for (int Case = 1; Case <= T; Case++) {
        int N;
        cin >> N;
        unordered_map<long long, int> Numbers;
        int cnt = 0;
        while (N--) {//N
            long long num;
            cin >> num;

            if (Numbers.count(196 - num))
                cnt += Numbers[196 - num];

            if (Numbers.count(num)) Numbers[num]++;
            else Numbers[num] = 1;
        }
        cout << "Case #" << Case << " : " << cnt << endl;
    }
    return 0;
}
