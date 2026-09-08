/*
In this program we will print then numbers from n to 1 using recursion.
*/

#include <bits/stdc++.h>
using namespace std;

// void func(int n){
//     if(n>=1){
//     cout<<n<<endl;
//     n-=1;
//     func(n);
//     }else{
//         return;
//     }
    
// }


void func(int n){
    if(n<1) return;
    cout<<n<<endl;

    func(n-1);
}

int main(){
    int n;
    cout<<"Enter a number>0:"<<endl;
    cin>>n;
    func(n);
}