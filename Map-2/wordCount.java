public Map<String, Integer> wordCount(String[] strings) {
  HashMap<String, Integer> map = new HashMap<>();
  for (int i = 0; i < strings.length; i++) {
    int temp = map.getOrDefault(strings[i], 0) + 1;
    map.put(strings[i], temp);
  }
  return map;
}
