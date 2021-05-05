// 1. Exercise descriptions
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
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
public String stringSplosion(String str) {
  String result = "";
  // On each iteration, add the substring of the chars 0..i
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}
*/

// 4. Key differences
//   Similar results
