package edu.staff;
import java.util.*;
import util.*;
public class StaffManagement {
	/**
	 * @param args
	 */
	public static ArrayList<Lecturer> myLecturer = new ArrayList<Lecturer>();
	public static ArrayList<Lecturer> myLecturer2 = new ArrayList<Lecturer>();
	public static ArrayList<AdmStaff> myAdmStaff = new ArrayList<AdmStaff>();
	private static Scanner sc = new Scanner(System.in);
		
	// selection 1 then 1
	private static Lecturer createLecturer(){
		Lecturer lecturer = new Lecturer();									
		System.out.println("\t\t\t***\nPlease input lecturer information !");
		System.out.print("First Name(tên) : ");
		lecturer.setFName(sc.nextLine());
		System.out.print("Last Name(họ) : ");
		lecturer.setLName(sc.nextLine());
		System.out.print("Middle Name(đệm) : ");
		lecturer.setMName(sc.nextLine());
		System.out.print("Faculty(khoa) : ");
		lecturer.setFaculty(sc.nextLine());
		boolean exit_pe = false;
		while(!exit_pe){																				
			System.out.print("Periods(số tiết dạy) : ");
			String pe = sc.nextLine();
			if (NumberUtil.isInteger(pe) && Integer.parseInt(pe)>0){
				lecturer.setPeriods(Integer.parseInt(pe));
				exit_pe = true;
			}
			else{
				System.out.println("\t\t\tTry again (input number>0) please !!!\n");	
			}
		}
		boolean exit_co = false;
		while(!exit_co){								
			System.out.print("Salary Coefficient(hệ số lương) : ");
			String co = sc.nextLine();
			if(NumberUtil.isFloat(co) && Float.parseFloat(co)>0){
				lecturer.setCoefficient(Float.parseFloat(co));
				exit_co = true;
			}
			else{
				System.out.println("\t\t\tTry again (input coefficient>0) please !!!\n");
			}				
		}				
		System.out.println("Qualification(trình độ) : ");
		boolean exit_qual = false;
		while(!exit_qual){					
			System.out.println("Select your qualification !");
			System.out.println("1.Tiến sỹ\t2.Thạc sỹ\t3.Cử nhân");
			System.out.print("Input : ");					
			String choose = sc.nextLine();						
			if(choose.equals("1")){
				lecturer.setQual("Tiến sỹ");
				exit_qual = true;
			}
			else if(choose.equals("2")){
				lecturer.setQual("Thạc sỹ");
				exit_qual = true;
			}
			else if(choose.equals("3")){
				lecturer.setQual("Cử nhân");
				exit_qual = true;
			}
			else{		                	
            	System.out.println("\t\t\tPlease choose 1 or 2 or 3!\n");
			}				
		}
		lecturer.updateAllowance();	
		
		System.out.println("\t\t\t***\n\t\t\tInput successfully !\n");		
		return lecturer;		
	}
	
	// selection 1 then 2
	private static AdmStaff createAdmStaff(){		
		AdmStaff admStaff = new AdmStaff();	 		
		System.out.println("\t\t\t***\nPlease input administrative staff information !");
		System.out.print("First Name(tên) : ");
		admStaff.setFName(sc.nextLine());
		System.out.print("Last Name(họ) : ");
		admStaff.setLName(sc.nextLine());
		System.out.print("Middle Name(đệm) : ");
		admStaff.setMName(sc.nextLine());
		System.out.print("Department(phòng ban) : ");
		admStaff.setDepartment(sc.nextLine());
		boolean exit_wd = false;
		while(!exit_wd){				
			System.out.print("Workdays(ngày công) : ");
			String wd = sc.nextLine();
			if(NumberUtil.isInteger(wd) && Integer.parseInt(wd)>0){
				admStaff.setWorkdays(Integer.parseInt(wd));
				exit_wd = true;
			}
			else{
				System.out.println("\t\t\tTry again (input number>0) please !!!\n");
			}				
		}
		boolean exit_co = false;
		while(!exit_co){								
			System.out.print("Salary Coefficient(hệ số lương) : ");
			String co = sc.nextLine();
			if(NumberUtil.isFloat(co) && Float.parseFloat(co)>0){
				admStaff.setCoefficient(Float.parseFloat(co));
				exit_co = true;
			}
			else{
				System.out.println("\t\t\tTry again (input coefficient>0) please !!!\n");
			}				
		}		
		System.out.println("Duty(chức vụ) : ");
		boolean exit_duty = false;
		while(!exit_duty){				
			System.out.println("Select your duty !");
			System.out.println("1.Trưởng phòng\t2.Phó phòng\t3.Nhân viên");
			System.out.print("Input : ");
			String choose = sc.nextLine();
			
			if(choose.equals("1")){	
				admStaff.setDuty("Trưởng phòng");
				exit_duty=true;
			}
			else if(choose.equals("2")){	
				admStaff.setDuty("Phó phòng");
				exit_duty=true;
			}
			else if(choose.equals("3")){
				admStaff.setDuty("Nhân viên");
				exit_duty=true;
			}
			else{		                	
            	System.out.println("\t\t\tPlease choose 1 or 2 or 3!");
			}								
		}
		admStaff.updateAllowance();		
		System.out.println("\t\t\t***\n\t\t\tInput successfully !\n");
		return admStaff;		
	}
	
	// selection 1
	public static void create(){
		boolean exit_1 = false;
		while(!exit_1){							
			System.out.println("\t\t\t***\n\t1.Create Lecture(nhập dữ liệu giảng viên).\n\t2.Create Administrative Staff(nhập dữ liệu nhân viên).\n" );
			System.out.print("\tInput 1 or 2 : ");								
			String choose_1 = sc.nextLine();													
			if(choose_1.equals("1")){				
				myLecturer.add(createLecturer());
				FileUtil.writeFile(myLecturer,"lecturer.ser");
				exit_1 = true;
			}
			else if(choose_1.equals("2")){							
				AdmStaff adm = createAdmStaff();
				myAdmStaff.add(adm);
				exit_1 = true;
			}
			else{		                	
                System.out.println("\n\t\t\tPlease choose 1 or 2 !");
			}								
		}
	}
	
	// selection 2
	public static void searchAdm(){
		boolean check;
		int count = 0;								
		System.out.println("\t\t\t***\n\tSearch by name and department.\n" );																				
		System.out.print("Input name(tên) : ");								
		String name = sc.nextLine();
		System.out.print("Input department(phòng ban) : ");								
		String dep = sc.nextLine();
		System.out.println("\t\t\t***\n");
		System.out.printf("%-20s%-12s%-18s%-13s%-13s%-13s%-13s\n","Họ Tên","Phòng ban","Chức vụ","Ngày công","Hệ số lương","Phụ cấp","Lương");
		System.out.printf("%-20s%-12s%-18s%-13s%-13s%-13s%-13s\n","Name","Department","Duty","Workdays","Salary Coe","Allowance","Salary");
		System.out.println("-----------------------------------------------------------------------------------------------");
		for(AdmStaff adm : myAdmStaff ){
			check = adm.search(name,dep);
			if (check == true){				
				System.out.printf("%-20s%-12s%-18s%-13d%-13.1f%-13d%-13.1f\n",adm.getName(),adm.getDepartment(),adm.getDuty(),adm.getWorkdays(),adm.getCoefficient(),adm.getAllowance(),adm.getSalary());
				count ++;																			
			}
		}										
		if (count == 0){
			System.out.print("\t\t\tThis staff wasn't found in AdmStaff list !\n");	
		}
		System.out.println("-----------------------------------------------------------------------------------------------");																				
	}
	
	// selection 3
	public static void printLecturer(){
		FileUtil.readFile(myLecturer2,"lecturer.ser");
		Collections.sort(myLecturer2); //Sắp xếp
		System.out.println("\t\t\t***\n");
		System.out.printf("%-20s%-12s%-18s%-13s%-13s%-13s%-13s\n","Họ Tên","Khoa","Trình độ","Số tiết","Hệ số lương","Phụ cấp","Lương");
		System.out.printf("%-20s%-12s%-18s%-13s%-13s%-13s%-13s\n","Name","Faculty","Qualification","Periods","Salary Coe","Allowance","Salary");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		for (Lecturer lec : myLecturer2){
			System.out.printf("%-20s%-12s%-18s%-13d%-13.1f%-13d%-13.1f\n",lec.getName(),lec.getFaculty(),lec.getQual(),lec.getPeriods(),lec.getCoefficient(),lec.getAllowance(),lec.getSalary());
		}
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}	
}
