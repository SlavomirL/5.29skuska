package com.SlavoL;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Slavo", highScorePosition);
        int highScorePosition = calculateHighScorePosition(400);
        System.out.println(highScorePosition);

        displayHighScorePosition("Adam", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        System.out.println(highScorePosition);

        displayHighScorePosition("Peto", highScorePosition);
        highScorePosition = calculateHighScorePosition(1500);

        displayHighScorePosition("Mato", highScorePosition);
        highScorePosition = calculateHighScorePosition(900); // highScorePosition je sede lebo v hodnote 50 nebolo nikde pouzite..aj ked rovnaka variable v napr. hodnote 900 bola

    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " got into position " + position + " on the high score table.");
    }


    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if  (score > 500 && score <= 1000){
            return 2;
        } else if (score > 100 && score <= 500){
            return 3;
        } else{
            return 4;
        }
    }
}
