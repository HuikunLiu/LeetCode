/**
 * @param {number[]} nums
 * @return {number[]}
 * 选择排序
 */
var sortArray = function(nums) {
    for(var i = 0; i < nums.length - 1; i++) {
        var index = i;
        for(var j = i+1; j < nums.length; j++) {
            if(nums[j] < nums[index]) {
                index = j;
            }
        }
        if(nums[index] < nums[i]) {
            var temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
    return nums;
};
