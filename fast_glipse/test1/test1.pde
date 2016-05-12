void steup(){
  size(800,800);
  rectMode(CENTER);
  noStroke();
  
  int r = 0;
  int g = 102;
  int b = 153;
  int alpha = 104;
  fill(r,g,b,alpha);
  
}

void draw(){
  background(255);
  rect(width-mouseX,height-mouseY,50,50);
  rect(mouseX,mouseY,50,50);
}