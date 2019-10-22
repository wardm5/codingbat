public int[] maxEnd3(int[] nums) {
  int largest = nums[0] < nums[nums.length-1] ? nums[nums.length-1] : nums[0];
  for (int i = 0; i < nums.length; i++) {
    nums[i] = largest;
  }
  return nums;
}
