/**
 * Created by FRESHIELD on 2016/5/24.
 */

import processing.core.PApplet;


public class Test_matrix extends PApplet {

    public static void main(String[] args) {

        PApplet.main("Test_matrix");
    }

    int value = 0;
    public void settings(){
        super.settings();
        size(1000, 1000, P3D);

    }

    public void setup(){

    }

    public void draw(){

        printMatrix();
    }

}
