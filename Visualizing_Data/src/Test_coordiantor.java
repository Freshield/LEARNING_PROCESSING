import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/24.
 */
public class Test_coordiantor extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Test_coordiantor");
    }

    int value = 0;
    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){


    }

    public void draw(){
        background(0);
        camera(mouseX, height/2, (height/2) / tan(PI/6), width/2, height/2, 0, 0, 1, 0);
        translate(width/2, height/2, -100);
        stroke(255);
        noFill();
        box(200);
    }

}
