/**
 * Created by FRESHIELD on 2016/5/19.
 */
import processing.core.PApplet;

public class Stars {

    PApplet parent;
    float _angle = 0.0f;
    float _speed = 0.0f;

    public Stars(PApplet _parent, float angle, float speed) {

        parent = _parent;
        _angle = angle;
        _speed = speed;
    }

    public void draw(float translateX,float translateY,float translateZ,
                     float gradeX, float gradeY, float gradeZ,
                     int fillColorR, int fillColorG, int fillColorB,
                     int strokeColorR, int strokeColorG, int strokeColorB,
                     int size, int scalar) {

        parent.pushMatrix();


        float x = parent.cos(_angle) * scalar;
        float y = parent.sin(_angle) * scalar;


        parent.rotateZ(_angle);
        parent.translate(x,y,0);
        parent.fill(fillColorR,fillColorG,fillColorB);
        parent.stroke(strokeColorR,strokeColorG,strokeColorB);
        parent.sphere(size);

        parent.popMatrix();

        _angle += _speed;



    }

}
