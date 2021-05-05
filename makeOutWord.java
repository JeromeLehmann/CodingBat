// 1. Exercise descriptions
/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/

// 2. Personal solutions
public String makeOutWord(String out, String word) {
  String strLeft=out.substring(0,out.length()/2);
  String strRight=out.substring(out.length()/2);
  return strLeft+word+strRight;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  Not published
*/
