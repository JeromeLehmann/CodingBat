// 1. Exercise descriptions
/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

// 2. Personal solutions
public String withoutX2(String str) {
/* This one didn't consider a 'x' in the 2nd place only:
  if(str.length()>=2 && str.substring(0,2).equals("xx")) return str.substring(2);
  if(str.length()>=1 && str.charAt(0)=='x') return str.substring(1);
  return str;
*/
  String res="";
  if(str.length()==0) res="";
  else {
    int i;
    for(i=0; i<str.length() && i<2; i++){
      if(str.charAt(i)!='x') res+=str.charAt(i);
    }
    res+=str.substring(i);
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
