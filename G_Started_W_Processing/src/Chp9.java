import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp9 extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Chp9");
    }

    Train red,blue;
    JitterBug bug,jit;

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

    }

    public void draw(){

        jit.move();
        jit.display();
        bug.move();
        bug.display();

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
