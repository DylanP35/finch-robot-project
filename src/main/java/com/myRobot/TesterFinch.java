package com.myRobot;

public class TesterFinch{
public static void main(String[]args){
FinalFinch bird = new FinalFinch("A");


//colors and text
 bird.setBeak(0,0,100);
bird.setTail("all",0,0,100);
bird.print("Dodgers logo");
bird.pause(7);
//start of L
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
    //start of A
    bird.setMove("F", 5, 50);
    bird.setTurn("R", 45, 50);
    bird.setMove("F", 1.5, 50);
    bird.setMove("B", 3, 50);
    bird.setMove("F", 1.5, 50);
    bird.setTurn("R", 120, 50);
    bird.setMove("F", 17, 50);
    bird.setTurn("R", 70, 50);
    bird.setTurn("R", 60, 50);
    bird.setMove("F", 12, 50);
    bird.setTurn("R", 15, 50);
    bird.setMove("F", 4.25, 50);
    bird.setTurn("L", 90, 50);
    bird.setMove("F", 1.5, 50);
    bird.setMove("B", 3, 50);
//turns off the colors
bird.print("Goodbye");
bird.pause(5);
bird.setBeak(0,0,0);
bird.setTail("all",0,0,0);
    bird.stop();
}
}