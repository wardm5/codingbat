public String extraEnd(String str) {
  if (str.length() <= 1)
    return str+str+str;
  String sub = str.substring(str.length()-2, str.length());
  return sub+sub+sub;
}
