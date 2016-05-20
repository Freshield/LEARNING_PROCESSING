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
    float scalar1 = 450;
    float scalar0 = 2;
    float scalar2 = 600;
    float speed = 0.01f;
    float speed1 = 0.03f;
    float speed0 = 0.02f;
    float speed2 = 0.02f;
    GalaxyCoordinator galaxy;
    Stars star;

    float gTranslateX = 400;
    float gTranslateY = 400;
    float gTranslateZ = -100;
    float gGradeX = 60;
    float gGradeY = 30;
    float gGradeZ = 0;
    int gNumberOfCircles = 24;
    float gInterval = 150;
    int gColorR = 255;
    int gColorG = 255;
    int gColorB = 255;
    int gTransparent = 100;
    float gStart = 300;


    public void settings() {
        super.settings();

        size(1000, 1000, P3D);
        smooth();
    }

    public void setup(){

        galaxy = new GalaxyCoordinator(this,gTranslateX, gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,gNumberOfCircles,gInterval,gColorR,gColorG,gColorB,gTransparent,gStart);
        star = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,46,169,223,66,3*gInterval+gStart,0,0.01f,0,0.03f);


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



        galaxy.draw(true);

        star.draw();

//        rotateZ(PI/6);
//        noFill();
//        stroke(255);
//        ellipse(0,0,scalar*2,scalar*2);
//        ellipse(0,0,scalar1*2,scalar1*2);
//        ellipse(0,0,scalar2*2,scalar2*2);
//        stroke(255,0,0);
//        line(0,0,0,600,0,0);
//        stroke(0,255,0);
//        line(0,0,0,0,600,0);
//        stroke(0,0,255);
//        line(0,0,0,0,0,600);

        pushMatrix();


        translate(400,400,-100);
        rotateX(PI/3);
        rotateY(PI/6);

        rotateX(radians(90));
        rotateY(angle0);
        fill(255);
        stroke(255,0,0);
        sphere(88);
        rotateX(radians(-90));



//
//        stroke(255,0,0);
//        line(0,0,0,300,0,0);
//        stroke(0,255,0);
//        line(0,0,0,0,300,0);
//        stroke(0,0,255);
//        line(0,0,0,0,0,300);

        popMatrix();


        translate(400,400,-100);
        rotateX(PI/3);
        rotateY(PI/6);

        pushMatrix();
        translate(x,y,0);
        rotateX(radians(90));
        rotateY(angle0);
        fill(255);
        stroke(0,0,255);
        sphere(38);
        rotateX(radians(-90));
//        stroke(255,0,0);
//        line(0,0,0,300,0,0);
//        stroke(0,255,0);
//        line(0,0,0,0,300,0);
//        stroke(0,0,255);
//        line(0,0,0,0,0,300);
        popMatrix();

        pushMatrix();
        translate(x1,y1,0);
        rotateX(radians(90));
        rotateY(angle0);
        fill(255);
        stroke(0,255,255);
        sphere(18);
        rotateX(radians(-90));
        popMatrix();

        pushMatrix();
        translate(x2,y2,0);
        rotateX(radians(90));
        rotateY(angle0);
        fill(255);
        stroke(40,255,45);
        sphere(28);
        rotateX(radians(-90));
        popMatrix();

        angle += speed;
        angle1 += speed1;
        angle0 += speed0;
        angle2 += speed2;



    }
}
