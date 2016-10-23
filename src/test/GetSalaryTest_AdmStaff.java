package test;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.staff.*;

public class GetSalaryTest_AdmStaff {
	AdmStaff junit = new AdmStaff();
	@Test
	public void getSalaryTest_1() {
		
		junit.setWorkdays(1);
		junit.setCoefficient(1);
		junit.setAllowance(2000);				
		float result = junit.getSalary();
		assertEquals((float)2760.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_2() {
		
		junit.setWorkdays(10);
		junit.setCoefficient(1.5);
		junit.setAllowance(500);				
		float result = junit.getSalary();
		assertEquals((float)1895.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_3() {
		
		junit.setWorkdays(2);
		junit.setCoefficient(2);
		junit.setAllowance(1000);				
		float result = junit.getSalary();
		assertEquals((float)2520.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_4() {
		
		junit.setWorkdays(30);
		junit.setCoefficient(2.8);
		junit.setAllowance(2000);				
		float result = junit.getSalary();
		assertEquals((float)4944.0 ,result, 0.0 );		
	}

	

}
