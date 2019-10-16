public Map<String, Boolean> wordMultiple(String[] s) {
  HashMap<String, Boolean> map = new HashMap<>();
  for (int i = 0; i < s.length; i++) {
    if (map.containsKey(s[i]))
      map.put(s[i], true);
    else 
      map.put(s[i], false);
  }
  return map;
}
