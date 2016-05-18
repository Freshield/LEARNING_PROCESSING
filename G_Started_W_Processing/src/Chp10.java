import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp10 extends PApplet {


    public static void main(String[] args) {

        PApplet.main("Chp10");
    }

//    float x1 = -20;
//    float x2 = 20;
//    float[] x = new float[3000];
//    float[] x = {-20, 20};
//    float[] gray;

//    int num = 60;
//    int x[] = new int[num];
//    int y[] = new int[num];

//    JitterBug[] bugs = new JitterBug[50];

    int numFrames = 12;
    PImage[] images = new PImage[numFrames];
    int currentFrame = 1;

    Robot[] bots;


    public void settings() {
        super.settings();
        size(1400, 1300);
        smooth();

    }

    public void setup() {
//        noStroke();
//        fill(255,200);
//        for (int i = 0;i < x.length; i++) {
//            x[i] = random(-300,500);
//        }

//        x = new int[2];
//        x[0] = 12;
//        x[1] = 2;

//        noStroke();
//        println(x.length);
//        int[] y = new int[1972];
//        println(y.length);

//        gray = new float[width];
//        for (int i = 0; i < gray.length; i++) {
//            gray[i] = ((int)random(0,2))*255;
//        }

//        noStroke();

//        for (int i = 0; i < bugs.length; i++) {
//            float x = random(width);
//            float y = random(height);
//            int r = i + 2;
//            bugs[i] = new JitterBug(x,y,r);
//        }

//        for (int i = 0; i < images.length; i ++) {
//            String imageName = "frame-" + nf(i,4) + ".png";
//            images[i] = loadImage(imageName);
//        }
//        frameRate(24);

        PShape robotShape = loadShape("robot1.svg");
        bots = new Robot[20];

        for (int i = 0; i < bots.length; i++) {
            float x = random(-40, width-40);
            float y = map(i,0,bots.length,-100,height-200);
            bots[i] = new Robot(robotShape,x,y);
        }
    }

    public void draw() {

//        background(0);
//        for (int i = 0;i < x.length; i++) {
//            x[i] += 0.5;
//            float y = i * 0.4f;
//            arc(x[i],y,12,12,0.52f,5.76f);
//        }

//        background(0);
//        x[0] += 0.5;
//        x[1] += 0.5;
//        arc(x[0],30,40,40,0.52f,5.76f);
//        arc(x[1],30,40,40,0.52f,5.76f);

//        for (int i = 0; i < gray.length; i++) {
//            stroke(gray[i]);
//            line(i,0,i,height);
//        }

//        background(0);
//        for (int i = x.length-1; i > 0; i--) {
//            x[i] = x[i - 1];
//            y[i] = y[i - 1];
//        }
//        x[0] = mouseX;
//        y[0] = mouseY;
//        for (int i = 0; i < x.length; i++) {
//            fill(i * 4);
//            ellipse(x[i],y[i],40,40);
//        }

//        for (int i = 0; i < bugs.length; i++) {
//            bugs[i].move();
//            bugs[i].display();
//        }
//        println(currentFrame);
//        image(images[currentFrame],0,0);
//        currentFrame++;
//        if (currentFrame >= images.length) {
//            currentFrame = 0;
//        }

        background(204);

        for (int i = 0; i < bots.length; i++) {
            bots[i].update();
            bots[i].display();
        }


    }

    public class JitterBug {
        float x;
        float y;
        int diameter;
        float speed = 2.5f;

        JitterBug(float tempX, float tempY,int tempDiameter) {
            x = tempX;
            y = tempY;
            diameter = tempDiameter;
        }

        void move(){
            x += random(-speed,speed);
            y += random(-speed,speed);
        }

        void display(){
            ellipse(x,y,diameter,diameter);
        }
    }


    public class Robot {

        float xpos;
        float ypos;
        float angle;
        PShape botShape;
        float yoffset = 0.0f;

        Robot (PShape shape, float tempX, float tempY) {
            botShape = shape;
            xpos = tempX;
            ypos = tempY;
            angle = random(0,TWO_PI);
        }

        void update() {
            angle += 0.05f;
            yoffset = sin(angle) * 20;
        }

        void display() {
            shape(botShape,xpos,ypos+yoffset);
        }

    }


}

