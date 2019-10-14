public int max1020(int a, int b) {
  if (check(a) && check(b))
    return Math.max(a,b);
  if (check(a))
    return a;
  if (check(b))
    return b;
  return 0;
}
public boolean check(int a) {
  return (a >= 10 && a <= 20);
}
