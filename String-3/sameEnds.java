public String sameEnds(String string) {
  String res = "";
  for (int i = 0; i < string.length() / 2; i++) {
    if (string.substring(0, i + 1).equals(string.substring(string.length()-1-i,string.length())))
      res = string.substring(0, i + 1);
  }
  return res;
}
