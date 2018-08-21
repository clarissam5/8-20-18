
public class Triangle extends Shape{

	public int base;
	public int height;
	public int side1;
	public int side2;
	 @Override //Annotation
		public void calculateArea() {
			//Accessing Math's PI value
			double area = (1/2) * base * height;
			System.out.println("Area of a triangle is " + area);
		 }
		
		public void calculatePerimeter(){
			double perimeter = side1 + side2 + base;
			System.out.println("Perimeter of the triangle is: " + perimeter);
		
		}
		@Override 
		public void draw() {
			System.out.println("Draw Triangle");
		}
		
	
}

