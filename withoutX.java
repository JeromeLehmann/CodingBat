// 1. Exercise descriptions
/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/

// 2. Personal solutions
  // Tried to do it (personnal challenge) on 1 line
public String withoutX(String str) {
  return ((str.length()==0)?"":(str.length()==1&&str.charAt(0)=='x')?"":str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x'?str.substring(1,str.length()-1):str.charAt(0)=='x'?str.substring(1):str.charAt(str.length()-1)=='x'?str.substring(0,str.length()-1):str);
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String withoutX(String str) {
  if (str.length() > 0 && str.charAt(0) == 'x') {
    str = str.substring(1);
  }

  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
    str = str.substring(0, str.length()-1);
  }

  return str;

  // Solution  notes: check for the 'x' in both spots. If found, use substring()
  // to grab the part without the 'x'. Check that the length is greater than 0
  // each time -- the need for the second length check is tricky to see.
  // One could .substring() instead of .charAt() to look into the string.
}
*/

// 4. Key differences
  // My solution was just for testing, but should be quicket (have less instructions) for all cases except when the last char only is to 'x'
