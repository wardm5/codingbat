public Map<String, String> pairs(String[] strings) {
  HashMap<String, String> map = new HashMap<>();
  for (int i = 0; i < strings.length; i++) {
    String temp = strings[i];
    map.put(temp.substring(0,1), temp.substring(temp.length()-1,temp.length()));
  }
  return map;
}
