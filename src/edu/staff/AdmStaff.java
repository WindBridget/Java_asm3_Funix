package edu.staff;

public class AdmStaff extends Staff{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String department; // phòng ban
	private int workdays; // số ngày công
	private String duty; // chức vụ
	
	public String getDepartment(){
		return department;
	}
	public int getWorkdays(){
		return workdays;
	}
	public String getDuty(){
		return duty;
	}
	public void setDepartment(String newDepartment){
		department = newDepartment;
	}
	public void setWorkdays(int newWorkdays){
		workdays = newWorkdays;
	}
	public void setDuty(String newDuty){
		duty = newDuty;
	}
	public float getSalary(){		
		return ((float)getCoefficient()*730+getAllowance()+getWorkdays()*30);
	}
	public void updateAllowance(){		 
		if(duty == "Trưởng phòng"){
			this.setAllowance(2000);
		}
		else if(duty == "Phó phòng"){
			this.setAllowance(1000);
		}
		else if(duty == "Nhân viên"){
			this.setAllowance(500);
		}
	}
	//search . Nhập Tên + Phòng ban để tìm thông tin.
	public boolean search(String na , String de){		
		if(na.toLowerCase().equals(this.getFName().toLowerCase()) && de.toLowerCase().equals(getDepartment().toLowerCase())){				
			
			return true;
		}
		return false;
	}
	
/*	public boolean searchDepartment(String de){
		if(de.toLowerCase().equals(getDepartment().toLowerCase())){	
			System.out.printf("%-20s%-12s%-18s%-13d%-13.1f%-13d%-13.1f\n",this.getName(),getDepartment(),getDuty(),getWorkdays(),this.getCoefficient(),this.getAllowance(),getSalary());
			return true;
		}
		return false;
	}*/
}
