import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/16.
 */
public class Chp3 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp3");
    }

    public void settings(){
        super.settings();
        size(480,120);
    }

    public void setup(){


    }

    public void draw(){
//        quad(158,55,199,14,392,66,351,107);
//        triangle(347,54,392,9,392,66);
//        triangle(158,55,290,91,290,112);
//        rect(180,60,220,40);
//        ellipse(278,-100,400,400);
//        ellipse(120,100,110,110);
//        ellipse(412,60,18,18);
        arc(90,60,80,80,0,radians(90));
        arc(190,60,80,80,0,PI+HALF_PI);
        arc(290,60,80,80,PI,TWO_PI+HALF_PI);
        arc(390,60,80,80,QUARTER_PI,PI+QUARTER_PI);
    }

}
