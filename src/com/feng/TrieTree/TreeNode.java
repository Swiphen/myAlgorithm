package com.feng.TrieTree;

public class TreeNode {
    TreeNode son[]; //节点
    boolean isEnd;  //结束标志

    public TreeNode() {
        son = new TreeNode[26]; //26个字母
    }
}
