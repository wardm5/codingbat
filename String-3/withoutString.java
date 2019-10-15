public String withoutString(String base, String remove) {
  StringBuilder build = new StringBuilder();
  remove = remove.toLowerCase();
  for (int i = 0; i < base.length(); i++) {
    if (i + remove.length() > base.length()) {
      build.append(base.charAt(i));
      continue;
    }
    String temp = base.substring(i, (i + remove.length())).toLowerCase();
    if (temp.equals(remove))
      i += remove.length() - 1;
    else
      build.append(base.charAt(i));
  }
  return build.toString();
}
