package test;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.staff.*;

public class SearchTest {
	AdmStaff junit = new AdmStaff();
	@Test
	public void searchTest_1() {
		junit.setFName("Hiếu");			
		junit.setDepartment("Tài chính");
		boolean result = junit.search("Hiếu","Tài chính");		
		assertEquals(true,result);
		
	}
	@Test
	public void searchTest_2() {
		junit.setFName("Hoàng");			
		junit.setDepartment("TÀI CHÍNH");
		boolean result = junit.search("Hoàng","Tài chính");		
		assertEquals(true,result);		
	}
	@Test
	public void searchTest_3() {
		junit.setFName("NAM");			
		junit.setDepartment("Tài Vụ");
		boolean result = junit.search("Nam","Tài vụ");		
		assertEquals(true,result);		
	}
	@Test
	public void searchTest_4() {
		junit.setFName("Minh");			
		junit.setDepartment("BẢo vỆ");
		boolean result = junit.search("MINH","Bảo vệ");		
		assertEquals(true,result);		
	}

	

}
