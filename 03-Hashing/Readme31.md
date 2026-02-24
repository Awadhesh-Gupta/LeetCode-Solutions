# 49. Group Anagrams  

## Technique  
Hashing + Frequency Array (Optimized)  
Hashing + Sorting  

## Approach  
Use a HashMap to group words based on a unique signature.  
In the optimized approach, count the frequency of each character and build a key.  
In the sorting approach, sort characters of each word to generate the key.  
All anagrams produce the same key and are grouped together.

## Time Complexity  
Optimized (Frequency): O(nk)  
Sorting: O(nk log k)  

Where n = number of strings, k = length of longest string.

## Space Complexity  
O(nk)

## Key Learning  
Frequency-based hashing avoids sorting and improves performance.  
Using a signature or pattern is a powerful technique for grouping problems.

## Edge Cases  
Empty string  
Single element  
Duplicate strings  
Large input size  
All strings identical  