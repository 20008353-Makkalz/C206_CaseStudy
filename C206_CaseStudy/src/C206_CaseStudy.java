import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<tuitionTimetable> timetableList = new ArrayList<tuitionTimetable>(); //YuanWei
		//===Gilbert
		ArrayList<Enquiry>enquiryList = new ArrayList<Enquiry>(); 
		enquiryList.add(new Enquiry("How to register", "2021-7-20", "09.15", 
				 "Email","Pending"));
		
		enquiryList.add(new Enquiry("Tuition Fee", "2021-7-5", "13.15",
				 "Email","Completed"));
		
		//===Gilbert
		//
		
		int option = 0;
		
		while(option != 6) //YuanWei
		{
			mainMenu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1)
			{
				//Add student
			}
			
			else if(option == 2)
			{
				// Register for tuition
			}
			
			else if(option == 3) ///Gilbert Ng -Option 3[Enquiry]
			{
				// Add enquiry
				int option3 = 0;
				
				while(option != 4)
				{
					doOption3menu();
					option3 = Helper.readInt("Enter an option > ");
				
					if(option3 == 1)
					{
						viewEnquiry(enquiryList);
					}
					else if(option3 == 2)// Delete Enquiry //Gilbert
					{
						
					}
					else if(option3 == 3)//Add Enquiry //Gilbert
					{
						
						String title = Helper.readString("Enter Enquiry Title > ");
						String date = Helper.readString("Enter data in (YYYY-MM-DD) > ");
						String time = Helper.readString("Enter time in (TT.MM) > ");
						String enquiryMethod = Helper.readString("Enter enquiry method > ");
						String status = Helper.readString("Enter enquiry status > ");
						enquiryList.add(new Enquiry (title, date, time,enquiryMethod, status));
					}
					else if(option3 == 4)
					{
						System.out.println("Returning to main menu....");
				
					}
					
				}
				
			}
			
			else if(option == 4)
			{
				// Add tuition time table YuanWei
				int uOption4 = 0;
				
				while(uOption4 != 4)
				{
					doOption4menu();
					uOption4 = Helper.readInt("Enter an Option >");
					
					if(option == 1)
					{
						//add
						addTimetable(timetableList);
					}
					
					else if(option == 2)
					{
						//View
						viewTimetable(timetableList);
					}
					
					else if(option == 3)
					{
						//delete
					}
					
					else if(option == 4)
					{
						System.out.println("Closing Tuition Timetable App...");
					}
					
					else
					{
						System.out.println("Invalid Input Try Again !");
					}
				}
			}
			
			else if(option == 5)
			{
				//Add tuition
			}
			
			else if(option == 6)
			{
				System.out.println("Thank you for using the Tuition Management App !");
			}
			
			else
			{
				System.out.println("Invalid Input Try Again !");
			}
		}
		


	}
	
	public static void mainMenu() //YuanWei
	{
		Helper.line(50, "=");
		System.out.println("TUITION MANAGEMENT SYSTEM");
		Helper.line(50, "=");
		
		System.out.println("1. Register Students");
		System.out.println("2. Register Timetable");
		System.out.println("3. Enquiry");
		System.out.println("4. Tuition Timetable");
		System.out.println("5. Tuition");
		System.out.println("6. Quit");
		
	}
	public static void doOption3menu() //Gilbert Ng
	{
		Helper.line(50, "=");
		System.out.println("Tuition Enquiry");
		Helper.line(50, "=");
		

		System.out.println("1. View Enquiry");
		System.out.println("2. Delete Enquiry");
		System.out.println("3. Add Enquiry");
		System.out.println("4. Quit");
	}
	
	public static void viewEnquiry(ArrayList<Enquiry> enquiryList) //Gilbert Ng
	{
		int count = 1;
		String output = String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n", "Enquiry_ID","Title","Date", "Time",
				"Enquiry_Method","Status");
		
		for(Enquiry e : enquiryList)
		{
			output += String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n", count ++,e.getTitle(),e.getDate(), e.getTime(),
					 e.getEnquiryMethod(),e.getStatus());
		}
		
		System.out.println(output);
	}
	
	public static void doOption4menu() //YuanWei
	{
		Helper.line(50, "=");
		System.out.println("TUITION TIMETABLE");
		Helper.line(50, "=");
		
		System.out.println("1. Add Tuition Timetable");
		System.out.println("2. View Tuition Timetable");
		System.out.println("3. Delete Tuition Timetable");
		System.out.println("4. Quit");
		
	}
	
	public static void addTimetable(ArrayList<tuitionTimetable> timetableList) //YuanWei
	{
		int uTuitionID = Helper.readInt("Enter Tuition ID > ");
		double uPrice = Helper.readDouble("Enter Price of Tuition > $");
		String uStartDate = Helper.readString("Enter Tuition Start Date/Time (YYYY/MM/DD HH:MM:SS) >");
		String uEndTime = Helper.readString("Enter Tuition End Date/Time (YYYY/MM/DD HH:MM:SS) >");
		String uMode = Helper.readString("Enter Tuition Mode >");
		
		LocalDateTime uStartDateF = LocalDateTime.parse(uStartDate);
		LocalDateTime uEndTimeF = LocalDateTime.parse(uEndTime);
		
		tuitionTimetable uTimetable = new tuitionTimetable(uTuitionID, uPrice, uStartDateF, uEndTimeF, uMode);
		timetableList.add(uTimetable);
		
		
	}
	
	public static void viewTimetable(ArrayList<tuitionTimetable> timetableList) //YuanWei
	{
		String output = String.format("", null);
		
		for(int i = 0; i < timetableList.size(); i++)
		{
			
		}
	}

}
