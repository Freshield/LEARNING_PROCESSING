void setup(){
  size(500,500);
  background(0);
}

void draw(){
  for(int i = 10;i < width;i = i+10){
    if(i%20 == 0){
      stroke(153);
      line(i,40,i,height/2);
    }else{
      stroke(102);
      line(i,20,i,180);
    }
  }
}