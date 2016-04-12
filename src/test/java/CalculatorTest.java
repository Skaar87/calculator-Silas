import static org.junit.Assert.*;
import org.junit.*;


public class CalculatorTest {
	
	calculator Calculator = new calculator();

	  
	   
	 //addition
	   @Test
	   public void Add1() {
	    assertEquals("Unexepected error during addition", 10.0, Calculator.add(5.0,5.0),0.0d);
	   }
	   
	   @Test
	   public void Add2() {
	    assertEquals("Unexepected error during addition", 2.0, Calculator.add(-3.0,5.0),0.0d);
	   }
	   
	  
	   @Test
	   public void Add3() {
	    assertEquals("Unexepected error during addition", -8, Calculator.add(-3.0,-5.0),0.0d);
	   }
	   
	 //subtraction
	   @Test
	   public void sub1() {
	    assertEquals("Unexepected error during subtraction", 2.0, Calculator.sub(10.0,8.0),0.0d);
	   }
	   
	   @Test
	   public void sub2() {
	    assertEquals("Unexepected error during subtraction", -1.0, Calculator.sub(-2.0,-1.0),0.0d);
	   }
	   
	   @Test
	   public void sub3() {
	    assertEquals("Unexepected error during subtraction", 2.0, Calculator.sub(-3.0,-5.0),0.0d);
	   }
	    
	   
	 //multiplication
	   
	   @Test
	   public void multi1() {
	    assertEquals("Unexepected error during multiplication", 6.0, Calculator.multi(3.0,2.0),0.0d);
	   }
	   
	   @Test
	   public void multi2() {
	    assertEquals("Unexepected error during multiplication", 10.0, Calculator.multi(-2.0,-5.0),0.0d);
	   }
	   
	   @Test
	   public void multi3() {
	    assertEquals("Unexepected error during multiplication", 0, Calculator.multi(-5.0,0.0),0.0d);
	   }
	   
	   
	 //division  
	   @Test
	   public void div1() {
	    assertEquals("Unexepected error during division", 5.0, Calculator.div(10.0,2.0),0.0d);
	   }
	  
	   @Test
	   public void div2() {
	    assertEquals("Unexepected error during division", 10.0, Calculator.div(-10.0,-1.0),0.0d);
	   }
	   @Test
	   public void divividebyzero() {
	    assertEquals("Unexepected error during division", 0, Calculator.div(-20.0,0.0),0.0d);
	   }
	   
	   
	   }