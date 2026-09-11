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
    // int hash[26] = {0}; //for strictly lower case alphabets only
    int hash[256] = {0}; //for all of the characters

    //take the input target from the user
    char t;
    cout<<"Enter the target:"<<endl;
    cin>>t;

    // int v = t - 'a'; //used if the input string is lower case strictly

    //mapping string to the hash map
    for(int i=0; i<s.length(); i++){
        // int val = 0;
        // val = s[i] - 'a';
        hash[s[i]]++; //for input string "abab" s[i] for 0; s[0] will give 'a' where a is not a string but a char; further expression becomes: hash['a']++ which is then implicitly converted into an ASCII value by cpp compiler; which is 0 for 'a'; which eventually becomes hash[0]++
    }
    //give the ouput
    cout<<"The occurence of "<<t<<" is "<<hash[t]<<" times"; //hash[t] also gets implicitly converted into an ASCII value; for eg if we enter t as 'b' then hash[t] => hash['b'] => hash[98]
}