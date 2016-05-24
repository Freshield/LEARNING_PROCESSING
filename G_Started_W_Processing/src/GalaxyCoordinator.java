import processing.core.PApplet;
/**
 * Created by FRESHIELD on 2016/5/19.
 */
public class GalaxyCoordinator {

    PApplet parent;
    float translateX;
    float translateY;
    float translateZ;
    float gradeX;
    float gradeY;
    float gradeZ;
    int numberOfCircles;
    float interval;
    int colorR;
    int colorG;
    int colorB;
    int transparent;
    float start;

    public GalaxyCoordinator(PApplet _parent,float _translateX,float _translateY,float _translateZ,
                             float _gradeX, float _gradeY, float _gradeZ,
                             int _numberOfCircles, float _interval,
                             int _colorR, int _colorG, int _colorB,
                             int _transparent, float _start) {

        parent = _parent;
        translateX = _translateX;
        translateY = _translateY;
        translateZ = _translateZ;
        gradeX = _gradeX;
        gradeY = _gradeY;
        gradeZ = _gradeZ;
        numberOfCircles = _numberOfCircles;
        interval = _interval;
        colorR = _colorR;
        colorG = _colorG;
        colorB = _colorB;
        transparent = _transparent;
        start = _start;

    }

    public void draw(boolean testing){

        parent.pushMatrix();

//        parent.translate(translateX,translateY,translateZ);
//        parent.rotateX(parent.radians(gradeX));
//        parent.rotateY(parent.radians(gradeY));
//        parent.rotateZ(parent.radians(gradeZ));

        float radius = start;
        parent.noFill();
        parent.stroke(colorR,colorG,colorB,transparent);
        for (int i = 0; i < numberOfCircles; i++) {
            parent.ellipse(0,0,radius*2,radius*2);
            radius += interval;
        }

        if (testing) {
            parent.stroke(255,0,0);
            parent.line(0,0,0,numberOfCircles*interval,0,0);
            parent.stroke(0,255,0);
            parent.line(0,0,0,0,numberOfCircles*interval,0);
            parent.stroke(0,0,255);
            parent.line(0,0,0,0,0,numberOfCircles*interval);
        }

        parent.popMatrix();

    }

}
