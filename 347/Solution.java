/*
    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 * 
 */

 class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostfreq = new int[k];

        HashMap<Integer, Integer> NewHashMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++)
        {
            if(NewHashMap.containsKey(nums[i]))
            {
                NewHashMap.put(nums[i], (NewHashMap.get(nums[i])) + 1);
            }
            else
            {
                NewHashMap.put(nums[i], 1);
            }
            
            
        }

         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : NewHashMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = k - 1; i >= 0; --i) {
            mostfreq[i] = pq.poll().getKey();
        }

        /*
        {1, 3}


        */

        return mostfreq;
    }
}