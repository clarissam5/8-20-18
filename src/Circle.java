
public class Circle extends Shape {

	public int radius; 
	
	Circle(String name, int radius) {
		super(name);
		this.radius=radius; 
	}
	
	 @Override //Annotation
	public void calculateArea() {
		//Accessing Math's PI value
		double area = Math.PI * (Math.pow(radius,  2));
		System.out.println("Area of a circle is " + area);
	 }
	
	public void calculateCircumference(){
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circumference of the circle is: " + circumference);
	
	}
	@Override 
	public void draw() {
		System.out.println("Draw Circle");
	}
	@Override 
	public void sayHello() {
		System.out.println("Ola!");
	}
}
