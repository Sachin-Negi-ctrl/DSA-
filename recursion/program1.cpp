/*
Print name n times using recursion
*/

#include <bits/stdc++.h>
using namespace std;

void func(int i, int n){
    if(i>n) return;
    cout<<("Sachin")<<endl;
    func(i+1, n);
}

int main(){
    int n;
    cout<<"Enter n:"<<endl;
    cin>>n;
    func(1,n);
}