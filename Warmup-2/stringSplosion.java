// public String stringSplosion(String str) {
//   String res = "";
//   String temp = "";
//   for (int i = 0 ; i < str.length(); i++)  {
//     char c = str.charAt(i);
//     temp += c;
//     res += temp;
//   }
//   return res;
// }


// public String stringSplosion(String str) {
//   StringBuilder res = new StringBuilder();
//   StringBuilder temp = new StringBuilder();
//   for (int i = 0 ; i < str.length(); i++)  {
//     char c = str.charAt(i);
//     temp.append(c);
//     res.append(temp);
//   }
//   return res.toString();
// }

public String stringSplosion(String str) {
  StringBuilder res = new StringBuilder();
  for (int i = 0 ; i < str.length(); i++)  {
    res.append(str.substring(0, (i+1)));
  }
  return res.toString();
}
