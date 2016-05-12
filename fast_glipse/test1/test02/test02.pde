
  int r = 0;
  int g = 102;
  int b = 153;
  int alpha = 204;
  int backgroundGray = 255;
  
  float x1 = 10.0;
  float y1 = 30.5;
  float x2 = 50;
  float y2 = 60.5;
  
void setup(){
  size(500,500);
  rectMode(CENTER);
  noStroke();
  
  
  fill(r,g,b,alpha);
}

void draw(){
  background(backgroundGray);
  rect(x1,y1,50,50);
  rect(x2,y2,50,50);
}  