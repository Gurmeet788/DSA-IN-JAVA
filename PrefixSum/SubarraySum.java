//Leetcode Prefix Problem no 560 Count the SubArray Sum Equals To K
package PrefixSum;

import java.util.HashMap;

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0; i < n; i++){
            total += nums[i];
            prefixSum = total - k;
            if(map.containsKey(prefixSum)){
                count += map.get(prefixSum);
            }
            map.put(total,map.getOrDefault(total,0) + 1);
        }

        return count;
    }
}