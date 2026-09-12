/*
In this program we will creating the selection sorting algorithm.
*/
#include <bits/stdc++.h>
using namespace std;

void func(int *arr, int n){
    for(int i=0; i<n-1; i++){
        int min = i; // we assume that the first element is smallest
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[min]){ // we find the smallest element and assign its index into min
                min = j;
            }
        }
        //swapping
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    for(int k = 0; k<n; k++){
        cout<<arr[k]<<" ";
    }
}

int main(){
    int n;
    cout<<"Enter the number of elements:"<<endl;
    cin>>n;
    int arr[n];

    cout<<"Enter the "<<n<<" elements"<<endl;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    func(arr, n);
}