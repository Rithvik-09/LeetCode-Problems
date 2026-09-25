# Binary Tree Inorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return *the inorder traversal of its nodes' values*.

 

**Example 1:**

**Input:** root = [1,null,2,3]

**Output:** [1,3,2]

**Explanation:**

**Example 2:**

**Input:** root = [1,2,3,4,5,null,8,null,null,6,7,9]

**Output:** [4,2,6,5,7,1,3,9,8]

**Explanation:**

**Example 3:**

**Input:** root = []

**Output:** []

**Example 4:**

**Input:** root = [1]

**Output:** [1]

 

**Constraints:**

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

 

**Follow up:** Recursive solution is trivial, could you do it iteratively?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 6.35%)  
**Memory:** 43.4 MB (beats 15.38%)  
**Submitted:** 2026-09-25T15:42:42.832Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;

        while(true){
            if(node != null){
                st.push(node);
                node  = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-inorder-traversal/)