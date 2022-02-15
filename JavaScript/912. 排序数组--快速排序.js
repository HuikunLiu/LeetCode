/**
 * @param {number[]} nums
 * @return {number[]}
 * 快速排序
 */
var sortArray = function(nums) {
    if(nums.length < 2) return nums;
    var left = [];
    var right = [];
    var pivot = Math.floor(nums.length/2);
    var base = nums.splice(pivot,1)[0];
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] < base) {
            left.push(nums[i]);
        } else {
            right.push(nums[i]);
        }
    }
    return sortArray(left).concat(base, sortArray(right));

};
