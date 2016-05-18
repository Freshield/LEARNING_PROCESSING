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
//        println("Ready to roll!");
//        rollDice(20);
//        rollDice(20);
//        rollDice(6);
//        for (int i = 0;i < 50; i++) {
//            rollDice(6);
//        }
//        println("Finished");
    }

    public void draw(){

        background(204);
        randomSeed(0);
        for (int i = 35;i < width+40; i += 40) {
            int gray = (int)(random(0,102));
            float scalar = random(0.25f,1.0f);
            owl(i,100,gray,scalar);
        }


    }

    void rollDice(int numSides) {
        int d = (int)(random(1,numSides));
        println("Rolling..."+d);
    }

    void owl(int x,int y,int g,float s) {
        pushMatrix();
        translate(x,y);
        scale(s);
        stroke(g);
        strokeWeight(70);
        line(0,-35,0,-65);
        noStroke();
        fill(255-g);
        ellipse(-17.5f,-65,35,35);
        ellipse(17.5f,-65,35,35);
        arc(0,-65,70,70,0,PI);
        fill(g);
        ellipse(-14,-65,8,8);
        ellipse(14,-65,8,8);
        quad(0,-58,4,-51,0,-44,-4,-51);
        popMatrix();
    }
}
