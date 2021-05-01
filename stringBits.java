// 1. Exercise descriptions
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/

// 2. Personal solutions
public String stringBits(String str) {
  String s2 = "";
  for(byte i=0; i<str.length(); i+=2) s2 += str.charAt(i);
  return s2;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String stringBits(String str) {
  String result = "";
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;
}
*/

// 4. Key differences
//   Similar solution
