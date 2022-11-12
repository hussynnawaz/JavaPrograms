Linear Search Algorithm
Difficulty Level : Basic
Last Updated : 23 Sep, 2022
Read
Discuss

Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set. It is the easiest searching algorithm

Linear Search Algorithm

Given an array arr[] of N elements, the task is to write a function to search a given element x in arr[].

Examples:

Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 110;
Output: 6
Explanation: Element x is present at index 6

Input: arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 175;
Output: -1
Explanation: Element x is not present in arr[].

Recommended Problem
Searching an element in a sorted array
Searching
Binary Search
Paytm
Solve Problem
Submission count: 1.1L
Follow the below idea to solve the problem:

Iterate from 0 to N-1 and compare the value of every index with x if they match return index

 Follow the given steps to solve the problem:

Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of the elements, return -1.