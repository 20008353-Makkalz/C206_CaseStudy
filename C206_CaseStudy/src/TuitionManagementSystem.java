import java.util.ArrayList;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Fazia Fazal
 * Student ID: 19028056
 * Class: W64C
 * Date/Time created: Wednesday 04-08-2021 23:58
 */

/**
 * @author 19028056
 *
 */
public class TuitionManagementSystem {
	
	public static final int OPTION_QUIT= 4;
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 ArrayList <StudentAccount> StudentList = new ArrayList <StudentAccount>();
		 
		 StudentList.add(new StudentAccount("john", "M",16834859, "john@gmail.com", "09/09/2001","singapore", 6.5));
		 StudentList.add(new StudentAccount("cheryl", "F",83485914, "cheryl@gmail.com", "23/09/2001","singapore", 6.5));
		
		 int option = 0;
		 
			while (option != OPTION_QUIT) {
				
				TuitionManagementSystem.mainMenu();
				option = Helper.readInt("Enter an option> ");
				//Helper.line(100, "-");
				
				
				if(option == 1) {
					// TUITION ADMINISTRATOR
					
			int opt = 0;
			TuitionManagementSystem.setHeader("TUITION ADMINISTRATOR");
			
			while(opt != OPTION_QUIT) {
				
				TuitionManagementSystem.menu();
				opt = Helper.readInt("Enter an option>");
				
				
			if(opt == 1) {
					//Register a student account
				TuitionManagementSystem.setHeader("REGISTER ACCOUNT");
					StudentAccount SA = RegisterAccount();
					TuitionManagementSystem.RegisterStudentAccount(StudentList, SA);
					}
				else if (opt == 2) {
					//View the student account
					TuitionManagementSystem.setHeader("VIEW STUDENT ACCOUNT");
					TuitionManagementSystem.ViewStudentAccount(StudentList);
						
					}
				else if (opt == 3) {
					//Delete the student account
					TuitionManagementSystem.setHeader("DELETE STUDENT ACCOUNT");
					TuitionManagementSystem.DeleteStudentAccount(StudentList);
						
					}
				else if (opt == 4) {
					System.out.println("Goodbye!");
				}
				else {
					System.out.println("Invalid option");
				}
			}
	 }
			}
	 }
	
	

	public static void menu() {
			
			System.out.println("1. Register Student Account");
			System.out.println("2. View Student Account");
			System.out.println("3. Delete Student Account");
			System.out.println("4. Quit ");
			Helper.line(100, "-");
			
		}
	
	private static void setHeader(String Header) {
		// TODO Auto-generated method stub
		Helper.line(100, "-");
		System.out.println(Header);
		Helper.line(100, "-");
		
	}
	
	public static StudentAccount RegisterAccount() {
		
		String name = Helper.readString("Enter your name> ");
		String gender = Helper.readString("Enter your gender (M/F)> ");
		int mobile = Helper.readInt("Enter your mobile number> ");
		String email = Helper.readString("Enter your email> ");
		while (isValid(email) == false)
		{
			System.out.println("Invalid email entered.");
			email = Helper.readString("Enter email > ");
		}
		String dateofbirth = Helper.readString("Enter your date of birth (Format(ddMMMyy))> ");
		String cor = Helper.readString("Enter your country of Residence> ");
		double interest = Helper.readDouble("Enter the Interest> ");

		StudentAccount SA = new StudentAccount(name, gender, mobile, email, dateofbirth, cor,interest);
		return SA;
	}
	
	
   public static void RegisterStudentAccount(ArrayList<StudentAccount> StudentList, StudentAccount SA) {
		
		StudentList.add(SA);
		Helper.line(80,"-");
		System.out.println("Account Registered Sucessfully");
		Helper.line(80,"-");

	}
   // view student Account 
   public static String RetrieveAllStudentAccount(ArrayList<StudentAccount> StudentList) {
    		String output = "";
    		
    		for (int i = 0; i < StudentList.size(); i ++) {
    			 output += String.format("%-84s\n", StudentList.get(i).toString());
    		}
    		return output;
    	}
        
   public static void ViewStudentAccount(ArrayList<StudentAccount> StudentList) {
    		String output = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s \n", "Name", "Gender", "Mobile No", "Email", "Date of Birth", "Country of Residence","Interest");
    		output += RetrieveAllStudentAccount(StudentList);
    		System.out.println(output);
			
    	}
   
   // delete student Account 
        
        public static boolean doDeleteStudentAccount(ArrayList<StudentAccount> StudentList, String name) {
    		boolean isDelete = false;
    		
    		for(int i = 0; i < StudentList.size(); i++) {
    			String NAME  = StudentList.get(i).getName();
    			
    			if(name.equalsIgnoreCase(NAME) == true) {
    				StudentList.remove(i);
    				isDelete = true;
    			}
    		}
    		
    		return isDelete;
    	}
        
        public static void DeleteStudentAccount(ArrayList<StudentAccount> StudentList) {
    		TuitionManagementSystem.ViewStudentAccount(StudentList);
    		String Name = Helper.readString("Enter name > ");
    		Boolean isDeleted = doDeleteStudentAccount(StudentList, Name);
    		if (isDeleted == false) {
    			Helper.line(80,"-");
    			System.out.println("delete unsuccessful");
    			Helper.line(80,"-");
    		}else {
    			Helper.line(80,"-");
    			System.out.println("The account is deleted successfully!");
    			Helper.line(80,"-");
    		}
    	}
        
	private static boolean isValid(String email) {
		
		if (email.contains(".") && email.contains("@"))
		{
			return true;
		}
		else
		{
			return false;
		 
	}
	}
		public static void mainMenu() {
			TuitionManagementSystem.setHeader("TUITION MANAGEMENT APP");
			System.out.println("Login via:");
			System.out.println("1. Tuition Administrator");
			System.out.println("2. Tuition Manager");
			System.out.println("3. Student");
			System.out.println("4. Quit");
			Helper.line(80, "-");
		}
	}


	