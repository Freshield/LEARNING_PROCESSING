/**
 * Created by FRESHIELD on 2016/5/19.
 */
import processing.core.PApplet;

public class Stars {

    PApplet parent;
    float translateX;
    float translateY;
    float translateZ;
    float gradeX;
    float gradeY;
    float gradeZ;
    int fillColorR;
    int fillColorG;
    int fillColorB;
    int strokeColorR;
    int strokeColorG;
    int strokeColorB;
    int size;
    float radiux;
    float revolutionAngle;
    float revolutionSpeed;
    float rotationAngle;
    float rotationSpeed;

    float starPositionX;
    float starPositionY;

    float starModelX,starModelY,starModelZ;

    public Stars(PApplet _parent,float _translateX,float _translateY,float _translateZ,
                 float _gradeX, float _gradeY, float _gradeZ,
                 int _fillColorR, int _fillColorG, int _fillColorB,
                 int _strokeColorR, int _strokeColorG, int _strokeColorB,
                 int _size, float _radiux, float _revolutionAngle, float _revolutionSpeed,
                 float _rotationAngle, float _rotationSpeed) {

        parent = _parent;
        translateX = _translateX;
        translateY = _translateY;
        translateZ = _translateZ;
        gradeX = _gradeX;
        gradeY = _gradeY;
        gradeZ = _gradeZ;
        fillColorR = _fillColorR;
        fillColorG = _fillColorG;
        fillColorB = _fillColorB;
        strokeColorR = _strokeColorR;
        strokeColorG = _strokeColorG;
        strokeColorB = _strokeColorB;
        size = _size;
        radiux = _radiux;
        revolutionAngle = _revolutionAngle;
        revolutionSpeed = _revolutionSpeed;
        rotationAngle = _rotationAngle;
        rotationSpeed = _rotationSpeed;


    }

    public void draw() {

        parent.pushMatrix();

        starPositionX = parent.cos(revolutionAngle) * radiux;
        starPositionY = parent.sin(revolutionAngle) * radiux;


//        parent.translate(translateX,translateY,translateZ);
//        parent.rotateX(parent.radians(gradeX));
//        parent.rotateY(parent.radians(gradeY));
//        parent.rotateZ(parent.radians(gradeZ));

        parent.translate(starPositionX,starPositionY,0);
        parent.rotateX(parent.radians(90));
        parent.rotateY(rotationAngle);

        parent.fill(fillColorR,fillColorG,fillColorB);
        parent.stroke(strokeColorR,strokeColorG,strokeColorB);
        parent.sphere(size);

        parent.rotateX(parent.radians(-90));


        starModelX = parent.modelX(0,0,0);
        starModelY = parent.modelY(0,0,0);
        starModelZ = parent.modelZ(0,0,0);

        parent.popMatrix();

        revolutionAngle += revolutionSpeed;
        rotationAngle += rotationSpeed;


    }

    public void drawTap(int fillR,int fillG,int fillAlpha,int fillB,int strokeR,int strokeG,int strokeB) {

        parent.pushMatrix();
        starPositionX = parent.cos(revolutionAngle) * radiux;
        starPositionY = parent.sin(revolutionAngle) * radiux;
        parent.translate(starPositionX,starPositionY,0);
        parent.fill(fillR,fillG,fillB,fillAlpha);
        parent.stroke(strokeR,strokeG,strokeB);

    }

    public float getStarPositionX() {
        return parent.cos(revolutionAngle) * radiux;
    }

    public float getStarPositionY() {
        return parent.sin(revolutionAngle) * radiux;
    }

}
