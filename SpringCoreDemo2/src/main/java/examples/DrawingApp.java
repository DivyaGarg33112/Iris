package examples;

public class DrawingApp {

	Shape sh;
	
	DrawingApp(Shape sh){
		this.sh=sh;
	}
	
	//want to call the draw of Circle class
	public void letsDraw(){
		sh.draw();
	}
}
