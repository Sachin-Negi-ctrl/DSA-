//Move all non zero numbers to the end

#include <bits/stdc++.h>
using namespace std;

void func(int arr[], int n, int temp[]);

int main(){
    int arr[] = {1,0,2,3,2,0,0,4,5,1};
    int n = sizeof(arr)/sizeof(arr[0]);
    int temp[n];
    func(arr, n, temp);

    //print temp arr
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}

void func(int arr[], int n, int temp[]){
    int j=0;
    //picking non zeroes
    for(int i=0; i<n; i++){
        if(arr[i]!=0){
            temp[j++] = arr[i];
        }
    }

    //copy from temp to arr
    for(int i=0; i<j; i++){
        arr[i] = temp[i];
    }

    //for adding trailing zeroes
    for(int i=j; i<n; i++){
        arr[i] = 0;
    }
}