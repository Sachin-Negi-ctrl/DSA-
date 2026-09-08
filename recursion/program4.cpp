/*
In this program we will print from 1 to n linearly using backtracking in recursion.
*/

#include <bits/stdc++.h>
using namespace std;

void func(int i, int n){
    //base case
    if(i<1) return;
    func(i-1, n);
    cout<<i<<endl;
}

int main(){
    int n;
    cout<<"Enter any number>0:"<<endl;
    cin>>n;

    func(n,n);
}