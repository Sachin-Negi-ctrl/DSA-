//Remove the duplicate elements from the array

#include <bits/stdc++.h>
using namespace std;

int func(int arr[], int n){
    set <int> s;
    for(int i =0; i<n; i++){
        s.insert(arr[i]);
    }

    int idx=0;
    for(auto val : s){
        arr[idx++] = val;
    }
    return s.size();
}


int main(){
    int arr[] = {1, 1, 2, 3, 4, 4, 4, 5, 6};
    int n = sizeof(arr)/sizeof(arr[0]);
    int k = func(arr, n);

    for(int i=0; i<k; i++){
        cout<<arr[i]<<" ";
    }

    cout<<"\n"<<k;
}