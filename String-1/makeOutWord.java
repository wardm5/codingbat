public String makeOutWord(String out, String word) {
  String subFront = out.substring(0, out.length()/2);
  String subBack = out.substring(out.length()/2, out.length());
  return subFront + word + subBack;
}
