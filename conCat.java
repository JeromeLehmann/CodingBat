// 1. Exercise descriptions
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/

// 2. Personal solutions
public String conCat(String a, String b) {
  if(a.isEmpty() || b.isEmpty()) return a+b;
  else {
    if(a.charAt(a.length()-1)==b.charAt(0)){
      b=b.substring(1);
    }
    return a+b;
  }
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences
