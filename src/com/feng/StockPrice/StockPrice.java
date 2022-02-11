package com.feng.StockPrice;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//2034. 股票价格波动（未完成）
public class StockPrice {

    int maxTimestamp;
    Map<Integer, Integer> timestamps;
    TreeMap<Integer, Integer> prices;


    public StockPrice() {
        maxTimestamp = 0;
        timestamps = new HashMap<>();
        prices = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        int prevTimestamp = timestamp;

        int prevPrice = 0;
        prices.put(price, prevPrice);
    }

    public int current() {
        return timestamps.get(maxTimestamp);
    }

    public int maximum() {
        return prices.lastKey();
    }

    public int minimum() {
        return prices.firstKey();
    }


/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
}
