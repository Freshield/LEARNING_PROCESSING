import processing.core.*;
import processing.opengl.*;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class MTest1 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("MTest1");
    }

    GalaxyCoordinator galaxy;
    Stars star1;
    Stars star2;
    Stars star3;
    Stars star4;
    Stars star5;

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

        star1 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,255,0,0,86,0,0,0,0,0.02f);
        star2 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,0,255,38,0*gInterval+gStart,0,0.01f,0,0.02f);
        star3 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,255,255,18,1*gInterval+gStart,0,0.03f,0,0.03f);
        star4 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,40,255,45,28,2*gInterval+gStart,0,0.02f,0,0.02f);
        star5 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,46,169,223,48,3*gInterval+gStart,0,0.015f,0,0.02f);


    }

    public void draw(){

        background(0);
        lights();

        galaxy.draw(true);

        star1.draw();
        star2.draw();
        star3.draw();
        star4.draw();
        star5.draw();


    }
}
