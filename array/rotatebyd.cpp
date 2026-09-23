//Rotate the array by D elements

#include <bits/stdc++.h>
using namespace std;

void func(int arr[], int s, int d, int temp[]);

int main(){
    int arr[] = {1,2,3,4,5,6}; //input array
    int s = sizeof(arr) / sizeof(arr[0]);
    int temp[s];
    int d = 3; //input d
    func(arr, s, d, temp);
}

void func(int arr[], int s, int d, int temp[]){
    d = d % s;
    //copying the first D elements
    for(int i=0; i<d; i++){
        temp[i] = arr[i];
    }

    //for shifting
    for(int i=d; i<s; i++){
        arr[i-d] = arr[i];
    }

    //final arr
    for(int i=0; i<d; i++){
        arr[s-d+i] = temp[i];
    }

    for(int i=0; i<6; i++){
        cout<<arr[i]<<" ";
    }
}