//Union of two arrays

#include <bits/stdc++.h>
using namespace std;

void func(int arr1[],int n1, int arr2[], int n2);

int main(){
    int arr1[] = {1,1,2,3,4,5};
    int arr2[] = {2,3,4,4,5,14};

    int n1 = sizeof(arr1)/sizeof(arr1[0]); //size of the first array
    int n2 = sizeof(arr2)/sizeof(arr2[0]); //size of the second array

    func(arr1,n1,arr2,n2);
}

void func(int arr1[],int n1, int arr2[], int n2){
    set <int> st;


    //insert elements of first array
    for(int i=0; i<n1; i++){
        st.insert(arr1[i]);
    }

    //insert elements of second array
    for(int i=0; i<n2; i++){
        st.insert(arr2[i]);
    }
    
    //print the elements of the set
    for(auto s : st){
        cout<<s<<" ";
    }
}