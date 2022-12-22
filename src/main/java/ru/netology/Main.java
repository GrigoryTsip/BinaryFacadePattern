package ru.netology;

public class Main {

    public static void main(String[] args) {

        String binStr1 = "1";
        String binStr2 = "100";

        BinOps binOps = new BinOps();
        System.out.println(binStr1 + " + " + binStr2 + " = " + binOps.sum(binStr1,binStr2));
        System.out.println(binStr1 + " * " + binStr2 + " = " + binOps.mult(binStr1,binStr2));
    }
}