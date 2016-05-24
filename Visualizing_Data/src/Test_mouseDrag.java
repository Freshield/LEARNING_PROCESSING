/**
 * Created by FRESHIELD on 2016/5/24.
 */
import processing.core.PApplet;

public class Test_mouseDrag extends PApplet{

    public static void main(String[] args) {

        PApplet.main("Test_mouseDrag");
    }

    int value = 0;
    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){

    }

    public void draw(){
        fill(value);
        rect(25, 25, 50, 50);
    }

    public void mouseDragged() {
        value = value + 5;
        if (value > 255) {
            value = 0;
        }
    }
}
