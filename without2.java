// 1. Exercise descriptions
/*

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
*/

// 2. Personal solutions
public String without2(String str) {
  String beg2="", end2="", res="";
  byte len=(byte)str.length();
  if(len>=2){
    beg2=str.substring(0,2);
    end2=str.substring((int)len-2);
    if(beg2.equals(end2)) res=str.substring(2);
    else res=str;
  } else {
    res=str;
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
  // NOTE: This solution prefered cleanness over speed
