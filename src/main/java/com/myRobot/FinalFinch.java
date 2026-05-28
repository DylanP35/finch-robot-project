package com.myRobot;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {

public FinalFinch(String device){
super (device);
}
public void test(){
    bird.setMove("F", 10, 50);
}

}