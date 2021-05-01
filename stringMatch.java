// 1. Exercise descriptions
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/

// 2. Personal solutions
public byte stringMatch(String a, String b) {
  byte nbLen2=0;
  if(a.length()>=2 && b.length()>=2) {
    byte minLen = (byte)((a.length()<b.length())?a.length():b.length());
    for(byte i=0; i<minLen-1; i++) {
      if(a.substring(i,i+2).equals(b.substring(i,i+2))) nbLen2++;
  }
  return nbLen2;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public int stringMatch(String a, String b) {
  // Figure which string is shorter.
  int len = Math.min(a.length(), b.length());
  int count = 0;

  // Look at both substrings starting at i
  for (int i=0; i<len-1; i++) {
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}
*/

// 4. Key differences
//   Using a Min() instead of the ternary operator
//   No need to test the length in the first if as it will be managed by the for
