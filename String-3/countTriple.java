public int countTriple(String str) {
  if (str.length() < 3) 
    return 0;
  int count = 0;
  for (int i = 0 ; i < str.length()-2; i++ ) {
    char curr = str.charAt(i);
    if (curr == str.charAt(i+1) && curr == str.charAt(i+2))
      count++;
  }
  return count;
}
