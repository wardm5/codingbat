public String stringBits(String str) {
  StringBuilder build = new StringBuilder();
  for (int i = 0 ; i < str.length(); i++) {
    if (i % 2 == 0)
      build.append(str.charAt(i));
  }
  return build.toString();
}
