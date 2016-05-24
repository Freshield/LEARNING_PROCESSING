import processing.core.PApplet;

/**
 * Created by FRESHIELD on 2016/5/24.
 */
public class backgroundStar {

    float positionX,positionY,positionZ;
    PApplet parent;

    public backgroundStar(PApplet _parent, float x, float y, float z) {
        positionX = x;
        positionY = y;
        positionZ = z;
        parent = _parent;

    }

    public void draw() {
        parent.pushMatrix();
        parent.translate(positionX,positionY,positionZ);

        parent.sphere(2);
        parent.popMatrix();
    }
}
