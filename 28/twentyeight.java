/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100

*/
class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize the pointer for the position of non-target elements
        int position = 0;

        // Iterate through the original array
        for(int i = 0; i < nums.length; i++) {
            // If the current element is not the target value
            if (nums[i] != val) {
                // Assign this non-target element to the position pointer
                nums[position] = nums[i];
                // Move the position pointer
                position++;
            }
        }

        // The new length of the array is the final position pointer
        return position;
    }
}


class twentyeight {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int len1 = solution.removeElement(nums1, val1);
        System.out.println("Test case 1: Length = " + len1);
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        
        // Test case 2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int len2 = solution.removeElement(nums2, val2);
        System.out.println("Test case 2: Length = " + len2);
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // Test case 3
        int[] nums3 = {0,0,1,1,1,2,2,3,3,4};
        int val3 = 2;
        int len3 = solution.removeElement(nums3, val3);
        System.out.println("Test case 3: Length = " + len3);
        for (int i = 0; i < len3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();
    }
}