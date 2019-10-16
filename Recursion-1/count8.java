public int count8(int n) {
  if (n == 0)
    return 0;
  if (n % 10 == 8 && (n/10) % 10 == 8)
    return count8(n/10) + 2;
  if (n % 10 == 8)
    return count8(n/10) + 1;
  return count8(n/10);
}
