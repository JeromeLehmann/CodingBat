// 1. Exercise descriptions
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

// 2. Personal solutions
public String altPairs(String str) {
  String strAlt="";
  byte b=0; // Each 2 characters, we will make a leap
  for(int i=0; i<str.length(); i++) {
    if(b==2){
      i+=1; // +=1 and this 'if' part without String action makes 2 chars skipped
      b=0;
    } else {
      strAlt+=str.charAt(i);
      b++;
    }
  }
  return strAlt;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public String altPairs(String str) {
  String result = "";

  // Run i by 4 to hit 0, 4, 8, ...
  for (int i=0; i<str.length(); i += 4) {
    // Append the chars between i and i+2
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }

  return result;
}
*/

// 4. Key differences
// Official solution is better:
//   1- The solution loops every 4 chars, making 3 operations each time
//   2- I was looping on every 1 char, making 2 operations each time
//   3- So basically, for 4 loops: 3 vs. 8 operations = 37% of my script (or 2.7x better)
