# 28. Find the Index of the First Occurrence in a String

## Problem
Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if it is not present.

---

## Approach 1 (Built-in Functions)

- Use Java built-in methods:
  - `contains()` to check existence.
  - `indexOf()` to get the first index.
- This is the simplest and cleanest solution.
- In interviews, this is acceptable unless the problem explicitly asks for manual implementation.

### Time Complexity
O(n * m) (depends on internal implementation)

### Space Complexity
O(1)

---

## Approach 2 (Brute Force)

- Traverse each index of `haystack`.
- For every position, try matching all characters of `needle`.
- If all characters match → return the index.
- Otherwise continue searching.

### Time Complexity
O(n * m)

### Space Complexity
O(1)

---

## Approach 3 (KMP - Optimized)

- Use the Knuth–Morris–Pratt (KMP) algorithm.
- Precompute the **LPS (Longest Prefix Suffix)** array.
- Skip redundant comparisons when mismatch happens.
- Efficient for large inputs.

### Time Complexity
O(n + m)

### Space Complexity
O(m)

---

## Key Learning
- Built-in functions are best for real-world coding and quick solutions.
- Brute force builds the foundation for pattern matching.
- KMP is optimal and useful for large-scale string searching.
- Understanding these approaches helps in interviews and competitive programming.

---

## Edge Cases
- Needle longer than haystack
- Empty needle
- Multiple occurrences
- No match