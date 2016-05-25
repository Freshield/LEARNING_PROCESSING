import processing.core.*;
import processing.event.MouseEvent;
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
    float gTranslateZ = 0;
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
    int dragValue = 0;
    float scalar = 1;
    int focusNumber = 1;
    int beforeNumber = 1;

    backgroundStar[] backStars = new backgroundStar[30];


    float movingBeginX = 20.0f;  // Initial x-coordinate
    float movingBeginY = 10.0f;  // Initial y-coordinate
    float movingEndX = 570.0f;   // Final x-coordinate
    float movingEndY = 320.0f;   // Final y-coordinate
    float movingDistX;          // X-axis distance to move
    float movingDistY;          // Y-axis distance to move
    float movingX = 0.0f;        // Current x-coordinate
    float movingY = 0.0f;        // Current y-coordinate
    float movingStep = 0.02f;    // Size of each step along the path
    float movingPrecentage = 0.0f;      // Percentage traveled (0.0 to 1.0)
    boolean movingKey = false;


    public void settings() {
        super.settings();

        size(1500, 1500, OPENGL);
        smooth();
    }

    public void setup(){

        galaxy = new GalaxyCoordinator(this,gTranslateX, gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,gNumberOfCircles,gInterval,gColorR,gColorG,gColorB,gTransparent,gStart);

        star1 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,255,0,0,86,0,0,0,0,0.02f);
        star2 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,0,255,38,0*gInterval+gStart,0,0.01f,0,0.02f);
        star3 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,0,255,255,18,1*gInterval+gStart,0,0.03f,0,0.03f);
        star4 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,40,255,45,28,2*gInterval+gStart,0,0.02f,0,0.02f);
        star5 = new Stars(this,gTranslateX,gTranslateY,gTranslateZ,gGradeX,gGradeY,gGradeZ,255,255,255,46,169,223,48,3*gInterval+gStart,0,0.015f,0,0.02f);

        for (int i = 0; i < backStars.length; i++) {
            backStars[i] = new backgroundStar(this,random(-1500,1500),random(-1500,1500),random(-1500,1500));
        }



    }

    public void draw(){

        background(0);

        stroke(255);
        lights();

//        println(mouseX+" : "+mouseY);

        translate(gTranslateX,gTranslateY,gTranslateZ);



        rotateX(radians(gGradeX));
        rotateY(radians(gGradeY));
        rotateZ(radians(gGradeZ));

        rotateZ(radians(dragValue));




        scale(scalar);

        stroke(255,0,0);
        line(0,0,0,500,0,0);
        stroke(0,255,0);
        line(0,0,0,0,500,0);
        stroke(0,0,255);
        line(0,0,0,0,0,500);



//        if (movingKey) {
//
//            movingDistX = -star2.getStarPositionX();
//            movingDistY = -star2.getStarPositionY();
//            movingPrecentage += movingStep;
//            if (movingPrecentage < 1.0) {
//                movingX = movingPrecentage * movingDistX;
//                movingY = movingPrecentage * movingDistY;
//            }
//            translate(movingX,movingY,0);
//
//        }


        focusStars(focusNumber,beforeNumber);



//        pushMatrix();

//        println(dist(mouseX,mouseY,star2.getStarPositionX(),star2.getStarPositionY()));
//        println(star2.getStarPositionX()+" : "+star2.getStarPositionY());
//        println(mouseX+" : "+mouseY);

//        stroke(255);
//        fill(255);
//        ellipse(star2.getStarPositionX(),star2.getStarPositionY(),120,120);
//        if (dist(mouseX,mouseY,star2.getStarPositionX(),star2.getStarPositionY()) < star2.size){
//            pushMatrix();
//            stroke(255);
//            fill(255);
//            rotateY(radians(90));
//            rotateX(radians(90));
//            ellipse(0,0,188,188);
//            popMatrix();
//        }

//        stroke(255);
//        line(0,0,500,0);
//        line(0,0,0,500);
//        stroke(255,0,0);
//        line(star2.starModelX,star2.starModelY,star2.starModelX+star2.size+20,star2.starModelY);
//        line(star2.starModelX,star2.starModelY,star2.starModelX,star2.starModelY+star2.size+20);
//        stroke(0,255,0);
//        line(star2.getStarPositionX(),star2.getStarPositionY(),star2.getStarPositionX()+star2.size+50,star2.getStarPositionY());
//        line(star2.getStarPositionX(),star2.getStarPositionY(),star2.getStarPositionX(),star2.getStarPositionY()+star2.size+50);


//        translate(gTranslateX,gTranslateY,gTranslateZ);
//        rotateX(radians(gGradeX));
//        rotateY(radians(gGradeY));
//        rotateZ(radians(gGradeZ));


//        focusStars(focusNumber);




//        rotateZ(radians(dragValue));

        galaxy.draw(false);

        star1.draw();
        star2.draw();
        star3.draw();
        star4.draw();
        star5.draw();

        for (int i = 0; i < backStars.length; i++) {
            backStars[i].draw();
        }

//        popMatrix();


//        println(star1.starModelX+" : "+star1.starModelY+" : "+star1.starModelZ);
//        println(star2.starModelX+" : "+star2.starModelY+" : "+star2.starModelZ);
//        println(mouseX+" : "+mouseY);



    }

    public void mouseClicked() {

        if (mouseButton == LEFT) {

            movingPrecentage = 0;
            beforeNumber = focusNumber;
            focusNumber++;

        } else if (mouseButton == RIGHT) {
            movingPrecentage = 0;
            beforeNumber = focusNumber;
            focusNumber --;
        }
        if (focusNumber > 5) {
            focusNumber = 1;
        } else if (focusNumber < 1) {
            focusNumber = 5;
        }
    }


    public void focusStars(int number,int befor) {
        switch (befor) {
            case 1:
                movingBeginX = -star1.getStarPositionX();
                movingBeginY = -star1.getStarPositionY();
                break;
            case 2:
                movingBeginX = -star2.getStarPositionX();
                movingBeginY = -star2.getStarPositionY();
                break;
            case 3:
                movingBeginX = -star3.getStarPositionX();
                movingBeginY = -star3.getStarPositionY();
                break;
            case 4:
                movingBeginX = -star4.getStarPositionX();
                movingBeginY = -star4.getStarPositionY();
                break;
            case 5:
                movingBeginX = -star5.getStarPositionX();
                movingBeginY = -star5.getStarPositionY();
                break;
            default:
                movingBeginX = -star1.getStarPositionX();
                movingBeginY = -star1.getStarPositionY();
                break;
        }
        switch (number) {
            case 1:
                movingEndX = -star1.getStarPositionX();
                movingEndY = -star1.getStarPositionY();
                break;
            case 2:
                movingEndX = -star2.getStarPositionX();
                movingEndY = -star2.getStarPositionY();
                break;
            case 3:
                movingEndX = -star3.getStarPositionX();
                movingEndY = -star3.getStarPositionY();
                break;
            case 4:
                movingEndX = -star4.getStarPositionX();
                movingEndY = -star4.getStarPositionY();
                break;
            case 5:
                movingEndX = -star5.getStarPositionX();
                movingEndY = -star5.getStarPositionY();
                break;
            default:
                movingEndX = -star1.getStarPositionX();
                movingEndY = -star1.getStarPositionY();
                break;
        }
        movingDistX = movingEndX - movingBeginX;
        movingDistY = movingEndY - movingBeginY;
        if (movingPrecentage < 1.0) {
            movingX = movingBeginX + movingPrecentage * movingDistX;
            movingY = movingBeginY + movingPrecentage * movingDistY;
            movingPrecentage += movingStep;
        } else {
            movingX = movingEndX;
            movingY = movingEndY;
        }
        translate(movingX,movingY,0);
    }



    public void mouseDragged() {
        if (mouseButton == LEFT){
            if (pmouseX > mouseX) {
                dragValue = dragValue - 3;
            } else if (pmouseX < mouseX){
                dragValue = dragValue + 3;
            }
        } else if (mouseButton == RIGHT) {
            if (pmouseX > mouseX) {
                gTranslateX = gTranslateX - 10;
            } else if (pmouseX < mouseX){
                gTranslateX = gTranslateX + 10;
            }
            if (pmouseY > mouseY) {
                gTranslateY = gTranslateY - 10;
            } else if (pmouseY < mouseY){
                gTranslateY = gTranslateY + 10;
            }

        }


    }

    public void mouseWheel(MouseEvent event) {
        float e = event.getCount();
//        println(e);
        if (e < 0) {
            scalar += 0.1;
        } else if (e > 0){
            if (scalar > 0.1) {
                scalar -= 0.1;
            }
        }
    }
}
