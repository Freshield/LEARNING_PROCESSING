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

//    float speed = 2.5f;
//    int diameter = 20;
//    float x;
//    float y;

//    int time1 = 2000;
//    int time2 = 4000;
//    float x = 0;

//    float angle = 0.0f;
//    float offset = 60;
//    float scalar = 40;
//    float speed = 0.5f;

    float angle = 0.0f;
    float offset = 60;
    float scalar = 2;
    float speed = 0.05f;

    public void settings(){
        super.settings();
        size(400,300);
        smooth();
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

//        x += random(-speed,speed);
//        y += random(-speed,speed);
//        x = constrain(x,0,width);
//        y = constrain(y,0,height);
//        ellipse(x,y,diameter,diameter);

//        int timer = millis();
//        println(timer);

//        int currentTime = millis();
//        background(204);
//        if (currentTime > time2) {
//            x -= 0.5;
//        } else if (currentTime > time1) {
//            x += 2;
//        }
//        ellipse(x,60,90,90);

//        float sinval = sin(angle);
//        println(sinval);
//        float gray = map(sinval,-1,1,0,255);
//        background(gray);
//        angle += 0.1;

//        background(0);
//        float y1 = offset + sin(angle) * scalar;
//        float y2 = offset + sin(angle + 0.4f) * scalar;
//        float y3 = offset + sin(angle + 0.8f) * scalar;
//        ellipse(80,y1,40,40);
//        ellipse(120,y2,40,40);
//        ellipse(160,y3,40,40);
//        angle += speed;

//        float x = offset + cos(angle) * scalar;
//        float y = offset + sin(angle) * scalar;
//        ellipse(x,y,40,40);
//        angle += speed;

//        float x = offset + cos(angle) * scalar;
//        float y = offset + sin(angle) * scalar;
//        ellipse(x,y,2,2);
//        angle += speed;
//        scalar += speed;
    }
}
