float boxRotation = 0;

void setup(){
  size(720,1080);
  
  smooth();
  noStroke();
  fill(255);
  stroke(255);
  rectMode(CENTER);
}

void draw(){
  background(mouseY * (255.0/1080),100,0);
  boxRotation += (float)(pmouseX-mouseX)/100;
  line(width/2,height/2,mouseX,mouseY);
  ellipse(mouseX,mouseY,40,40);
  
  pushMatrix();
    translate(width/2,height/2);
    rotate(boxRotation);
    rect(0,0,150,150);
  popMatrix();
  
  rect(width/2,height/2,150,150);
}