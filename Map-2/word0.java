public Map<String, Integer> word0(String[] strings) {
  HashMap<String, Integer> map = new HashMap<>();
  for (int i = 0; i < strings.length; i++) { 
    map.put(strings[i], 0);
  }
  return map;
}
