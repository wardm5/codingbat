public String frontTimes(String str, int n) {
  StringBuilder build = new StringBuilder();
  String temp = "";
  if (str.length() < 3)
    temp = str;
  else 
    temp = str.substring(0, 3);
  for (int i = 0 ; i < n; i++) {
    build.append(temp);
  }
  return build.toString();
}
