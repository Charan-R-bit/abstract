package abstraction;

public class Main {

	public static void main(String[] args) {
		Shape ss;
		
		ss = new Line();
		ss.draw();
		
		ss = new Rectangle();
		ss.draw();
		
		ss = new Cube();
		ss.draw();
	}

}
