package test;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.staff.*;

public class GetSalaryTest_Lecturer {
	Lecturer junit = new Lecturer();
	@Test
	public void getSalaryTest_1() {
		
		junit.setPeriods(1);
		junit.setCoefficient(1);
		junit.setAllowance(1000);				
		float result = junit.getSalary();
		assertEquals((float)1775.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_2() {
		
		junit.setPeriods(10);
		junit.setCoefficient(1.5);
		junit.setAllowance(300);				
		float result = junit.getSalary();
		assertEquals((float)1845.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_3() {
		
		junit.setPeriods(2);
		junit.setCoefficient(2);
		junit.setAllowance(500);				
		float result = junit.getSalary();
		assertEquals((float)2050.0 ,result, 0.0 );		
	}
	@Test
	public void getSalaryTest_4() {
		
		junit.setPeriods(50);
		junit.setCoefficient(2.8);
		junit.setAllowance(1000);				
		float result = junit.getSalary();
		assertEquals((float)5294.0 ,result, 0.0 );		
	}

	

}
