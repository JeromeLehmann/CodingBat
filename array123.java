// 1. Exercise descriptions
/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

// 2. Personal solutions
public boolean array123(int[] nums) {
  byte l=(byte)nums.length;
  boolean found=false;
  byte i=0;
  while(i<l-2 && !found) {
    if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) found=true;
    i++;
  }
  return found;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public boolean array123(int[] nums) {
  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}
*/

// 4. Key differences
//   1- The solution chose to return the value directly
//   2- The solution uses a for instead of a while
