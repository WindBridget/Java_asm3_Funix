package test;
import static org.junit.Assert.*;
import org.junit.Test;

import edu.staff.StaffManagement;
import util.FileUtil;

public class WriteFileTest {

	@Test
	public void writeFileTest_1() {
		
		String file = "lecturer.ser";
		boolean thrown = false;
			try {
				FileUtil.writeFile(StaffManagement.myLecturer,file);
			} 
			catch (IndexOutOfBoundsException e) {
				thrown = true;
			}
		assertFalse(thrown);
		
	}
	

}
