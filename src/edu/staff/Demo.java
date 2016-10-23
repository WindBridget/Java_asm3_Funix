package edu.staff;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\t\t\tStaff Management!\n------------------------------------------------------------------------------\n");
			boolean exit = false;
			while(!exit){				
				System.out.println("\t\t\t***\n\t1.Create new Staff list(nhập dữ liệu cán bộ).\n\t2.Search Administrative Staff(tìm kiếm nhân viên).\n\t3.Sort Lecturer(danh sách giảng viên).\n\t0.Exit\n" );
				System.out.print("\tInput 1 or 2 or 3 : ");
				String choose = sc.nextLine();
				if(choose.equals("0")){       		
	        		exit = true;
	        		sc.close();
				}
				else if(choose.equals("1")){					
					StaffManagement.create();
				}
				else if(choose.equals("2")){							
					StaffManagement.searchAdm();
				}
				else if(choose.equals("3")){	
					StaffManagement.printLecturer ();
					
				}
				else{		                	
	            	System.out.println("\n\t\t\tPlease choose 1 or 2 or 3!\n");
				}				
			}
			System.out.println("\t\t\t-------------------***------------------\n\t\t\tGood bye! See you next time!");
		}
		catch (Exception e) {
			System.out.println("\t\t\tError !!! Try again !\n");
		}
	}
}
