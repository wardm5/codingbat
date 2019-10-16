public int arrayCount9(int[] nums) {
  int res = 0;
  for (int i = 0 ; i < nums.length; i++) {
    if (nums[i] == 9) 
      res++;
  }
  return res;
}
