import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/17.
 */
public class Chp5 extends PApplet{


    public static void main(String[] args) {

        PApplet.main("Chp5");
    }

    float x = 60;
    float y = 440;
    int radius = 45;
    int bodyHeight = 160;
    int neckHeight = 70;

    float easing = 0.02f;

    public void settings(){
        super.settings();
        size(720,480);
        smooth();
    }

//    int x = 280;
//    int y = -100;
//    int diameter = 380;

//    float x = 215;
//    int offset = 10;
//    float y = 30;
//    int radius = 12;
//    int w = 80;
//    int h = 60;
//    float px;
//    float py;
//    float easing = 0.05f;
//    float diameter = 12;




    public void setup(){
//        fill(0,102);
//        noStroke();
//        strokeWeight(4);
//        stroke(12);
//        strokeWeight(30);
//        x = width/2;
//        ellipseMode(RADIUS);
//        textSize(64);
//        textAlign(CENTER);
        strokeWeight(2);
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

//        background(204);
//        float d = dist(mouseX,mouseY,x,y);
//        if (d < radius) {
//            radius++;
//            fill(0);
//
//        } else {
//            fill(255);
//        }
//        ellipse(x,y,radius,radius);

//        background(204);
//        if ((mouseX > x) && (mouseX < x+w) && (mouseY > y) && (mouseY < y+h)) {
//            fill(0);
//        } else {
//            fill(255);
//        }
//        rect(x,y,w,h);

//        background(204);
//        line(20,20,220,100);
//        if (keyPressed) {
//            line(220,20,20,100);
//        }

//        background(0);
//        text(key,60,80);

//        background(204);
//        if (keyPressed) {
//            if ((key == 'h') || (key == 'H')) {
//                line(30,60,90,60);
//            }
//            if ((key == 'n') || (key == 'N')) {
//                line(30,20,90,100);
//            }
//        }
//        line(30,20,30,100);
//        line(90,20,90,100);

//        if (keyPressed && (key == CODED)) {
//            if (keyCode == LEFT) {
//                x--;
//            } else if (keyCode == RIGHT) {
//                x++;
//            }
//        }
//        rect(x,45,50,50);


        int targetX = mouseX;
        x += (targetX -x)*easing;

        if (mousePressed) {
            neckHeight = 16;
            bodyHeight = 90;
        } else {
            neckHeight = 70;
            bodyHeight = 160;
        }

        float ny = y - bodyHeight - neckHeight - radius;

        background(204);

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
