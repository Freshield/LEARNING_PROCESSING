void steup(){
  size(500,500);
  rectMode(CENTER);
  noStroke();
  fill(0,102,153,204);
}

void draw(){
  background(255);
  rect(width-mouseX,height-mouseY,50,50);
  rect(mouseX,mouseY,50,50);
}  