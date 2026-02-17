# Problem: Contains Duplicate

## Approach
Used a HashSet to store elements while iterating through the array. If an element already exists in the set, a duplicate is found and return true.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Key Learning
HashSet helps detect duplicates efficiently by reducing the brute force O(n²) comparison to O(n).

## Edge Cases
- Large input size  
- Negative numbers  
- All elements distinct  
- Multiple duplicates
