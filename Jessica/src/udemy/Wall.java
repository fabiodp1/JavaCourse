package udemy;

public class Wall {

	private double width;
	private double height;
	
	
	
	public Wall() {
		super();
	}



	public Wall(double width, double height) {
		super();
		
		this.setWidth(width);
		this.setHeight(height);
		
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
		
		if(this.width < 0) {
			
			this.width = 0 ;
		}
				
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
		
		if(this.height < 0) {
			
			this.height = 0;
		}
	}



	public static void main(String[] args) {
		
		Wall area = new Wall(130.50, 60);
		
		System.out.println(area.getArea());
		
		
	}
	
	public double getArea() {
		
		return (width * height);
	}

}
