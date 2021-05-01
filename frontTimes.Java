// 1. Exercise descriptions
/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/

// 2. Personal solutions
public String frontTimes(String str, int n) {
  String front="", res="";
  if(str.length()<3) front=str;
  else front=str.substring(0,3);
  for(int i=0;i<n;i++) res+=front;
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String frontTimes(String str, int n) {
  int frontLen = 3;
  if (frontLen > str.length()) {
    frontLen = str.length();
  }
  String front = str.substring(0, frontLen);

  String result = "";
  for (int i=0; i<n; i++) {
    result = result + front;
  }
  return result;
}
*/

// 4. Key differences
//   Official solution proposes an alternative for returning a string < 3
