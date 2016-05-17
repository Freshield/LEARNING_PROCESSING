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

        background(0);
        noStroke();
        for (int y = 0;y <= height; y+= 40){
            fill(255,140);
            ellipse(0,y,40,40);
        }
        for (int x = 0; x <= width; x+= 40){
            fill(255,140);
            ellipse(x,0,40,40);
        }

    }

}
