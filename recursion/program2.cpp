/*
In this program we will print linearly from 1 to n.
*/

#include <bits/stdc++.h>
using namespace std;

void solution(int i, int n){
    if(i>n) return;
    cout<<i<<endl;
    solution(i+1, n);
}

int main(){
    int n;
    cout<<"Enter N:"<<endl;
    cin>>n;
    solution(1, n);
}