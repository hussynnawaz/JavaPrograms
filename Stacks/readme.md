Design and Implement Special Stack Data Structure | Added Space Optimized Version
Difficulty Level : Medium
Last Updated : 06 Jul, 2022
Read
Discuss

Question: Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, . etc. 

Example: 

Consider the following SpecialStack
16  --> TOP
15
29
19
18

When getMin() is called it should 
return 15, which is the minimum 
element in the current stack. 

If we do pop two times on stack, 
the stack becomes
29  --> TOP
19
18

When getMin() is called, it should 
return 18 which is the minimum in 
the current stack.
Recommended Problem
Special Stack
Stack
STL
Adobe
Amazon
+11 more
Solve Problem
Submission count: 67K
Solution:

 Use two stacks: one to store actual stack elements and the other as an auxiliary stack to store minimum values. The idea is to do push() and pop() operations in such a way that the top of the auxiliary stack is always the minimum. Let us see how push() and pop() operations work.

Push(int x) // inserts an element x to Special Stack 

1) push x to the first stack (the stack with actual elements) 
2) compare x with the top element of the second stack (the auxiliary stack). Let the top element be y. 
If x is smaller than y then push x to the auxiliary stack. 
If x is greater than y then push y to the auxiliary stack.
int Pop() // removes an element from Special Stack and return the removed element 

pop the top element from the auxiliary stack. 
pop the top element from the actual stack and return it. Step 1 is necessary to make sure that the auxiliary stack is also updated for future operations.
int getMin() // returns the minimum element from Special Stack 

Return the top element of the auxiliary stack.
We can see that all the above operations are O(1). 

Let us see an example. Let us assume that both stacks are initially empty and 18, 19, 29, 15, and 16 are inserted to the SpecialStack. 

When we insert 18, both stacks change to following.
Actual Stack
18 <--- top     
Auxiliary Stack
18 <---- top

When 19 is inserted, both stacks change to following.
Actual Stack
19 <--- top     
18
Auxiliary Stack
18 <---- top
18

When 29 is inserted, both stacks change to following.
Actual Stack
29 <--- top     
19
18
Auxiliary Stack
18 <---- top
18
18

When 15 is inserted, both stacks change to following.
Actual Stack
15 <--- top     
29
19 
18
Auxiliary Stack
15 <---- top
18
18
18

When 16 is inserted, both stacks change to following.
Actual Stack
16 <--- top     
15
29
19 
18
Auxiliary Stack
15 <---- top
15
18
18
18
The following is the implementation for SpecialStack class. In the below implementation, SpecialStack inherits from Stack and has one Stack object min which works as an auxiliary stack.