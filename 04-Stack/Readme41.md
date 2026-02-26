# 20. Valid Parentheses  

## Technique  
Stack + Hashing  

## Approach  
Use a stack to track opening brackets.  
Push opening brackets into the stack.  
For every closing bracket, check if it matches the top of the stack.  
If it matches, pop the stack; otherwise, return false.  
At the end, if the stack is empty, the string is valid.

## Time Complexity  
O(n)

## Space Complexity  
O(n)

## Key Learning  
Stack is useful for matching problems and maintaining order.  
Hashing helps simplify bracket matching and improves readability.

## Edge Cases  
Empty string  
Single character  
Unmatched brackets  
Nested brackets  
Large input  