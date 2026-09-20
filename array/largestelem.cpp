    //Find the largest element in array

    #include <bits/stdc++.h>
    using namespace std;

    void func(int arr[], int n){
        int l = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        cout<<"The largest element is: "<<l;
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