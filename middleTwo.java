// 1. Exercise descriptions
/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

// 2. Personal solutions
public String middleTwo(String str) {
  String res="";
  if(str.length()>=1){
    byte mid=(byte)(str.length()/2);
    res+=str.charAt(mid-1);
    res+=(str.length()>=2)?str.charAt(mid):"";
    res+=(str.length()%2==1)?str.charAt(mid+1):"";
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
