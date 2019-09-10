package com.bittch.笔试题.百度;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(Tree(n,k));
    }
    private static int Tree(int n, int k) {
        int count = 0;
        for(int i=1; i<=n; i++){
            if(Math.abs(2*i-n)==k){
                Tree(i,k);
                Tree(n-i,k);
            }else{
                count++;
            }
        }
        return count;
    }
}
