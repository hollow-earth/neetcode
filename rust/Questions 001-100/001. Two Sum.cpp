#include <vector>
#include <unordered_map>
using namespace std;

// Brute force
class Solution1 {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i = 0; i < nums.size(); i++){
            for (int j = i+1; j < nums.size(); j++){
                if (nums[i] + nums[j] == target){
                    vector<int> result = vector<int>();
                    result.push_back(i);
                    result.push_back(j);
                    return result;
                }
            }
        }
        return vector<int>(0,2);
    }
};

// Hashmap
class Solution2 {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int,int> hashmap = std::unordered_map<int,int>();
        int n = nums.size();

        for (int i = 0; i < n; i++){
            hashmap[nums[i]] = i;
        }

        for (int i = 0; i < n; i++){
            int complement = target - nums[i];
            if (hashmap.find(complement) != hashmap.end() && hashmap[complement] != i){
                return {hashmap[target-nums[i]], i};
            }
        }
        return {-1,-1};
    }
};