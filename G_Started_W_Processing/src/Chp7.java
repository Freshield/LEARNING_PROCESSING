import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/17.
 */
public class Chp7 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp7");
    }

//    int radius = 40;
//    float x = 110;
//    float y = -radius;
//    float speed = 1;
//    int direction = 1;

//    int startX = 20;
//    int stopX = 160;
//    int startY = 30;
//    int stopY = 80;
//    float x = startX;
//    float y = startY;
//    float step = 0.01f;
//    float pct = 0.1f;

    float speed = 2.5f;
    int diameter = 20;
    float x;
    float y;


    public void settings(){
        super.settings();
        size(400,300);
        smooth();
        x = width/2;
        y = height/2;
    }

    public void setup(){
//        ellipseMode(RADIUS);
    }

    public void draw(){
//        background(0);
//        x += speed;
//        arc(x,60,radius,radius,0.52f,5.76f);
//        if ((x >= width-radius) && (x <= width+radius)) {
//            arc(y,60,radius,radius,0.52f,5.76f);
//            y += speed;
//        }
//        if (x >= width+radius) {
//            x = y-speed;
//            y = -radius;
//        }

//        background(0);
//        x += speed*direction;
//        if ((x > width-radius) || (x < radius)) {
//            direction = -direction;
//        }
//        if (direction == 1) {
//            arc(x,60,radius,radius,0.52f,5.76f);
//        } else {
//            arc(x,60,radius,radius,3.67f,8.9f);
//        }

//        background(0);
//        if (pct < 1.0) {
//            x = startX + ((stopX - startX) * pct);
//            y = startY + ((stopY - startX) * pct);
//            pct += step;
//        }
//        ellipse(x,y,20,20);

//        float r = random(0,mouseX);
//        println(r);

//        background(204);
//        for (int x = 20;x < width; x += 20) {
//            float mx = mouseX / 100;
//            float offsetA = random(-mx,mx);
//            float offsetB = random(-mx,mx);
//            line(x + offsetA,20,x - offsetB,100);
//        }

        x += random(-speed,speed);
        y += random(-speed,speed);
        x = constrain(x,0,width);
        y = constrain(y,0,height);
        ellipse(x,y,diameter,diameter);
    }
}
