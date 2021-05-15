// 1. Exercise descriptions
/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

// 2. Personal solutions
public String lastTwo(String str) {
  if (str.length()<2) return str;
  else{
    byte len=(byte)str.length();
    return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
  }
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
