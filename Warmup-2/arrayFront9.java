// public boolean arrayFront9(int[] nums) {
//   int count = 0;
//   for (int i = 0; i < nums.length; i++)  {
//     if (count >= 4)
//       return false;
//     if (nums[i] == 9)
//       return true;
//     count++;
//   }
//   return false;
// }

public boolean arrayFront9(int[] nums) {
  int length = 4;
  if (nums.length <= 4)
    length = nums.length;
  for (int i = 0; i < length; i++)  {
    if (nums[i] == 9)
      return true;
  }
  return false;
}
