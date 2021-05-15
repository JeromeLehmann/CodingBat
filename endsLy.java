// 1. Exercise descriptions
/*
Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

// 2. Personal solutions
public boolean endsLy(String str) {
  return str.endsWith("ly");
}

// RESULT: Pass- All Correct

// 3. Official solutions
/*
  None
*/

// 4. Key differences

// 5. Alternative solution
public boolean endsLy(String str) {
  String endStr="";
  for(int i=str.length()-Math.abs((str.length()-2)); i>0;i--){
    endStr=str.charAt(i+(str.length()-2)-1)+endStr;
  }
  return endStr.equals("ly");
}
