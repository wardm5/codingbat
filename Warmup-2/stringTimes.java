public String stringTimes(String str, int n) {
  StringBuilder build = new StringBuilder();
  for (int i = 0; i < n; i++) {
    build.append(str);
  }
  return build.toString();
}
