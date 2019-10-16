public int countX(String str) {
  return helper(0, str);
}
public int helper(int pos, String str) {
  if (pos >= str.length())
    return 0;
  if (str.charAt(pos) == 'x')
    return helper(pos + 1, str) + 1;
  return helper(pos + 1, str);
}
