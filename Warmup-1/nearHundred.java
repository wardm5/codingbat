/*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
*/

public boolean nearHundred(int n) {
  return !(n > 210 || (n < 190 && n > 110) || n < 90);
}


// public boolean nearHundred(int n) {
//   if (n >= 90 && n <= 110)
//     return true;
//   if (n >= 190 && n <= 210)
//     return true;
//   return false;
// }
