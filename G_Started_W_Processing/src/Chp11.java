import processing.core.PApplet;
import processing.opengl.*;
import 

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp11 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp11");
    }

    float x = 0;

    public void settings() {
        super.settings();
//        size(420, 220,OPENGL);
        size(720,600);
        smooth();


    }

    public void setup() {
//        noStroke();
//        fill(255);
        noFill();
        strokeCap(SQUARE);
        frameRate(30);
    }

    public void draw() {


//        background(0);
//        translate(width/2,height,0);
//        rotateX(mouseX / 200.0f);
//        rotateY(mouseY / 200.0f);
//        int dim = 18;
//        for (int i = -height/2; i < height/2; i += dim*1.2) {
//            for (int j = -height/2; j < height/2; j += dim*1.2) {
//                beginShape();
//                vertex(i,j,0);
//                vertex(i+dim,j,0);
//                vertex(i+dim,j+dim,-dim);
//                vertex(i,j+dim,-dim);
//                endShape();
//            }
//        }
//        println(mouseX+" "+mouseY);

//        lights();

//        ambientLight(102,102,102);
//        directionalLight(255,255,255,-1,0,0);
//        pointLight(255,255,255,mouseX,mouseY,50);
//        spotLight(255,255,255,mouseX,0,200,0,0,-1,PI,2);

//        rotateY(PI/24);
//        background(0);
//        translate(width/2,height/2);
//        int dim = 18;
//        for (int i = -height/2; i < height/2; i += dim*1.4) {
//            for (int j = -height/2; j < height/2; j += dim*1.4) {
//                pushMatrix();
//                translate(i,j,-j);
//                box(dim,dim,dim);
//                popMatrix();
//            }
//        }

//        lights();
//        background(0);
//        float camZ = (height/2.0f) / tan(PI * 60.0f / 360);
//        camera(mouseX,mouseY,camZ,width/2.0f,height/2.0f,0,0,1,0);
//        translate(width/2,height/2,-20);
//
//        int dim = 18;
//        for (int i = -height/2; i < height/2; i += dim*1.4) {
//            for (int j = -height/2; j < height/2; j += dim*1.4) {
//                pushMatrix();
//                translate(i,j,-j);
//                box(dim,dim,dim);
//                popMatrix();
//            }
//        }


        background(204);
        translate(x,0);
        for (int y = 40; y < 280; y += 20) {
            line(-260,y,0,y + 200);
            line(0, y + 200, 260, y);
        }
        if (frameCount < 60) {
            saveFrame("frame/SaveExample-####.png");
        } else {
            exit();
        }

        x += 2.5;

    }

}
