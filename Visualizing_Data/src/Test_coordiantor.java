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
        noFill();
    }

    public void draw(){

        background(0);

        pushMatrix();
        // start at the middle of the screen
        translate(width/2, height/2, -200);
        // some random rotation to make things interesting
        rotateY(1.0f); //yrot);
        rotateZ(2.0f); //zrot);
        // rotate in X a little more each frame
        rotateX(frameCount / 100.0f);
        // offset from center
        translate(0, 150, 0);

        // draw a white box outline at (0, 0, 0)
        stroke(255);
        box(50);

        // the box was drawn at (0, 0, 0), store that location
        float x = modelX(0, 0, 0);
        float y = modelY(0, 0, 0);
        float z = modelZ(0, 0, 0);
        // clear out all the transformations
        popMatrix();

        // draw another box at the same (x, y, z) coordinate as the other
        pushMatrix();
        translate(x, y, z);
        stroke(255, 0, 0);
        box(50);
        popMatrix();

//        background(204);
//
//        translate(width/2,height/2,0);
//
//        float x = mouseX;
//        float y = mouseY;
//        float z = -100;
//
//        // Draw "X" at z = -100
//        stroke(255);
//        line(x-10, y-10, z, x+10, y+10, z);
//        line(x+10, y-10, z, x-10, y+10, z);
//
//        // Draw gray line at z = 0 and same
//        // x value. Notice the parallax
//        stroke(102);
//        line(x, 0, 0, x, height, 0);
//
//        // Draw black line at z = 0 to match
//        // the x value element drawn at z = -100
//        stroke(0);
//        float theX = screenX(x, y, z);
//        line(theX, 0, 0, theX, height, 0);
//
        stroke(255,0,0);
        line(0,0,0,500,0,0);
        stroke(0,255,0);
        line(0,0,0,0,500,0);
        stroke(0,0,255);
        line(0,0,0,0,0,500);

        translate(width/2, height/2, 0);
        ellipse(0,0,150,150);

        stroke(255);
        line(mouseX-10, mouseY-10, 0, mouseX+10, mouseY+10, 0);
        line(mouseX+10, mouseY-10, 0, mouseX-10, mouseY+10, 0);
        println(mouseX+" : "+mouseY+" : "+ x +" : " + y +" : "+z);
    }

}
