public Map<String, String> firstChar(String[] s) {
  HashMap<String, String> map = new HashMap<>();
  for (int i = 0; i < s.length; i++) {
    String start = s[i].substring(0,1);
    String val = map.getOrDefault(start, "");
    map.put(start, val + s[i]);
  }
  return map;
}
