/*
    Given a string, return a new string where the first and last chars have been 
    exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
*/

public String frontBack(String str) {
  if (str.length() <=1)
    return str;
  char[] arr = str.toCharArray();
  char front = arr[0];
  arr[0] = arr[arr.length -1];
  arr[arr.length -1] = front;
  return new String(arr);
}
