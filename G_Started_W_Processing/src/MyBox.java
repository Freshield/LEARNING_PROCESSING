/**
 * Created by FRESHIELD on 2016/5/19.
 */
import processing.core.PApplet;

public class MyBox {
    PApplet parent;
    float boxSize;

    public MyBox(PApplet _parent, float _boxSize) {
        parent = _parent;
        boxSize = _boxSize;
    }

    public void render() {
        parent.box(boxSize);
    }
}