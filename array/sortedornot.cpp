//Check whether the array is sorted or not

#include <bits/stdc++.h>
using namespace std;

bool func(int arr[], int n){
    for(int i=0; i<n; i++){
        if(arr[i]>arr[i+1]){ //If the first element is greater then next element: unsorted.
            return false;
        }
    }
    return true;
}

int main(){
    // int n;
    // cout<<"Enter the number of elements: "<<endl;
    // cin>>n;
    // int arr[n];
    
    // for(int i=0; i<n; i++){
    //     cin>>arr[i];
    // }

    int arr[] = {5,8,1,2,0};
    cout<<func(arr, 5);
    
}