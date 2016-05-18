import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp8 extends PApplet{

    public static void main(String[] args) {

        PApplet.main("Chp8");
    }

    public void settings(){
        super.settings();
        size(1400,1300);
        smooth();
    }

    public void setup(){
        println("Ready to roll!");
        rollDice(20);
        rollDice(20);
        rollDice(6);
        println("Finished");
    }

    public void draw(){

    }

    void rollDice(int numSides) {
        int d = 1 + (int)(random(numSides));
        println("Rolling..."+d);
    }
}
