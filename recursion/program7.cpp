/*
In this program we will print the sum of n numbers using functional recursion.
here the problem is broken down into smaller sub problems(parts)
*/

#include <bits/stdc++.h>
using namespace std;

int func(int n){
    if(n<1) return 0;

    return n+func(n-1);
}

int main(){
    cout<<func(3);
}