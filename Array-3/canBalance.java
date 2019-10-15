// public boolean canBalance(int[] nums) {
//   int p1 = 0;
//   int p2 = nums.length-1;
//   int left = 0;
//   int right = 0;
//   while (p1 <= p2) {
//     if (left == right && p1 == p2)
//       return false;
//     if (left > right) {
//       right += nums[p2];
//       p2--;
//     } else if (left < right) {
//       left += nums[p1];
//       p1++;
//     } else  {
//       left += nums[p1];
//       right += nums[p2];
//       p1++;
//       p2--;
//     }
//   }
//   return (left == right);
// }
public boolean canBalance(int[] nums) {
  int p1 = 0;
  int p2 = nums.length-1;
  int left = 0;
  int right = 0;
  return helper(p1, p2, left, right, nums);
}
public boolean helper(int p1, int p2, int left, int right, int[] nums) {
  if (left == right && p1 == p2)
    return false;
  else if (p1 > p2)
    return (left == right);
  else if (left > right) 
    return helper(p1, p2-1, left, right + nums[p2], nums);
  else if (left < right)
    return helper(p1+1, p2, left+nums[p1], right, nums);
  return helper(p1+1, p2-1, left + nums[p1], right + nums[p2], nums);
}
