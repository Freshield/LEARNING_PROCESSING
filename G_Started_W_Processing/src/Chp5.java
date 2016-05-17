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

    float x = 120;
    int offset = 10;
    float y = 60;
    int radius = 12;
    float px;
    float py;
    float easing = 0.05f;
    float diameter = 12;


    public void setup(){
//        fill(0,102);
//        noStroke();
//        strokeWeight(4);
//        stroke(12);
//        strokeWeight(30);
//        x = width/2;
        ellipseMode(RADIUS);
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

//        background(204);
//        stroke(102);
//        line(40,0,70,height);
//        if (mousePressed == true) {
//            if (mouseButton == LEFT) {
//                stroke(255);
//            } else {
//                stroke(0);
//            }
//            line(0,70,width,50);
//        }

//        background(204);
//
//        if (mouseX != 0 || mouseY!= 0) {
//
//            if (mouseX > x) {
//                x += 5;
//                offset = -10;
//            }
//            if (mouseX < x) {
//                x -= 5;
//                offset = 10;
//            }
//
//            line(x,0,x,height);
//            line(mouseX,mouseY,mouseX + offset,mouseY-10);
//            line(mouseX,mouseY,mouseX + offset,mouseY+10);
//            line(mouseX,mouseY,mouseX + offset*3,mouseY);
//        } else {
//
//            line(x,0,x,height);
//        }

        background(204);
        float d = dist(mouseX,mouseY,x,y);
        if (d < radius) {
            radius++;
            fill(0);

        } else {
            fill(255);
        }
        ellipse(x,y,radius,radius);


    }
}
