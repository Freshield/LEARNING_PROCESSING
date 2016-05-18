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
//
//    float angle = 0.0f;
//    float offset = 60;
//    float scalar = 2;
//    float speed = 0.05f;

//    float angle = 0.0f;
//    float angleDirection = 1;
//    float speed = 0.005f;

    float x = 180;
    float y = 400;
    float bodyHeight = 153;
    float neckHeight = 56;
    float radius = 45;
    float angle = 0.0f;

    public void settings(){
        super.settings();
        size(1400,1300);
        smooth();
    }

    public void setup(){
        ellipseMode(RADIUS);
//        background(204);
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
//        pushMatrix();
//        translate(mouseX,mouseY);
//        rect(0,0,30,30);
//        translate(-mouseX,-mouseY);
//        popMatrix();
//        translate(35,10);
//        rect(0,0,15,15);

//        translate(mouseX,mouseY);
//        rotate(angle);
//        rect(-15,-15,30,30);
//        angle += 0.1;

//        translate(mouseX,mouseY);
//        float scalar = sin(angle)+2;
//        scale(scalar);
//        strokeWeight(1.0f / scalar);
//        rect(-15,-15,30,30);
//        angle += 0.1;

//        background(204);
//        translate(20,25);
//        rotate(angle);
//        strokeWeight(12);
//        line(0,0,40,0);
//        translate(40,0);
//        rotate(angle*2.0f);
//        strokeWeight(6);
//        line(0,0,30,0);
//        translate(30,0);
//        rotate(angle*2.5f);
//        strokeWeight(3);
//        line(0,0,20,0);
//
//        angle += speed * angleDirection;
//        if ((angle > QUARTER_PI) || (angle < 0)) {
//            angleDirection *= -1;
//        }

        background(255);

        x += random(-4,4);
        y += random(-1,1);

        neckHeight = 80 + sin(angle) * 30;
        angle += 0.05;

        float ny = y - bodyHeight - neckHeight - radius;

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
}
