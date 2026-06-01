package com.myRobot;

public class TesterFinch{
public static void main(String[]args){

FinalFinch bird = new FinalFinch("A");
    
bird.setMove("F", 10, 50);
bird.setMove("B", 5, 50);
    bird.setTurn("R", 90, 50);
    bird.setMove("F", 20, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("B", 3, 50);
    bird.setMove("F", 20, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 3, 50);
    bird.setMove("B", 3, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 13, 50);
    bird.setTurn("L", 45, 50);
    bird.setMove("F", 3, 50);
    bird.setTurn("R", 45, 50);
    bird.setMove("F", 1.5, 50);
    bird.setMove("B", 3, 50);
    bird.setMove("F", 1.5, 50);
    bird.setTurn("R", 120, 50);
    bird.setMove("F", 15, 50);
    bird.setTurn("R", 70, 50);
    bird.setTurn("R", 60, 50);
    bird.setMove("F", 12, 50);
    bird.setTurn("R", 15, 50);
    bird.setMove("F", 2.5, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 1.5, 50);
    bird.setMove("B", 3, 50);

    




    bird.stop();
}
}