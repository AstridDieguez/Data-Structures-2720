## Data Structures: Midterm
Write a Java program to build a Ring-Buffer using an Array. (Hint : Ring and Circular are synonyms)  
Your ring buffer should be able to do the following:
1. Check whether ring-buffer is Empty means check (front==-1)
2. If it is empty then display buffer is empty. If buffer is not empty then step c (below)
3. Check if (front==rear) if it is true then set front=rear= -1 else check if (front==size-1), if it is true then set front=0 and return the element
4. Pass the following Test Cases:
   * Elements in Ring Buffer are: 1, 2, 3, 4
   * Deleted value = 1
   * Deleted value = 2
   * Elements in Ring Buffer are: 3, 4
   * Elements in Ring Buffer are: 3, 4, 9, 20, 5 
   * Buffer is Full