// 1. Exercise descriptions
/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

// 2. Personal solutions
public String seeColor(String str) {
  byte strLen=(byte)str.length();
  String[] col={"red","blue"};
  byte colLen=(byte)col.length;
  byte i=0;
  String res="";
  while(i<colLen && res.isEmpty()) {
    int len=col[i].length();
    if(strLen>=len && str.substring(0,len).equals(col[i])) res=col[i];
    else i++;
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
