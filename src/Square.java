
public class Square extends Shape {

	public int side;
	 @Override //Annotation
		public void calculateArea() {
			//Accessing Math's PI value
			double area = (Math.pow(side,  2));
			System.out.println("Area of a square is " + area);
		 }
		
		public void calculatePerimeter(){
			double perimeter = 4 * side;
			System.out.println("Perimeter of the square is: " + perimeter);
		
		}
		@Override 
		public void draw() {
			System.out.println("Draw Square");
		}
		
	
}
