# 387. First Unique Character in a String  

## Technique  
Frequency Array + Hashing  

## Approach  
Count the frequency of each character using a fixed-size array.  
Traverse the string again and return the first index whose frequency is 1.  
This ensures linear time without extra data structures like HashMap.

## Time Complexity  
O(n)

## Space Complexity  
O(1)  

## Key Learning  
Using a frequency array is faster and more memory-efficient when the character set is fixed.  
Two-pass traversal helps find the first unique element efficiently.

## Edge Cases  
All characters repeated  
Single character string  
Empty result (return -1)  
Large input size  