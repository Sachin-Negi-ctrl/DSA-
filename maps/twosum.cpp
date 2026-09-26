//two sum problem

#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;


vector<int> func(vector<int>& arr, int target){
    vector<int> ans = {-1, -1};
    unordered_map<int,int> m;

    for(int i=0; i<arr.size(); i++){
        int first = arr[i];
        int second = target - first;
        
        if(m.count(second)){
            ans[0] = m[second];
            ans[1] = i;
            return ans;
        }
        m[first] = i;
    }
    return ans;
}

int main(){
    vector<int> arr = {2,7,1,5,9};
    vector<int> res = func(arr, 0);
    for(auto i:res){
        cout<<i<<endl;
    }
}