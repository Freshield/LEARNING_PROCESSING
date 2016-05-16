import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/16.
 */
public class Test1 extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Test1");
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
        } else {
            fill(255);
        }
        ellipse(mouseX,mouseY,80,80);

    }

}