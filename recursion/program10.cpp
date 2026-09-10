/*
In this program we will check whether a string is a pallindrome or not.
*/

#include <bits/stdc++.h>
using namespace std;

bool func(int i, string &s){
    //base case 
    if(i>=s.size()/2) return true; // if this executes meaning (all the values of the left are equal to the right until the mid point; so it automatically means it is a pallindrome string.)
    if(s[i]!=s[s.size()-i-1]) return false; // if at any point the left!=right then it is certainly not a pallindrome.

    func(i+1, s);
}

int main(){
    string s;
    cout<<"Enter the string:"<<endl;
    cin>>s;
    bool res = func(0,s);
    if(res==true){
        cout<<"Yes it is a pallindrome";
    }else{
        cout<<"No it is not a pallindrome";
    }
}