package com.company;

public class Main {

    public static void main(String[] args) {
        HistoryServiceFacade hsf = new HistoryServiceFacade();
        hsf.acceptCreditRequest();
        System.out.println();
        hsf.createCreditRequest();
        System.out.println();
        hsf.updateCreditRequest();
    }
}
