package processing.test.sketch_160517a;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_160517a extends PApplet {

public void setup(){
        
        
        strokeWeight(30);
    }
    
public void draw(){
  background(204);
        stroke(102);
        line(40,0,70,height);
        if (mousePressed == true) {
            stroke(0);
        }
        line(0,70,width,50);

    }
  public void settings() {  size(720,480);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "sketch_160517a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
