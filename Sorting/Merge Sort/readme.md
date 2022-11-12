<Java – Program 2 Ways | Sortings > 
Merge Sort Java –  Java program to implement merge sort using array & Buffered reader. Check out the list of complete Java sorting programs here.

Using Array
Using Buffered Reader
The compiler is also added to the aforementioned so that you can execute the program yourself, alongside suitable outputs and examples.

Merge Sort is a basic comparison based sorting algorithm which generally has Arrays as it’s data structure.

merge sort java

Using Array
1) Merge sort combines the two sorted arrays in sorted format.

2) Sort(int a[],int l,int h) if l<h then the array will be divided in to two partitions at the index m=(l+h)/2.

One array is from index l to m, the 2nd array is from m+1 to h.

3) Sort(a,l,m) calls the sort method and again divided in to partitions until there is no possibility to next partition, and each partition will be sorted, Sort(a,m+1,h) calls the sort() method recursively until no possibility for next partition and sorted the each partition.

4) Merge method merge the partitions of the array by comparing the elements of two arrays and place the elements in order.is 

In given example, the array is 12,4,0,5,3. This array will be divided into two partitions.  12,4,0 and 5,3.

12,4,0 again divided into 12 ,4 and 0. 12,4 again divided into 12 and 4 merge method sort the two partitions 12,4 and merge both partitions as 4,12, again merge method sort the two partitions 12,4 and 0 and merge both partitions as 0,4,12.

Similarly, 5,3 divided into two partitions 5,3. Merge method sort the two partitions and merge both partitions as 3,5.

Now merge method sort the two partitions 0,4,12 and 3,5 and merge these two as 0,3,4,5,12.