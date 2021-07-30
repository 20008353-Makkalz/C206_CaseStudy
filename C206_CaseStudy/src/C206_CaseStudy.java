import java.time.LocalDateTime;
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<tuitionTimetable> timetableList = new ArrayList<tuitionTimetable>(); //YuanWei

		
		
		
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
			
			else if(option == 3)
			{
				// Add enquiry
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
	
	public static void viewTimetable(ArrayList<tuitionTimetable> timetableList)
	{
		String output = String.format("", null);
		
		for(int i = 0; i < timetableList.size(); i++)
		{
			
		}
	}

}
