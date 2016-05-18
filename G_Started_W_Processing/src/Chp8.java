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

//        background(204);
//        randomSeed(0);
//        for (int i = 35;i < width+40; i += 40) {
//            int gray = (int)(random(0,102));
//            float scalar = random(0.25f,1.0f);
//            owl(i,100,gray,scalar);
//        }

//    float yourWeight = 132;
//    float marsWeight = calculateMars(yourWeight);
//    println(marsWeight);

        background(204);
        drawRobot(120,420,110,140);
        drawRobot(270,460,260,95);
        drawRobot(420,310,80,10);
        drawRobot(570,390,180,40);


    }

    void drawRobot(int x, int y, int bodyHeight, int neckHeight) {

        int radius = 45;
        int ny = y - bodyHeight - neckHeight - radius;


        strokeWeight(2);
        ellipseMode(RADIUS);

        //neck

        stroke(102);
        line(x+2,y-bodyHeight,x+2,ny);
        line(x+12,y-bodyHeight,x+12,ny);
        line(x+22,y-bodyHeight,x+22,ny);

        //antenna
        line(x+12,ny,x-18,ny-43);
        line(x+12,ny,x+42,ny-99);
        line(x+12,ny,x+78,ny+15);


        //body
        noStroke();
        fill(102);
        ellipse(x,y-33,33,33);
        fill(0);
        rect(x-45,y-bodyHeight,90,bodyHeight-33);
        fill(102);
        rect(x-45,y-bodyHeight+17,90,6);

        //head
        fill(0);
        ellipse(x+12,ny,radius,radius);
        fill(255);
        ellipse(x+24,ny-6,14,14);
        fill(0);
        ellipse(x+24,ny-6,3,3);
        fill(153);
        ellipse(x,ny-8,5,5);
        ellipse(x+30,ny-26,4,4);
        ellipse(x+41,ny+6,3,3);
    }

    float calculateMars (float w) {
        float newWeight = w * 0.38f;
        return newWeight;
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
