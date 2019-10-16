public List<String> copies3(List<String> strings) {
  for (int i = 0 ; i < strings.size(); i++) {
    StringBuilder build = new StringBuilder();
    build.append(strings.get(i)).append(strings.get(i)).append(strings.get(i));
    strings.set(i, build.toString());
  }
  return strings;
}
