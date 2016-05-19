import processing.core.*;
import processing.opengl.*;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class MTest1 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("MTest1");
    }

    float angle = 0.0f;
    float angle1 = 0.0f;
    float angle0 = 0.0f;
    float angle2 = 0.0f;
    float offset = 0;
    float scalar = 300;
    float scalar1 = 500;
    float scalar0 = 2;
    float scalar2 = 650;
    float speed = 0.01f;
    float speed1 = 0.03f;
    float speed0 = 0.005f;
    float speed2 = 0.02f;


    public void settings() {
        super.settings();
        size(1000, 1000, OPENGL);
        smooth();
    }

    public void setup(){



    }

    public void draw(){

        background(0);
        lights();

        float x = offset + cos(angle) * scalar;
        float y = offset + sin(angle) * scalar;
        float x1 = offset + cos(angle1) * scalar1;
        float y1 = offset + sin(angle1) * scalar1;
        float x2 = offset + cos(angle2) * scalar2;
        float y2 = offset + sin(angle2) * scalar2;

        translate(500,500,-100);
        rotateX(PI/3);
        noFill();
        stroke(255);
        ellipse(0,0,scalar*2,scalar*2);
        ellipse(0,0,scalar1*2,scalar1*2);
        ellipse(0,0,scalar2*2,scalar2*2);

        pushMatrix();
        rotateZ(angle0);
        fill(255);
        stroke(255,0,0);
        sphere(68);
        popMatrix();

        pushMatrix();
        translate(x,y,0);
        fill(255);
        stroke(0,0,255);
        sphere(38);
        popMatrix();

        pushMatrix();
        translate(x1,y1,0);
        fill(255);
        stroke(0,255,255);
        sphere(18);
        popMatrix();

        pushMatrix();
        translate(x2,y2,0);
        fill(255);
        stroke(40,255,45);
        sphere(28);
        popMatrix();

        angle += speed;
        angle1 += speed1;
        angle0 += speed0;
        angle2 += speed2;


    }
}
