package com.feng.TrieTree;

/**
 * 208. 实现 Trie (前缀树)
 */
//class TreeNode {
//    TreeNode son[]; //节点
//    boolean isEnd;  //结束标志
//
//    public TreeNode() {
//        son = new TreeNode[26]; //26个字母
//    }
//}

public class Trie {

    TreeNode root;

    public Trie() {
        root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.son[index] == null) {
                node.son[index] = new TreeNode();
            }
            node = node.son[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            //如果没有对应的字母，返回false
            if (node.son[index] == null) {
                return false;
            }
            node = node.son[index];
        }
        return node.isEnd == true;
    }

    public boolean startsWith(String prefix) {
        TreeNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            //如果没有对应的字母，返回false
            if (node.son[index] == null) {
                return false;
            }
            node = node.son[index];
        }
        //如果能顺利走完流程，说明有该前缀的字符串
        return true;
    }
}
