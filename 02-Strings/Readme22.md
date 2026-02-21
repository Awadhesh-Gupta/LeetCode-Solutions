# 14. Longest Common Prefix

## Problem
Write a function to find the longest common prefix string among an array of strings.
If there is no common prefix, return an empty string `""`.

---

## Approach 1 (Vertical Scanning - Brute Force)
- First, find the minimum length among all strings.
- Compare characters column by column across all strings.
- Stop when a mismatch is found.
- The characters matched so far form the longest common prefix.

### Time Complexity
O(n * m)

Where:
- `n` = number of strings
- `m` = minimum string length

### Space Complexity
O(1)

---

## Approach 2 (Horizontal Scanning - Optimized)
- Start with the first string as the initial prefix.
- Compare it with each string one by one.
- If mismatch occurs, reduce the prefix length.
- Continue shrinking until the prefix matches or becomes empty.
- This reduces unnecessary comparisons and stops early.

### Time Complexity
O(n * m) (worst case)

But faster in practice due to early stopping.

### Space Complexity
O(1)

---

## Key Learning
- Vertical scanning is simple but checks every column.
- Horizontal scanning is more efficient in real-world scenarios.
- Greedy shrinking of prefix is the most preferred interview solution.

---

## Edge Cases
- Empty array
- Single string
- No common prefix
- All identical strings
- Very short or very long strings
