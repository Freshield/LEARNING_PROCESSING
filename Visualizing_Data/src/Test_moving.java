import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/25.
 */
public class Test_moving extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Test_moving");
    }
    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    float beginX = 20.0f;  // Initial x-coordinate
    float beginY = 10.0f;  // Initial y-coordinate
    float endX = 570.0f;   // Final x-coordinate
    float endY = 320.0f;   // Final y-coordinate
    float distX;          // X-axis distance to move
    float distY;          // Y-axis distance to move
    float x = 0.0f;        // Current x-coordinate
    float y = 0.0f;        // Current y-coordinate
    float step = 0.01f;    // Size of each step along the path
    float pct = 0.0f;      // Percentage traveled (0.0 to 1.0)

    public void setup() {

        noStroke();
        distX = endX - beginX;
        distY = endY - beginY;
    }

    public void draw() {
        fill(0, 2);
        rect(0, 0, width, height);
        pct += step;
        if (pct < 1.0) {
            x = beginX + (pct * distX);
            y = beginY + (pct * distY);
        }
        fill(255);
        ellipse(x, y, 20, 20);
    }

    public void mousePressed() {
        pct = 0.0f;
        beginX = x;
        beginY = y;
        endX = mouseX;
        endY = mouseY;
        distX = endX - beginX;
        distY = endY - beginY;
    }

}
