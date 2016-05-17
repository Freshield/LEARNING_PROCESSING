import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.core.PShape;

/**
 * Created by FRESHIELD on 2016/5/17.
 */
public class Chp6 extends PApplet {

    PImage img1;
    PImage img2;
    PFont font;
    String quote = "That's one small step for man...";
    PShape network;

    PShape bot1;
    PShape bot2;
    PShape bot3;
    PImage landscape;

    float easing = 0.05f;
    float offset = 0;

    public static void main(String[] args) {

        PApplet.main("Chp6");
    }

    public void settings(){
        super.settings();
        size(1920,1080);
        smooth();


    }

    public void setup(){
//        img1 = loadImage("lunar.jpg");
//        img2 = loadImage("capsule.jpg");
//        imageMode(CENTER);
//        img1 = loadImage("clouds.png");
//        font = loadFont("TimeScrD-Medi-48.vlw");
//        textFont(font);
//        network = loadShape("network.svg");
//        shapeMode(CENTER);
        bot1 = loadShape("robot1.svg");
        bot2 = loadShape("robot2.svg");
        bot3 = loadShape("robot3.svg");
        landscape = loadImage("background.jpg");
    }

    public void draw(){
//        image(img1,-120,0);
//        image(img1,130,0,240,120);
//        image(img2,300,0,240,120);
//        background(0);
//        image(img1,0,0,mouseX*2,mouseY*2);
//        image(img1,mouseX,mouseY);

//        background(255);
//        image(img1,0,0);
//        image(img1,0,mouseY*-1);

//        background(102);
//        textSize(36);
//        text(quote,25,60,240,100);
//        textSize(18);
//        text("That's one small step for man...",27,90);

//        background(0);
//        shape(network,30,10);
//        shape(network,180,10,280,280);

//        background(0);
//        float diameter = map(mouseX,0,width,10,800);
//        shape(network,120,60,diameter,diameter);

        background(landscape);

        float targetOffset = map(mouseY,0,height,-40,40);
        offset += (targetOffset - offset)*easing;

        shape(bot1,85+offset,65);

        float smallerOffset = offset * 0.7f;
        shape(bot2,510+smallerOffset,140,78,248);

        smallerOffset *= -0.5f;
        shape(bot3,410+smallerOffset,225,39,124);

    }
}
