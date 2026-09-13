/*
In this program we will write the algorithm for insertion sort.
*/

#include <bits/stdc++.h>
using namespace std;

void func(int *arr, int n){
    //outer loop
    for(int i=0; i<n; i++){
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            //swap
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;

            j--;
        }
    }
}

int main(){
    int n;
    cout<<"Enter the number of elements:"<<endl;
    cin>>n;

    int arr[n];

    cout<<"Enter "<< n << " elements"<<endl;
    for(int i =0; i<n; i++){
        cin>>arr[i];
    }
    func(arr, n);
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}