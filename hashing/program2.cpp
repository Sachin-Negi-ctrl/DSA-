/*
In this program we will take a string and map it to our existing hash map and count the number of occurence of any letter.
*/

#include <bits/stdc++.h>
using namespace std;

int main(){
    //Take the input string from the user
    string s;
    cout<<"Enter the string:"<<endl;
    cin>>s;
    //hash map
    int hash[26] = {0};

    //take the input target from the user
    char t;
    cout<<"Enter the target:"<<endl;
    cin>>t;

    int v = t - 'a';

    //mapping string to the hash map
    for(int i=0; i<s.length(); i++){
        int val = 0; 
        val = s[i] - 'a';
        hash[val] += 1;
    }
    //give the ouput
    cout<<hash[v];
}