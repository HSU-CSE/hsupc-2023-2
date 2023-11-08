#include <iostream>
#define fast ios::sync_with_stdio(0),cin.tie(0)
#define endl '\n'
/*
    pb : D. 196(small)
*/
const int PLUS = 500; //인덱스 값
using namespace std;
int main(){
    fast;
    int T;cin >> T;
    for(int Case=1;Case<=T;Case++){
        int N;cin >> N;
        int Number[1300]{},cnt=0;
        while(N--){
            int num;cin >> num;
            cnt+=Number[196-num+PLUS];
            Number[num+PLUS]++;
        }
        cout << "Case #" << Case << " : " << cnt << endl;
    }
    return 0;
}