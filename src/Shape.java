//keyword add abstract
public abstract class Shape {
	
	protected String name;
	
	Shape(String name){
		this.name=name;
	}
	
	public void sayHello() {
		System.out.println("Hello everyone!");
	}

	public abstract void calculateArea(); 
	
	public abstract void draw();
	
}
