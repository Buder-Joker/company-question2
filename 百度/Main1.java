package com.bittch.笔试题.百度;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            map.put(in.nextInt(),in.nextInt());
        }
        int count = 0;
        Set<Integer> set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){

        }
    }
}
