package com.feng;

public class MidMain {
    public static void main(String[] args) {
//        int[] a1 = {1,-2,-5,0,10};
//        int[] a2 = {0,-2,-1,-7,-4};
//        System.out.println(new MidSolution().maxAbsValExpr(a1, a2));

        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        System.out.println(new MidSolution().countBattleships(board));
    }
}
