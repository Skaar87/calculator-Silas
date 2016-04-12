
public class calculator {
	
	public double add(double x, double y){
		  
		return x + y;
	}
	public double sub(double x, double y){
		 
		return x - y;
	}
	public double multi(double x, double y){
		
		return  x * y; 
	}
	public double div(double x, double y){
		if(y == 0){
		System.out.println("cannot divide by 0");
		}
		else{
		return x / y;
		}
		return 0;
	}
}
