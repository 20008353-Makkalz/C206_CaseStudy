import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<tuitionTimetable> timetableList = new ArrayList<tuitionTimetable>(); //YuanWei
		
		timetableList.add(new tuitionTimetable(1,50.00,LocalDateTime.parse("2020-01-10T09:00:00"), LocalDateTime.parse("2020-02-10T09:00:00"), "F2F"));
		timetableList.add(new tuitionTimetable(2,55.00,LocalDateTime.parse("2020-02-02T02:00:00"), LocalDateTime.parse("2020-03-20T03:00:00"), "F2F"));
		timetableList.add(new tuitionTimetable(3,45.00,LocalDateTime.parse("2020-05-31T04:50:43"), LocalDateTime.parse("2020-09-10T05:00:00"), "HBL"));

		
		
		
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
					
					if(uOption4 == 1)
					{
						//Add
						addTimetable(timetableList);
					}
					
					else if(uOption4 == 2)
					{
						//View
						viewTimetable(timetableList);
					}
					
					else if(uOption4 == 3)
					{
						//Delete
						int delOption = Helper.readInt("Enter Tuition ID >");
						deleteTimetable(timetableList,delOption);
					}
					
					else if(uOption4 == 4)
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
		String uStartDate = Helper.readString("Enter Tuition Start Date/Time (YYYY-MM-DDTHH:MM:SS) >");
		String uEndTime = Helper.readString("Enter Tuition End Date/Time (YYYY-MM-DDTHH:MM:SS) >");
		String uMode = Helper.readString("Enter Tuition Mode (F2F/HBL)>");
		LocalDateTime uStartDateF = LocalDateTime.parse(uStartDate);
		LocalDateTime uEndTimeF = LocalDateTime.parse(uEndTime);
		
		tuitionTimetable uTimetable = new tuitionTimetable(uTuitionID, uPrice, uStartDateF, uEndTimeF, uMode);
		timetableList.add(uTimetable);
		
		
	}
	
	public static void viewTimetable(ArrayList<tuitionTimetable> timetableList) //YuanWei
	{
		String output = String.format("%-10s %-11s %-25s %-25s %-10s\n", "Tuition ID", "Price($)", "Start Date", "End Date", "Mode");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a"); 
		
		for(int i = 0; i < timetableList.size(); i++)
		{
			int tuitionID = timetableList.get(i).getTuitionID();
			double price = timetableList.get(i).getPrice();
			LocalDateTime startDate = timetableList.get(i).getStartDate();
			LocalDateTime endTime = timetableList.get(i).getEndTime();
			String startDateF = startDate.format(format);
			String endTimeF = endTime.format(format);
			String mode = timetableList.get(i).getMode();
			
			output += String.format("%-10d $%-10.2f %-25s %-25s %-10s\n", tuitionID, price, startDateF, endTimeF, mode);
		}
		System.out.println(output);
	}
	
	public static void deleteTimetable(ArrayList<tuitionTimetable> timetableList, int delOption) //YuanWei
	{
		boolean found = false;
		for(int i = 0; i < timetableList.size(); i++)
		{
			int tuitionID = timetableList.get(i).getTuitionID();
			
			if(delOption == tuitionID)
			{
				timetableList.remove(i);
				System.out.println("Tuition ID:" + (tuitionID) + " has been removed !");
				found = true;
			}
			
			
			else
			{
				found = false;
			}
			
		}
		
		if(found == false)
		{
			System.out.println("Tuition ID Does Not Match Any Existing ID");
		}
		
	}

}
