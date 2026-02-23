# 5. Longest Palindromic Substring  

## Technique  
Expand Around Center  

## Approach  
For every index in the string, treat it as the center and expand left and right to check for palindrome.  
Handle both **odd length** and **even length** palindromes.  
Update the longest palindrome whenever a larger one is found.

## Time Complexity  
O(n²)

## Space Complexity  
O(1)

## Key Learning  
Checking palindrome from the center is much faster than brute force.  
This technique avoids generating all substrings and is frequently asked in interviews.

## Edge Cases  
Single character string  
All characters same  
Even and odd length palindromes  
Very small input  