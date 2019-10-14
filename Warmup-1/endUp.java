public String endUp(String str) {
  if (str.length() < 3) 
    return str.toUpperCase();
  StringBuilder build = new StringBuilder();
  build.append(str.substring(0,str.length()-3));
  build.append(str.substring(str.length()-3, str.length()).toUpperCase());
  return build.toString();
}
