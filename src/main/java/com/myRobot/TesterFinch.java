package com.myRobot;

public class TesterFinch{
public static void main(String[]args){

FinalFinch bird = new FinalFinch("A");
    // bird.setMotors(-50, 50);
    
    bird.setMove("F", 60, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 20, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 60, 50);
    bird.setTurn("R", 90, 50);
    bird.setMove("F", 60, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 60, 50);

    bird.stop();
}
}