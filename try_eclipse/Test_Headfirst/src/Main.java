import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args){
		PApplet.main("Main");
	}
	
	public void settings(){
		super.settings();
		size(800, 600);
	}
	
	public void setup(){
		noStroke();
		background(255);
		fill(0,102,154,204);
		smooth();
		noLoop();
	}
	
	public void draw(){
		circles(40,80);
		circles(90,70);
	}
	
	public void circles(int x,int y){
		ellipse(x,y,50,50);
		ellipse(x+20, y+20, 60, 60);
	}

}
