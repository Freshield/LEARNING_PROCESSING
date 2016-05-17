import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/17.
 */
public class Chp5 extends PApplet{


    public static void main(String[] args) {

        PApplet.main("Chp5");
    }

    public void settings(){
        super.settings();
        size(720,480);
        smooth();
    }

//    int x = 280;
//    int y = -100;
//    int diameter = 380;

    float x;
    float y;
    float easing = 0.04f;
    float diameter = 12;


    public void setup(){
//        fill(0,102);
//        noStroke();
//        strokeWeight(4);
        stroke(0,102);
    }

    public void draw(){
//        background(204);
//        ellipse(mouseX,mouseY,9,9);
//        line(mouseX,mouseY,pmouseX,pmouseY);
//        float weight = dist(mouseX,mouseY,pmouseX,pmouseY);
//        strokeWeight(weight);
//        line(mouseX,mouseY,pmouseX,pmouseY);
        float targetX = mouseX;
        x += (targetX - x) * easing;
        float targetY = mouseY;
        y += (targetY - y) * easing;
        ellipse(x,y,12,12);
        println(targetX+" : "+x);

    }
}
