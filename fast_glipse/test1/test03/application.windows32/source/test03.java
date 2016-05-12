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

public class test03 extends PApplet {

int a = 20;

public void setup(){
  
  background(51);
  stroke(255);
  noLoop();
}

public void draw(){
  line(a,0,a,height);
  
  for(int a = 50; a < 80; a += 2){
    line(a,0,a,height);
  }
  
  int a = 100;
  line(a,0,a,height);
  
  drawAnotherLine();
  
  drawYetAnotherLine();
}

public void drawAnotherLine(){
  int a = 185;
  line(a,0,a,height);
}

public void drawYetAnotherLine(){
  line(a+2,0,a+2,height);
}
  public void settings() {  size (500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "test03" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
