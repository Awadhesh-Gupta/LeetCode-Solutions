# 242. Valid Anagram

## Problem
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram means both strings contain the same characters with the same frequency.

---

## Approach
Used Frequency Array (Counting) technique.

- If lengths are different → return `false`.
- Create an integer array of size 26 (for lowercase English letters).
- Traverse both strings in a single loop:
  - Increment frequency for character in `s`
  - Decrement frequency for character in `t`
- If all values in frequency array are `0`, the strings are anagrams.

This works because anagrams must have identical character counts.

---

## Time Complexity
O(n)

## Space Complexity
O(1)

(We use a fixed-size array of 26 letters.)

---

## Key Learning
- Anagram problems are best solved using frequency counting.
- Using a single loop to update both strings improves efficiency.

---

## Edge Cases
- Strings of different lengths
- Single character strings
- Repeated characters
- Completely different strings
