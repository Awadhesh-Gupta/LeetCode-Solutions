# 125. Valid Palindrome

## Problem
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

Return true if the string is a palindrome, otherwise return false.

---

## Approach (Two Pointer - Optimized)

- Use two pointers:
  - `l` at the beginning
  - `r` at the end
- Skip non-alphanumeric characters.
- Compare characters after converting to lowercase.
- Move pointers inward.
- If any mismatch occurs → return false.

This avoids extra space and works in one pass.

---

## Time Complexity
O(n)

(Each character is visited at most once.)

## Space Complexity
O(1)

(No extra memory used.)

---

## Key Learning
- Two-pointer technique is very powerful for string problems.
- Always handle edge cases like special characters and spaces.
- Built-in functions like `Character.isLetterOrDigit()` improve readability and reduce bugs.

---

## Edge Cases
- Empty string
- String with only special characters
- Mixed uppercase and lowercase
- Numbers and letters combination