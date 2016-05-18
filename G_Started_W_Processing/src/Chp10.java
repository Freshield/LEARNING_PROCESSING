import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/18.
 */
public class Chp10 extends PApplet {


    public static void main(String[] args) {

        PApplet.main("Chp10");
    }

    float x1 = -20;
    float x2 = 20;
    float[] x = new float[3000];


    public void settings() {
        super.settings();
        size(1400, 1300);
        smooth();

    }

    public void setup() {
        noStroke();
        fill(255,200);
        for (int i = 0;i < x.length; i++) {
            x[i] = random(-300,500);
        }
    }

    public void draw() {

        background(0);
        for (int i = 0;i < x.length; i++) {
            x[i] += 0.5;
            float y = i * 0.4f;
            arc(x[i],y,12,12,0.52f,5.76f);
        }

    }

}

