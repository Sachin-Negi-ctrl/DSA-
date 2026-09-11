/*
In this program we will learn how to use hash map to count the number of occurence of a number in an array.
*/

#include <bits/stdc++.h>
using namespace std;

int main(){
    //taking the input size of the array from the user
    int n;
    cout<<"Enter the size of the array:"<<endl;
    cin>>n;
    int arr[n];
    //taking the input elements from the user
    cout<<"Enter the values: "<<endl;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    //taking the target input from the user
    int t;
    cout<<"Enter the target value:"<<endl;
    cin>>t;

    //hash map
    int hash[12] = {0};
    for(int i=0; i<n; i++){
        hash[arr[i]] += 1;
    }

    //final output
    cout<<"The occurence of "<<t<<" is "<<hash[t]<<" times"<<endl; //Directly access the value at hash[t] hence reducing the t.c
}
