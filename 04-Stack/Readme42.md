# 155. Min Stack  

## Technique  
Stack + Auxiliary Stack  

## Approach  
Use two stacks:  
One stack stores all elements.  
Another stack keeps track of the minimum element at each step.  

When pushing:  
- Push element to main stack.  
- If it is smaller than or equal to current minimum, push it to min stack.  

When popping:  
- If popped element equals current minimum, pop from min stack as well.  

This ensures constant time retrieval of minimum.

## Time Complexity  
O(1) for push, pop, top, and getMin  

## Space Complexity  
O(n)  

## Key Learning  
Maintaining extra information in a secondary stack helps achieve constant-time minimum retrieval.  
Stack problems often require tracking additional state.

## Edge Cases  
Negative numbers  
Duplicate minimum values  
Pop until empty  
Large number of operations  