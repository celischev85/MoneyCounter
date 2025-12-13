package ru.netology.services;

public class MoneyCounter {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter=0;
        for (int i = 0; i < 12; i++) {

       if (money>= threshold) {
           money= money-expenses;
           money=(money-expenses)/3;
           counter++;
       } else{
           money=money+income;
           money= money-expenses;
       }
       }
        return counter;
    }
}
