#include <iostream>
#define fast ios::sync_with_stdio(0),cin.tie(0)
#define endl '\n' 
/*
    pb : A. 가위바위보
*/
            
using namespace std;
int main(){
    fast;
    int T;cin >> T;
    for(int Case=1;Case<=T;Case++){
        int N,cnt=0;cin >> N;
        while(N--){
            string word;cin>> word;
            if(word=="가위바위보")cnt++;
        }
        cout << "Case #" << Case << " : " << cnt << endl;
    }
    return 0;
}