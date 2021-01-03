//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j] ) {
                // 如果值相差一个下标，则不用换元素
                if(i-j>1){
                    nums[j+1] = nums[i];
                }
                j++;
            }
        }
        return j + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

/**
 *  审题：
 *  1.已排序数组
 *  2.原地删除重复出现的元素
 *  3.返回移除后的数组的长度, 没要求返回删除重复元素后的数组，只要求返回去除重复元素后的数组的长度
 *  4.O(1)的空间复杂度
 *
 *  解法：
 *  1. 判断后一个元素与前一个元素不相等，则数组长度加1
 *  1.快慢指针
 */