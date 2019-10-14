public String everyNth(String str, int n) {
  StringBuilder build = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
    if (i % n == 0) 
      build.append(str.charAt(i));
  }
  return build.toString();
}
