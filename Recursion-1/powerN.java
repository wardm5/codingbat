public int powerN(int base, int n) {
  if (n == 1)
    return base;
  return powerN(base, n-1) * base;
}
