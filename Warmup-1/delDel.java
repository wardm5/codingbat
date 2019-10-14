/*
    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
*/

public String delDel(String str) {
  if (str.length() < 4)
    return str;
  StringBuilder build = new StringBuilder();
  if (str.substring(1,4).equals("del"))
    return build.append(str.charAt(0)).append(str.substring(4, str.length())).toString();
  return str;
}
