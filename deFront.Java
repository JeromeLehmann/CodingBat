// 1. Exercise descriptions
/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

// 2. Personal solutions
public String deFront(String str) {
  String a, b, rest;
  a=(str.length()>=1 && str.charAt(0)=='a')?"a":"";
  b=(str.length()>=2 && str.charAt(1)=='b')?"b":"";
  rest=(str.length()>=3)?str.substring(2):"";
  return a+b+rest;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
