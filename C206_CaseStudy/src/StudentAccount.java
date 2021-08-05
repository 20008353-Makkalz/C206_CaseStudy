/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Fazia Fazal
 * Student ID: 19028056
 * Class: W64C
 * Date/Time created: Wednesday 04-08-2021 23:21
 */

/**
 * @author 19028056
 *
 */
public class StudentAccount {
	
	private String name;
	private String gender;
	private int mobile;
	private String email;
	private String dateofbirth;
	private String cor;
	private double interest;
	
	public StudentAccount(String name, String gender, int mobile, String email, String dateofbirth, String cor,
			double interest) {
		
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.cor = cor;
		this.interest = interest;
		
	}
	
	public String toString() {
	return String.format("%-10s %-10s %-10d %-20s %-20s %-20s %-20f\n", name, gender, mobile, email, dateofbirth,  cor,
			interest );
	
}
	//String Output = String.format("%-10s %-10s %-10d %-20s %-20s %-20s", name, gender, mobile, email, dateofbirth,cor,interest);
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getMobile() {
		return mobile;
	}
	public String getDOB() {
		return dateofbirth;
	}
	public String getCOR() {
		return cor;
	}
	public String getEmail() {
		return email;
	}
	public double getInterest() {
		return interest;
	}

	/**
	 * @param nAME2
	 * @return
	 */
	//public boolean equalsIgnoreCase(String nAME2) {
		// TODO Auto-generated method stub
		//return false;
	}
//}


