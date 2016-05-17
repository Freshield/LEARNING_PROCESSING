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
    float px;
    float py;
    float easing = 0.05f;
    float diameter = 12;


    public void setup(){
//        fill(0,102);
//        noStroke();
//        strokeWeight(4);
//        stroke(12);
        strokeWeight(30);
    }

    public void draw(){
//        background(204);
//        ellipse(mouseX,mouseY,9,9);
//        line(mouseX,mouseY,pmouseX,pmouseY);
//        float weight = dist(mouseX,mouseY,pmouseX,pmouseY);
//        strokeWeight(weight);
//        line(mouseX,mouseY,pmouseX,pmouseY);
//        float targetX = mouseX;
//        x += (targetX - x) * easing;
//        float targetY = mouseY;
//        y += (targetY - y) * easing;
//        ellipse(x,y,12,12);
//        println(targetX+" : "+x);
//        float targetX = mouseX;

//        x += (targetX - x)*easing;
//        float targetY = mouseY;
//        y += (targetY - y)*easing;
//        float weight = dist(x,y,px,py);
//        strokeWeight(weight);
//        line(x,y,px,py);
//        py = y;
//        px = x;

//        background(204);
//        stroke(255);
//        line(120,60,mouseX,mouseY);
//        stroke(0);
//        float mx = mouseX/2 + 60;
//        float mx = map(mouseX,0,width,60,180);
//        line(120,60,mx,mouseY);

        background(204);
        stroke(102);
        line(40,0,70,height);
        if (mousePressed == true) {
            if (mouseButton == LEFT) {
                stroke(255);
            } else {
                stroke(0);
            }
            line(0,70,width,50);
        }


    }
}
