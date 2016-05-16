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
        size(800,800);
    }

    public void setup(){
        smooth();
    }

    public void draw(){
        if (mousePressed){
            fill(0);
            stroke(255);
        } else {
            fill(255);
            stroke(0);

        }
        ellipse(mouseX,mouseY,80,80);

    }

}
