Java algorithm to implement quick sort. In this topic, we will discuss the various methods by which a quick sort algorithm/Program can be done using Array & We have added compiler to each program along with sample outputs explaining a few examples. For More Java sortings you can visit here, The methods used here are:

Quick Sort Algorithm – Using Array.
Quick Sort Algorithm – Using Buffered Reader.
Implement Quick Sort – Using Array
1) In quick sort, divide the array into partitions and sort each partition, then we will get the sorted array. So quick sort is also called as divide and conquer algorithm.

2) In this program sort() method calls itself recursively then partition() method partitions the array, repeats until there is no possibility to partition the array. Partition method partitions the array and sorts them.

3) Partition method returns the m value. m indicates where the array will be divided into partitions. Array divided in to two partitions as (a,l,m-1), (a,m+1,h)

4) From the given example the array elements are 12, 0, -2, 54, -1, -10.

partition method returns m=4 and the array is  sorted as-1,0,-2,-10,12,54.

5) Now the array from index 0 to 3 will be sorted by sort(a,0,3) method, the rest of the elements in the array from index 4 to 5 will not be sorted. The array from index 0 to 3 is sorted and divided into a partition, now the partition from 0 to 2 elements are sorted and divided into a partition, partition from 0,1 elements are sorted, and there is no possibility to next partition. now the array from index 0 to 3 is sorted array. The array after sort(a,l,m-1) is -10,-2,-1,0,12,54.

Sort(a,m+1,h) will sort the remaining unsorted array and partition method will partition the unsorted part of the array. After two sort methods the sorted array is -10,-2,-1,0,12,15.
Program – Using Buffered Reader
1) InputStreamReader reads the byte as character and BufferedReader reads the character as a string. BufferedReader class is available at java.io package.

2) Convert the string data into integer data using the wrapper class Integer, and the method is parseInt() of the Integer class.

3) In this program to sort the array elements, we are using the quick sort technique.