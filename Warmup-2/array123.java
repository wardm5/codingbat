public boolean array123(int[] nums) {
  for (int i = 0; i < nums.length; i++) { 
     if (nums[i] == 1 && check(i, nums))
      return true;
  }
  return false;
}
public boolean check(int i, int[] nums) {
  if (i + 3 > nums.length)
    return false;
  int count = 1;
  for (int j = i; j < i + 3; j++) {
    if (count != nums[j])
      return false;
    count++;
  } 
  return true;
}
