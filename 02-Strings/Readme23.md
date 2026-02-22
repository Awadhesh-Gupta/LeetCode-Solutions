# 344. Reverse String

## Problem
Write a function that reverses a string.

The input string is given as an array of characters `s`.

You must modify the array in-place using O(1) extra memory.

---

## Approach (Two Pointer - In-place)

- Initialize two pointers:
  - `l` at the beginning
  - `r` at the end
- Swap characters at `l` and `r`
- Move `l++` and `r--`
- Continue until `l < r`

This reverses the array in-place without using extra space.

---

## Time Complexity
O(n)

(Each character is swapped once.)

## Space Complexity
O(1)

(No extra data structures used.)

---

## Key Learning
- Two-pointer technique is ideal for in-place array reversal.
- Always check for space constraints in problem statements.
- Swapping is more efficient than creating new objects.

---

## Edge Cases
- Single character array
- Even length array
- Odd length array
- Special characters