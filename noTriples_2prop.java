// 1. Exercise descriptions
/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

// 2. Personal solution (#1)
public boolean noTriples(int[] nums) {
  boolean notFound=true;
  byte l=(byte)nums.length;
  byte i=2; // Will increment 3 by 3, checking the -1-2, the -1+1 and +1+2 chars each time
  while(i<l && notFound) {
    if(nums[i]==nums[i-1]){
      if(nums[i]==nums[i-2] || (i<l-1 && nums[i]==nums[i+1])) notFound=false;
    } else if(i<l-2 && nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
      notFound=false;
    }
    i+=3;
  }
  return noTrp;
}
// RESULT: Pass- All Correct

// 3. Official solution
/*
public boolean noTriples(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return false immediately if every seeing a triple.
  for (int i=0; i < (nums.length-2); i++) {
    int first = nums[i];
    if (nums[i+1]==first && nums[i+2]==first) return false;
  }

  // If we get here ... no triples.
  return true;
}
*/

// 4. Key differences
//   1- In the solution, applied the method of 'by step' incrementation, like was the solution of the previous exercise//   2- The solution uses a for instead of a while
//   2- However, their solution here makes 1 loop for each char, with 1 IF of 2 conditions
//   3- My solution had 1 loop every 3 chars, with 1 IF of 1 cond, 1 IF of 3 conds and 1 IF of 3 conds
//   4- Every 3 set of chars, this makes 3 IFs w. 6 conds for solution, and 3 IFS w. 7 conds for mine. Their solution is better.

// But on bigger patters, a 'by step' solution may still be preferable
// Improving my solution using While, for usage with bigger patterns:

// 5. New personal solution (#2)
public boolean noTriples(int[] nums) {
  boolean notFound=true;
  byte i=0;
  while(i<(byte)nums.length-2 && notFound) { // Will increment 3 by 3
    byte nbOtherCharFound=0;
    byte j=1;
    while(j<=2 && (i-j)>=0 && nums[i]==nums[i-j]) { // Count the similar one before
      nbOtherCharFound++;
      j++;
    }
    j=1;
    while(j<=2 && nums[i]==nums[i+j]) { // Count the similar one after
      nbOtherCharFound++;
      j++;
    }
    if(nbOtherCharFound>=2) notFound=false;
    i+=3;
  }
  return notFound;
}
// RESULT: Pass- All Correct

// 6. Key differences
//   1- Let's consider a pattern of 10 following chars to check if similar
//   2- For every 10 chars, the original solution would make 10 IFs w. 90 conds
//   3- This new solution would make 4 IFs w. 3 conds and 2 instr. + 5 IFs w. 2 conds and 2 instr. = 9 IFs w. 5 conds and 4 instr.
//   4- So we have 1 less IF, 85 less conditions, for 4 more instr. 
