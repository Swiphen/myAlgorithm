package com.feng.TrieTree;

public class Trie1 {
    TreeNode1 root;

    public Trie1() {
        root = new TreeNode1();
    }

    public void insert(String word) {
        TreeNode1 node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.sonMap.containsKey(ch)) {
                node.sonMap.put(ch, new TreeNode1());
            }
            node = node.sonMap.get(ch);
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TreeNode1 node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.sonMap.containsKey(ch)) {
                return false;
            }
            node = node.sonMap.get(ch);
        }
        return node.isEnd == true;
    }

    public boolean startWith(String prefix) {
        TreeNode1 node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!node.sonMap.containsKey(ch)) {
                return false;
            }
            node = node.sonMap.get(ch);
        }
        return true;
    }
}
