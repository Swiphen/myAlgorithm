package com.feng.TrieTree;

import java.util.HashMap;
import java.util.Map;

public class TreeNode1 {
    Map<Character, TreeNode1> sonMap;
    boolean isEnd;

    public TreeNode1() {
        sonMap = new HashMap<>();
    }
}
