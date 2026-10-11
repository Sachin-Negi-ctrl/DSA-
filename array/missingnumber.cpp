#include <iostream>
#include <vector>
using namespace std;

// int func(int arr[], int n);

int func(vector<int>& nums) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0; i<nums.size(); i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ i+1;
        }
        xor2 ^ nums.size();
        return xor1 ^ xor2;
    }

int main(){
    vector<int>arr = {1,2,3,5};
    cout<<func(arr);
}

// int func(int arr[], int n){
//     int sum = 0;
//     for(int i=0; i<n; i++){
//         sum += arr[i];
//     }
//     return 15 - sum;
// }

// int func(int arr[], int n){
//     for(int i=0; i<n; i++){
//         if(i+1!=arr[i]){
//             return i+1;
//         }
//     }
//     return 0;
// }

