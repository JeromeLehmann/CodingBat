// 1. Exercise descriptions
/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/

// 2. Personal solutions
public boolean has271(int[] nums) {
  boolean res=false;
  for(int i=0; i<nums.length-2; i++) {
    if(nums[i+1]==nums[i]+5 && (nums[i+2]>=(nums[i]-1)-2 && nums[i+2]<=(nums[i]-1)+2)) res=true;
  }
  return res;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public boolean has271(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return true immediately when seeing 271.
  for (int i=0; i < (nums.length-2); i++) {
    int val = nums[i];
    if (nums[i+1] == (val+5) &&              // the "7" check
      Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
        return true;
    }
  }

  // If we get here ... none found.
  return false;
}
*/

// 4. Key differences
//   Official solution is better
