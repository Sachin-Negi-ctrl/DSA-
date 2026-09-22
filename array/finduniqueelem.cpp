//Find the unique elements in an array (only works if there is a single unique element!!!)

#include <bits/stdc++.h>
using namespace std;

int func(int arr[], int n);

int main(){
    int arr[] = {1,2,1,3,2};

    cout<<func(arr, 5);
}

int func(int arr[], int n){
    int res = 0;
    for(int i=0; i<n; i++){
        res = res^arr[i];
    }
    return res;
}