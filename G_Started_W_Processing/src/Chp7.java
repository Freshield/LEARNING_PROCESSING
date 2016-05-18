import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/17.
 */
public class Chp7 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp7");
    }

    public void settings(){
        super.settings();
        size(1920,1080);
        smooth();
    }

    public void setup(){

    }

    public void draw(){
        println(frameCount);
    }
}
