public void settings(){
        super.settings();
        size(800,800);
    }

    public void setup(){
        smooth();
    }

    public void draw(){
        if (mousePressed){
            fill(0);
        } else {
            fill(255);
        }
        ellipse(mouseX,mouseY,80,80);

    }