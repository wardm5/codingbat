public boolean canBalance(int[] nums) {
  if (nums.length < 2)
    return false;
  int p1 = 0;
  int p2 = nums.length-1;
  int left = 0;
  int right = 0;
  while (p1 <= p2) {
    if (left == right && p1 == p2)
      return false;
    if (left > right) {
      right += nums[p2];
      p2--;
    } else if (left < right) {
      left += nums[p1];
      p1++;
    } else  {
      left += nums[p1];
      right += nums[p2];
      p1++;
      p2--;
    }
  }
  return (left == right);
}
