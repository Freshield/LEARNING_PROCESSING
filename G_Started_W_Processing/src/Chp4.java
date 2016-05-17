import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/16.
 */
public class Chp4 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp4");
    }

    public void settings(){
        super.settings();
        size(720,480);

    }

    public void setup(){
        smooth();

    }

    public void draw(){

//        int y = 100;
//        int d = 130;
//        ellipse(75,y,d,d);
//        ellipse(175,y,d,d);
//        ellipse(275,y,d,d);

//        line(0,0,width,height);
//        line(width,0,0,height);
//        ellipse(width/2,height/2,60,60);

//        int x = 25;
//        int h = 20;
//        int y = 25;
//        rect(x,y,300,h);
//        x = x + 100;
//        rect(x,y+h,300,h);
//        x = x - 250;
//        rect(x,y+h*2,300,h);

//        strokeWeight(2);
//        for (int i = 20;i<400;i += 20){
//            line(i,40,i+i/2,80);
//            line(i+i/2,80,i*1.2f,120);
//        }

//        background(0);
//        noStroke();
//        for (int y = 0;y <= height; y+= 40){
//            fill(255,140);
//            ellipse(0,y,40,40);
//        }
//        for (int x = 0; x <= width; x+= 40){
//            fill(255,140);
//            ellipse(x,0,40,40);
//        }

//        background(0);
//        fill(255);
//        stroke(102);
//        for (int y = 20;y <=height-20;y += 10){
//            for (int x = 20; x <= width - 20; x += 10){
//                line(x,y,240,60);
//
//            }
//        }
//        for (int y = 20;y <=height-20;y += 10){
//            for (int x = 20; x <= width - 20; x += 10){
//
//                ellipse(x,y,4,4);
//            }
//        }

//        background(0);
//        for (int y = 32; y <= height; y +=8){
//            for (int x = 12; x <= width; x += 15){
//                ellipse(x+y,y,46-y/10.0f,46-y/10.0f);
//            }
//        }

        int x = 60;
        int y = 390;
        int bodyHeight = 180;
        int neckHeight = 40;
        int radius = 45;
        int ny = y - bodyHeight - neckHeight - radius;


        strokeWeight(2);
        background(204);
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

}
