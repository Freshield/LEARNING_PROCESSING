/**
 * Created by FRESHIELD on 2016/5/21.
 */
import processing.core.PApplet;

public class Test_Camera extends PApplet{

    public static void main(String[] args) {

        PApplet.main("Test_Camera");
    }


    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){
        noStroke();
        fill(204);
    }

    int mouseposition = 0;
    public void draw(){
//        background(0);
//
//
//        translate(width/2, height/2, -100);
//        stroke(255);
//        noFill();
//        box(200);
//        if (mousePressed) {
//
//            stroke(255,0,0);
//            line(0,0,0,500,0,0);
//            stroke(0,255,0);
//            line(0,0,0,0,500,0);
//            stroke(0,0,255);
//            line(0,0,0,0,0,500);
//            rotateY(radians(mouseX));
//        }
        background(0);
        lights();

        if(mousePressed) {
            float fov = PI/3.0f;
            float cameraZ = (height/2.0f) / tan(fov/2.0f);
            perspective(fov, (float)(width)/(float)(height), cameraZ/2.0f, cameraZ*2.0f);
        } else {
            ortho(0, width, 0, height);
        }
        translate(width/2, height/2, 0);
        rotateX(-PI/6);
        rotateY(PI/3);
        box(160);
    }
}
