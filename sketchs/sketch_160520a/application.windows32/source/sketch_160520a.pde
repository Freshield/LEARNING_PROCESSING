
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



    public void setup(){
        size(1000, 1000,P3D);
        frameRate(45);
        
        smooth();
        
        galaxy = new GalaxyCoordinator(gTranslateX, gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,gNumberOfCircles,gInterval,gColorR,gColorG,gColorB,gTransparent,gStart);

        star1 = new Stars(gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,255,0,0,86,0,0,0,0,0.02f);
        star2 = new Stars(gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,0,255,38,0*gInterval+gStart,0,0.015f,0,0.025f);
        star3 = new Stars(gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,255,255,18,1*gInterval+gStart,0,0.035f,0,0.035f);
        star4 = new Stars(gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,40,255,45,28,2*gInterval+gStart,0,0.025f,0,0.025f);
        star5 = new Stars(gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,46,169,223,48,3*gInterval+gStart,0,0.02f,0,0.025f);


    }

    public void draw(){

        background(0);
        lights();

        galaxy.draw(false);

        star1.draw();
        star2.draw();
        star3.draw();
        star4.draw();
        star5.draw();


    }




class GalaxyCoordinator {

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

    GalaxyCoordinator(float _translateX,float _translateY,float _translateZ,
                             float _gradeX, float _gradeY, float _gradeZ,
                             int _numberOfCircles, float _interval,
                             int _colorR, int _colorG, int _colorB,
                             int _transparent, float _start) {

        
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

    void draw(boolean testing){

        pushMatrix();

        translate(translateX,translateY,translateZ);
        rotateX(radians(gradeX));
        rotateY(radians(gradeY));
        rotateZ(radians(gradeZ));

        float radius = start;
        noFill();
        stroke(colorR,colorG,colorB,transparent);
        for (int i = 0; i < numberOfCircles; i++) {
            ellipse(0,0,radius*2,radius*2);
            radius += interval;
        }

        if (testing) {
            stroke(255,0,0);
            line(0,0,0,numberOfCircles*interval,0,0);
            stroke(0,255,0);
            line(0,0,0,0,numberOfCircles*interval,0);
            stroke(0,0,255);
            line(0,0,0,0,0,numberOfCircles*interval);
        }

        popMatrix();

    }

}


class Stars {

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

    Stars(float _translateX,float _translateY,float _translateZ,
                 float _gradeX, float _gradeY, float _gradeZ,
                 int _fillColorR, int _fillColorG, int _fillColorB,
                 int _strokeColorR, int _strokeColorG, int _strokeColorB,
                 int _size, float _radiux, float _revolutionAngle, float _revolutionSpeed,
                 float _rotationAngle, float _rotationSpeed) {

        
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

    void draw() {

        pushMatrix();

        float x = cos(revolutionAngle) * radiux;
        float y = sin(revolutionAngle) * radiux;

        translate(translateX,translateY,translateZ);
        rotateX(radians(gradeX));
        rotateY(radians(gradeY));
        rotateZ(radians(gradeZ));

        translate(x,y,0);
        rotateX(radians(90));
        rotateY(rotationAngle);

        fill(fillColorR,fillColorG,fillColorB);
        stroke(strokeColorR,strokeColorG,strokeColorB);
        sphere(size);

        rotateX(radians(-90));
        popMatrix();

        revolutionAngle += revolutionSpeed;
        rotationAngle += rotationSpeed;



    }

}
