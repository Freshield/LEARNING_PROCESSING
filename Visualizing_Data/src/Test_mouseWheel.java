/**
 * Created by FRESHIELD on 2016/5/24.
 */
import processing.core.PApplet;
import processing.event.*;

public class Test_mouseWheel extends PApplet{

    public static void main(String[] args) {

        PApplet.main("Test_mouseWheel");
    }

    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){


    }
    float scalar = 1;

    public void draw(){
        background(204);
        translate(width/2,height/2,0);
        scale(scalar);
        ellipse(0,0,50,50);

    }

    public void mouseWheel(MouseEvent event) {
        float e = event.getCount();
        println(e);
        if (e < 0) {
            scalar += 0.2;
        } else if (e > 0){
            if (scalar > 0.2) {
                scalar -= 0.2;
            }
        }
    }
}
