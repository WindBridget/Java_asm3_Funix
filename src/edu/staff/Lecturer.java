package edu.staff;

public class Lecturer extends Staff implements Comparable<Lecturer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String faculty; // khoa
	private String qual; // trình độ
	private int periods; // số tiết dạy
	
	public String getFaculty(){
		return faculty;
	}
	public String getQual(){
		return qual;
	}
	public int getPeriods(){
		return periods;
	}
	public void setFaculty(String newFaculty){
		faculty = newFaculty;
	}
	public void setQual(String newQual){
		qual = newQual;
	}
	public void setPeriods(int newPeriods){
		periods = newPeriods;
	}
	public float getSalary(){
		return ((float)getCoefficient()*730+getAllowance()+getPeriods()*45);
	}
	public void updateAllowance(){
		
		if(getQual() == "Cử nhân"){
			this.setAllowance(300);
		}
		else if(getQual() == "Thạc sỹ"){
			this.setAllowance(500);
		}
		else if(getQual() == "Tiến sỹ"){
			this.setAllowance(1000);
		}
	}
	/*Sắp xếp . xin chú thích một chút !	  
	 Sắp xếp theo thứ tự xét : tên > họ > đệm .
	 Nếu trùng cả Họ Đệm Tên thì mới compare lương !*/	 
	public int compareTo(Lecturer o){
		
		if (this.getFName().toLowerCase().compareTo(o.getFName().toLowerCase()) != 0){
			return this.getFName().toLowerCase().compareTo(o.getFName().toLowerCase());
		}		
		else if (this.getLName().toLowerCase().compareTo(o.getLName().toLowerCase()) != 0){
			return this.getLName().toLowerCase().compareTo(o.getLName().toLowerCase());
		}
		else if (this.getMName().toLowerCase().compareTo(o.getMName().toLowerCase()) != 0){
			return this.getMName().toLowerCase().compareTo(o.getMName().toLowerCase());
		}
		else{
			return (this.getSalary() > o.getSalary()) ? -1 : 1;
		}						
	}
}
