public int maxSpan(int[] nums) {
  if (nums.length == 0)
    return 0;
  HashMap<Integer, Integer> map = new HashMap<>();
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
    if (map.containsKey(nums[i])) {
      int start = map.get(nums[i]);
      int temp = i - start;
      if (temp > max)
        max = temp;
    } else {
      map.put(nums[i], i);
    }
  }
  return max + 1;
}
