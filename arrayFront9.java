// 1. Exercise descriptions
/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/

// 2. Personal solutions
public boolean arrayFront9(int[] nums) {
  for(byte i=0;i<nums.length;i++){
    if(nums[i]==9) return true;
    if(i==3) return false; // Here, already checked 4 elements
  }
  return false;
}
// RESULT: Pass- All Correct

// 3. Official solutions
/*
public boolean arrayFront9(int[] nums) {
  // First figure the end for the loop
  int end = nums.length;
  if (end > 4) end = 4;

  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }

  return false;
}
*/

// 4. Key differences
//   The official solution sets the length of the tab beforehand. This is better, as this avoids 2x checks in every loop.
