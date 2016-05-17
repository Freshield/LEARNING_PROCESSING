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

    public void setup(){


    }

    public void draw(){
        println("I'm drawing");
        println(frameCount);
    }
}
