// 1. Exercise descriptions
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

// 2. Personal solutions
public String stringYak(String str) {
  String strWoYak="";
  int i;
  for (i=0;i<str.length()-2;i++) {
    if(str.substring(i,i+3).equals("yak")) i+=2;
    else strWoYak+=str.charAt(i);
  }
  strWoYak+=str.substring(i);
  return strWoYak;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String stringYak(String str) {
  String result = "";

  for (int i=0; i<str.length(); i++) {
    // Look for i starting a "yak" -- advance i in that case
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else { // Otherwise do the normal append
      result = result + str.charAt(i);
    }
  }

  return result;
}
*/

// 4. Key differences
//   Doesn't check the 'a' in the middle, but in the examples shown and all the test cases, always the string to skip was 'yak'
//   The for loop increments 1 by 1, and the limit check is done in the if

// As a consequence, an alternative (more instructions executed, but shorter and more readable code) could be:
public String stringYak(String str) {
  String strWoYak="";
  int i;
  for (i=0;i<str.length();i++) {
    if(i<str.length()-2 && str.substring(i,i+3).equals("yak")) i+=2;
    else strWoYak+=str.charAt(i);
  }
  return strWoYak;
}
