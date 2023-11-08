#include<iostream>
#define fast ios::sync_with_stdio(0),cin.tie(0)
#define endl '\n'
using namespace std;
int main() {
	fast;
	int a, b; cin >> a >> b;
	cout << min(a - b, b - 1);
}