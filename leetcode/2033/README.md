# Minimum Operations to Make a Uni-Value Grid

- **Platform:** LeetCode  
- **Link:** [Minimum Operations to Make a Uni-Value Grid](https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/)  

---

## 📝 Problem Statement
You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

A uni-value grid is a grid where all the elements of it are equal.

Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

### Approach:
For this question, firstly we need to realise the condition for a solution to exist. I figured out that the solution exists when the difference of any two elements is divisible by `x`.

I started by flattening the 2D array to a 1D array and sorting it.

The next task was to find the target element to which others had to be converted. By no proper reasoning but some understanding and intuition, i figured that the element was the median element of the array or the element closest to the median (in the case that the median did not exist in the array).

Finally the number of operations for each element was simply equal to the absolute value of the difference of the element and the target, divided by `x`. Summing all these operations produced the required result.

### Notes:
Initially my code **EXCEEDED THE TIME LIMIT** after completing 21 test cases. Optimising the code gave me success.
My initial code and thought process is commented out.
Runtime: 38ms. 
