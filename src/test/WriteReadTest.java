package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import edu.staff.*;
import util.FileUtil;

public class WriteReadTest {
	private static ArrayList<Lecturer> junitLecturer = new ArrayList<Lecturer>();
	Lecturer junit = new Lecturer();
	@Test
	public void writeFileTest_1() {
		junit.setFName("1");
		junit.setLName("1");
		junit.setMName("1");
		junit.setFaculty("1");
		junit.setPeriods(1);
		junit.setCoefficient(1);
		junit.setQual("Tiến sỹ");
		junit.updateAllowance();
		junitLecturer.add(junit);
		StaffManagement.myLecturer.add(junit);
		String file = "lecturer.ser";
		FileUtil.writeFile(StaffManagement.myLecturer,file);
		FileUtil.readFile(StaffManagement.myLecturer,file);
		
		assertEquals(StaffManagement.myLecturer,junitLecturer);
		
	}
	@Test
	public void writeFileTest_2() {
		junit.setFName("Hiếu");
		junit.setLName("Nguyễn");
		junit.setMName("Văn");
		junit.setFaculty("Toán");
		junit.setPeriods(15);
		junit.setCoefficient(1.9);
		junit.setQual("Cử nhân");
		junit.updateAllowance();
		junitLecturer.add(junit);
		StaffManagement.myLecturer.add(junit);
		String file = "lecturer.ser";
		FileUtil.writeFile(StaffManagement.myLecturer,file);
		FileUtil.readFile(StaffManagement.myLecturer,file);
		
		assertEquals(StaffManagement.myLecturer,junitLecturer);
		
	}
	@Test
	public void writeFileTest_3() {
		junit.setFName("Hưng");
		junit.setLName("Hoàng");
		junit.setMName("Việt");
		junit.setFaculty("Kinh tế");
		junit.setPeriods(25);
		junit.setCoefficient(1.5);
		junit.setQual("Tiến sỹ");
		junit.updateAllowance();
		junitLecturer.add(junit);
		StaffManagement.myLecturer.add(junit);
		String file = "lecturer.ser";
		FileUtil.writeFile(StaffManagement.myLecturer,file);
		FileUtil.readFile(StaffManagement.myLecturer,file);
		
		assertEquals(StaffManagement.myLecturer,junitLecturer);
	}
	@Test
	public void writeFileTest_4() {
		
		junit.setFName("Tuấn");
		junit.setLName("Phạm");
		junit.setMName("Anh");
		junit.setFaculty("Tin");
		junit.setPeriods(18);
		junit.setCoefficient(1.4);
		junit.setQual("Thạc sỹ");
		junit.setAllowance(500);
		junitLecturer.add(junit);
		StaffManagement.myLecturer.add(junit);
		String file = "lecturer.ser";
		FileUtil.writeFile(StaffManagement.myLecturer,file);
		FileUtil.readFile(StaffManagement.myLecturer,file);	
		
		assertEquals(StaffManagement.myLecturer,junitLecturer);		
	}

		
	
}
