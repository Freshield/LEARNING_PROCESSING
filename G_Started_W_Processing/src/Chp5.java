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

    int x = 280;
    int y = -100;
    int diameter = 380;

    public void setup(){
        fill(0,102);
        noStroke();
    }

    public void draw(){
        background(204);
        ellipse(mouseX,mouseY,9,9);

    }
}
