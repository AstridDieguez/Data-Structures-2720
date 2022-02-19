## Data Structures: Lab #5 Part 2
Your best friend Bob asked you to count the number of integer pairs in a given array whose difference is equal to an input parameter k. Assume that the elements in the array are unique. There are two ways to approach the problem:

1. Use sorting (solve_with_Sort(int[] array, int k)):
   a. Initialize a counter variable to 0 
   b. Sort the array using the java library  
   c. Take two pointers, left and right, initially having values of 0
   d. While right <  arr.length:
      * Get the difference: diff = array(right) – array(left)
      * If diff == k, increment counter, increment left and increment righ.
      * If diff > k, increment left pointer
      * If diff < k, increment right pointer
   e. return counter

2. Use hashing (solve_with_Hash(int[] array, int k))
   a. Initialize a counter variable to 0
   b. Insert all elements of array in a hashtable
   c. For every element in array:
      * Look for array(i) + k in the hash map, if found then increment counter
      * Look for array(i) - k in the hash map, if found then increment counter
      * Remove array(i) from hash table.
   d. return counter