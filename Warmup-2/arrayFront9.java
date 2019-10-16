public boolean arrayFront9(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++)  {
    if (count >= 4)
      return false;
    if (nums[i] == 9)
      return true;
    count++;
  }
  return false;
}
