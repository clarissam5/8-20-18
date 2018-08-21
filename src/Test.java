
public class Test {

	public static void main(String args[]) {
		Shape s = new Shape();
		Circle c = new Circle();
		Square sq = new Square();
		Triangle t = new Triangle();
		
		sq.side = 4;
		t.base = 6;
		t.height = 4;
		c.radius = 8; 
		System.out.println(c.radius);
		s.calculateArea();
		c.calculateArea();
		c.calculateCircumference();
		sq.calculateArea();
		sq.calculatePerimeter();
		t.calculateArea();
		t.calculatePerimeter();
		
		
	}
	
}
