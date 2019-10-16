public int bunnyEars2(int bunnies) {
  if (bunnies == 0)
    return 0;
  int val = 0;
  if (bunnies % 2 == 0)
    val = 3;
  else 
    val = 2;
  return bunnyEars2(bunnies-1) + val;
}
