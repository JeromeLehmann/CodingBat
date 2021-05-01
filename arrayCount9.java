// 1. Exercise descriptions
/*
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/

// 2. Personal solutions
public int arrayCount9(int[] nums) {
  byte nb9 = 0;
  for(int i:nums) if(i==9) nb9++;
  return nb9;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 9) {
      count++;
    }
  }
  return count;
}
*/

// 4. Key differences
//   The same, with 'for' or 'foreach' alternative
