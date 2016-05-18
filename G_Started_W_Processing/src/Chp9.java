import processing.core.PApplet;
import processing.core.PShape;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp9 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp9");
    }

    Train red,blue;
    JitterBug bug,jit;
    Robot bot1,bot2;

    public void settings(){
        super.settings();
        size(1400,1300);
        smooth();

    }

    public void setup(){

        red = new Train("Red Line",90);
        blue = new Train("Blue Line",120);
        bug = new JitterBug(width*0.66f,height/2,20);
        jit = new JitterBug(width*0.33f,height/2,50);
        bot1 = new Robot("robot1.svg",200,200);
        bot2 = new Robot("robot2.svg",400,400);

    }

    public void draw(){

//        jit.move();
//        jit.display();
//        bug.move();
//        bug.display();

        background(204);

        bot1.update();
        bot1.display();

        bot2.update();
        bot2.display();

    }

    public class Robot {

        float xpos;
        float ypos;
        float angle;
        PShape botShape;
        float yoffset = 0.0f;

        Robot (String svgName, float tempX, float tempY) {
            botShape = loadShape(svgName);
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

    public class Train {
        String name;
        int distance;
        Train (String tempName, int tempDistance) {
            name = tempName;
            distance = tempDistance;
        }
    }
}
