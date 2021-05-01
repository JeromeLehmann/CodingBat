// 1. Exercise descriptions
/*
  Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
  last2("hixxhi") → 1
  last2("xaxxaxaxx") → 1
  last2("axxxaaxx") → 2
*/

// 2. Personal solutions
public int last2(String str) {
  String endStr=""; // The end string, to search for more occurrencies
  byte nbEndStr_1=0; // Nb of its occurrencies (minus the searched one)
  if(str.length()<3) return 0; // We need an input of at least 3 chars (not 4, because overlap is allowed)
  else {
    endStr=str.substring(str.length()-2); // The end string
    for(byte i=0; i<str.length()-2;i++) { // We loop on each char, until the end string minus last occurrence (but overlapping allowed)
      if(str.substring(i,i+2).equals(endStr)) { // current char and next one
        nbEndStr_1++;
      }
    }
    return nbEndStr_1;
  }
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public int last2(String str) {
  // Screen out too-short string case.
  if (str.length() < 2) return 0;

  String end = str.substring(str.length()-2);
  // Note: substring() with 1 value goes through the end of the string
  int count = 0;

  // Check each substring length 2 starting at i
  for (int i=0; i<str.length()-2; i++) {
    String sub = str.substring(i, i+2);
    if (sub.equals(end)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}
*/

// 4. Key differences
//   The performance is the same, only differences can be found on the following:
//   1- The solution tests the "< 2" instead of "< 3". For strings of length 3, this causes to go to "int count = 0;" and to the "for" verification before passing the value to the "return"
//   2- The solution doesn't use "else" for the other condition of the "if", which doesn't matter here because the first part of the "if" ends with a "return"
