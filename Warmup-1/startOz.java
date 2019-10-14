public String startOz(String str) {
  if (str.length() < 2)
    return str;
  StringBuilder build = new StringBuilder();
  if (str.charAt(0) == 'o')
    build.append('o');
  if (str.charAt(1) == 'z')
    return build.append('z').toString();
  return build.toString();
}
