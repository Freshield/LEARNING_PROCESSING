import processing.core.PApplet;
/**
 * Created by FRESHIELD on 2016/5/19.
 */
public class GalaxyCoordinator {


    PApplet parent;

    public GalaxyCoordinator(PApplet _parent) {

        parent = _parent;
    }



    public void draw(float translateX,float translateY,float translateZ,
                                  float gradeX, float gradeY, float gradeZ,
                                  int numberOfCircles, float interval,
                                  int colorR, int colorG, int colorB,
                                  int transparent, boolean testing){


        parent.pushMatrix();


        parent.translate(translateX,translateY,translateZ);
        parent.rotateX(parent.radians(gradeX));
        parent.rotateY(parent.radians(gradeY));
        parent.rotateZ(parent.radians(gradeZ));

        float radius = interval;
        parent.noFill();
        parent.stroke(colorR,colorG,colorB,transparent);
        for (int i = 0; i < numberOfCircles; i++) {
            parent.ellipse(0,0,radius,radius);
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
