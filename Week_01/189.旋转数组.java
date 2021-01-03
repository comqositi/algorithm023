class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        // 换位次数
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int current = i;
            int pre = nums[i];
            int temp;
            int next;
            do{
                next = (current+k)%nums.length;
                temp = nums[next];
                nums[next] = pre;
                pre = temp;
                current = next;
                count++;

            }while(i!=current);
        }
    }
}
// 环形替换法
/**
 审题：
 1.无序数组
 2.要求空间复杂度O(1)

 解法：
 1.暴力解法：元素整体移动，后面删一个，前面加一个, t:O(kn), s:o(1)
 2.数组截取拼接法：从第length-k的下标开始复制出两个数组，将后半部分凡在前面，前半部分放在后面, t:O(1) s:O(n)
 3.环形替换

 */