import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/24.
 */
public class Test_circle extends PApplet{

    public static void main(String[] args) {

        PApplet.main("Test_circle");
    }

    int value = 204;
    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){

    }

    public void draw(){
        pushMatrix();
        fill(value);
        translate(width/2,height/2,0);
        ellipse(0,0,80,80);
        float x = modelX(0,0,0);
        float y = modelY(0,0,0);
        float z = modelZ(0,0,0);
        popMatrix();

        println(x+" : "+y+" : "+z);
        println(mouseX+" : "+mouseY);

        if (dist(mouseX,mouseY,x,y) < 40) {
            value = 0;
        } else {
            value = 204;
        }
    }

}
