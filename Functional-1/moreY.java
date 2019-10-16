public List<String> moreY(List<String> s) {
  for (int i = 0; i < s.size(); i++) {
    String temp = s.get(i);
    StringBuilder build = new StringBuilder();
    build.append("y").append(temp).append("y");
    s.set(i, build.toString());
  }
  return s;
}
