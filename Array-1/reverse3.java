public int[] reverse3(int[] nums) {
  for (int i = 0; i < nums.length/2; i++) {
    int start = nums[i];
    nums[i] = nums[nums.length - 1 - i];
    nums[nums.length-1-i] = start;
  }
  return nums;
}
