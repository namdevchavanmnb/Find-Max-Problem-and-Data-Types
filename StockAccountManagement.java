package com.DayOne;

import java.util.Scanner;

public class StockAccountManagement {
    String [] nameOfShare;
    public void getStockAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of stocks");
        int noOfStocks = sc.nextInt();
        System.out.println("Enter no shares");
        int noOfShares = sc.nextInt();
        System.out.println("Enter share name with separate by comma");
        nameOfShare = sc.next().split(",");
        System.out.println("Enter share price");
        int sharePrice = sc.nextInt();
        int totalSharePrice = sharePrice * noOfShares;
        System.out.println("Total value of each stock is " + totalSharePrice);
    }
    public void getShareNames() {
        System.out.println("list of share names are :");
        for(String str :nameOfShare) {
            System.out.println(str +" ");
        }
    }
    public static void main(String[] args) {
        StockAccountManagement scm = new StockAccountManagement();
        scm.getStockAmount();
        scm.getShareNames();
    }

}
