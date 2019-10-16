public int countHi(String str) {
  return helper(0, str);
}
public int helper(int i, String str) {
  if (i >= str.length() - 1)
    return 0;
  else if (str.substring(i, i+2).equals("hi"))
    return helper(i + 2, str) + 1;
  return helper(i + 1, str);
}
