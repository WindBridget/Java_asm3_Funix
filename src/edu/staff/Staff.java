package edu.staff;

import java.io.Serializable;

abstract public class Staff implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname; // tên
	private String mname; // đệm
	private String lname; // họ
	private int allowance;// phụ cấp
	private double coefficient; // hệ số lương
	public String getFName(){
		return fname;
	}
	public String getMName(){
		return mname;
	}
	public String getLName(){
		return lname;
	}
	public String getName(){
		return lname + " " + mname + " " + fname;
	}
	
	public int getAllowance(){
		return allowance;
	}
	public double getCoefficient(){
		return coefficient;
	}
	
	public void setFName(String newFName){
		fname = newFName;
	}
	public void setMName(String newMName){
		mname = newMName;
	}
	public void setLName(String newLName){
		lname = newLName;
	}
	public void setAllowance(int newAllowance){
		allowance = newAllowance;
	}
	public void setCoefficient(double newCoefficient){
		coefficient = newCoefficient;
	}
	
	public abstract float getSalary();
	public abstract void updateAllowance();
}
