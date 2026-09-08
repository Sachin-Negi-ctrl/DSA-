/*
In this program we will print from n to 1 linearly using backtracking in recursion.
*/
#include <bits/stdc++.h>
using namespace std;

void func(int i, int n){
    //base case
    if(i>n) return;
    func(i+1, n);
    cout<<i<<endl;
}

int main(){
    int n;
    cout<<"Enter any number>0:"<<endl;
    cin>>n;

    func(1,n);
}