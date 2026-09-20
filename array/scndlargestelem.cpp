//Find the second largest in the array

#include <bits/stdc++.h>
using namespace std;

void func(int arr[], int n){
    int l=arr[0];
    int sl=INT_MIN;
    
    for(int i=1; i<n; i++){
        if(arr[i]>l){
            sl = l; //second largest takes the old largest
            l = arr[i]; //largest takes the new largest
        }
        else if(arr[i]>sl && arr[i]<l){ //If arr[i] is not greater than the largest but is greater than second largest
            sl = arr[i];
        }
    }
    cout<<"The largest element is: "<<l<<endl;
    cout<<"The second largest element is: "<<sl<<endl;
}

int main(){
    int n;
    cout<<"Enter the number of elements: "<<endl;
    cin>>n;
    int arr[n];
    
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    
    func(arr, n);
}