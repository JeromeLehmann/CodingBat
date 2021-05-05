// 1. Exercise descriptions
/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

// 2. Personal solutions
public String stringX(String str) {
  String res="";
  if(str.length()<=2) res=str;
  else {
    res+=str.charAt(0);
    byte i;
    for(i=1;i<str.length()-1;i++){
      if(str.charAt(i)!='x') res+=str.charAt(i);
    }
    res+=str.charAt(i);
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    // Only append the char if it is not the "x" case
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    }
  }
  return result;
}
*/

// 4. Key differences
//   Official solution is shorter but gets more instructions in the loop
