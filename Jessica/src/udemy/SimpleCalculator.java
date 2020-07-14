package udemy;

public class SimpleCalculator {

	
	private double firstNumber;
	private double secondNumber;
	
	public SimpleCalculator(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public static void main(String[] args) {
		
		SimpleCalculator calcolatrice = new SimpleCalculator(12, 25);
		
		System.out.println("La tua somma è:" + calcolatrice.getAdditionResult());
		System.out.println("La tua sottrazione è:" +calcolatrice.getSubtractionResult());
		System.out.println("La tua moltiplicazione è:" +calcolatrice.getMultiplicationResult());
		System.out.println("La tua divisione è:" +calcolatrice.getDivisionResult());

	}
	
	public double getAdditionResult(){
		
		
		return firstNumber + secondNumber; 
		
	}
	
	public double getSubtractionResult(){
		
		return firstNumber - secondNumber; 
	}
	
	public double getMultiplicationResult(){
	
		return firstNumber * secondNumber; 
	}

	public double getDivisionResult(){
		
		if (secondNumber == 0) {
			
			return 0;
		}
	
		return firstNumber / secondNumber; 
	}
	
	


	
	
	

}
