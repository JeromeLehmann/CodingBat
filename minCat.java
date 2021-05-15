// 1. Exercise descriptions
/*

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/

// 2. Personal solutions
public String minCat(String a, String b) {
  int shortestLen=Math.min(a.length(),b.length());
  return a.substring(a.length()-shortestLen)+b.substring(b.length()-shortestLen);
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
