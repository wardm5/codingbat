 /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one 
    or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
*/

public boolean loneTeen(int a, int b) {
  if (helper(a) && helper(b))
    return false;
  if (helper(a) || helper(b))
    return true;
  return false;
}
public boolean helper(int a) {
  return (a >= 13 && a <= 19);
}
