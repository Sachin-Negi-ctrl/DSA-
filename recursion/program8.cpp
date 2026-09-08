/*
In this program we will return the factorial of a number using recursion.
*/
#include <bits/stdc++.h>
using namespace std;

int func(int n){
    if(n<1) return 1;

    return n*func(n-1);
}

int main(){
    int n;
    cout<<"Enter any number>0:"<<endl;
    cin>>n;
    cout<<func(n);
}