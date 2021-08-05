import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int ADD_TUITION = 1;
	private static final int VIEW_TUITION = 2;
	private static final int DELETE_TUITION = 3;
	private static final int TUITION_CLOSE = 4;
	/**
	 * 
	 */
	private static final int TTBCLOSE = 4;
	/**
	 * 
	 */
	private static final int TTBDEL = 3;
	/**
	 * 
	 */
	private static final int TTBVIEW = 2;
	/**
	 * 
	 */
	private static final int TTBADD = 1;
	private static final int TUITION = 5;
	private static final int TUITION_TIMETABLE = 4;
	private static final int ENQUIRY = 3;
	private static final int REG_TIMETABLE = 2;
	private static final int REG_STUDENT = 1;
	private static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<tuitionTimetable> timetableList = new ArrayList<tuitionTimetable>(); // YuanWei
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>(); // Vijay
		ArrayList<registerTimetable> registerList = new ArrayList<registerTimetable>(); // Jean-Claude

		// Gilbert
		ArrayList<Enquiry> enquiryList = new ArrayList<Enquiry>();
		enquiryList.add(new Enquiry(1, "How to register", "2021-7-20", "09.15", "Email", "Pending"));
		// Gilbert
		enquiryList.add(new Enquiry(2, "Tuition Fee", "2021-7-5", "13.15", "Email", "Completed"));

		// Vijay
		tuitionList.add(new Tuition("C206", "Software Development", "Group 1", "Learn about JUnit!", 160,
				"Laptop, Pen, Paper", "Serene Yong"));
		tuitionList.add(new Tuition("C328", "Intelligent Networks", "Group 2", "Learn about Cisco Networking", 160.5,
				"Laptop, Pen, Paper", "Pang Tee How"));
		tuitionList.add(new Tuition("C209", "Adv. Object Oriented Learning", "Group 3", "Learn about Java Programming!",
				160.5, "Laptop, Pen, Paper", "Peter Liew"));

		// YuanWei
		timetableList.add(new tuitionTimetable(1, 50.00, LocalDateTime.parse("2020-01-10T09:00:00"),
				LocalDateTime.parse("2020-02-10T09:00:00"), "F2F"));
		timetableList.add(new tuitionTimetable(2, 55.00, LocalDateTime.parse("2020-02-02T02:00:00"),
				LocalDateTime.parse("2020-03-20T03:00:00"), "F2F"));
		timetableList.add(new tuitionTimetable(3, 45.00, LocalDateTime.parse("2020-05-31T04:50:43"),
				LocalDateTime.parse("2020-09-10T05:00:00"), "HBL"));

		//

		int option = 0;

		while (option != OPTION_QUIT) // YuanWei
		{
			mainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == REG_STUDENT) {
				// Register student
			}

			else if (option == REG_TIMETABLE) { //Jean-Claude
				// Register timetable
				int option2 = 0;
				
				while (option != 4) {
					doOption2menu();
					option2 = Helper.readInt("Enter an option > ");
					
					if (option2 == 1) {
						addRegistration(registerList);
					} else if (option2 == 2) {
						viewTimetableList(registerList);
					} else if (option2 == 3) {
						deleteRegistration(registerList);
					} else if (option2 == 4) {
						mainMenu();
					} else {
						System.out.println("Invalid option");
					}
				}
				
				
				
			}

			else if (option == ENQUIRY) /// Gilbert Ng -Option 3[Enquiry]
			{
				// Add enquiry
				int option3 = 0;

				while (option != 4) {
					doOption3menu();
					option3 = Helper.readInt("Enter an option > ");

					if (option3 == 1) {
						viewEnquiry(enquiryList);
					} else if (option3 == 2)// Delete Enquiry //Gilbert
					{
						int delEn = Helper.readInt("Enter Enquiry Id to delete > ");
						deleteEnquiry(enquiryList, delEn);
					} else if (option3 == 3)// Add Enquiry //Gilbert
					{
						addEnquiry(enquiryList, null);
					} else if (option3 == 4) {
						System.out.println("Returning to main menu....");

					}

				}

			}

			else if (option == TUITION_TIMETABLE) {
				// Add tuition time table YuanWei
				int uOption4 = 0;

				while (uOption4 != 4) {
					doOption4menu();
					uOption4 = Helper.readInt("Enter an Option >");

					if (uOption4 == TTBADD) {
						// Add
						tuitionTimetable ttb1 = inputTimetable();
						C206_CaseStudy.addTimetable(timetableList, ttb1);
					}

					else if (uOption4 == TTBVIEW) {
						// View
						C206_CaseStudy.viewTimetable(timetableList);
					}

					else if (uOption4 == TTBDEL) {
						// Delete
						C206_CaseStudy.deleteTimetable(timetableList);
					}

					else if (uOption4 == TTBCLOSE) {
						System.out.println("Closing Tuition Timetable App...");
					}

					else {
						System.out.println("Invalid Input Try Again !");
					}
				}
			}

			else if (option == TUITION) {
				// VIJAY
				int uOption5 = 0;

				while (uOption5 != TUITION_CLOSE) {
					doOption5menu();
					uOption5 = Helper.readInt("Enter an Option > ");

					if (uOption5 == ADD_TUITION) {
						// Add
						Tuition t1 = inputTuition();
						addTuition(tuitionList, t1);
					}

					else if (uOption5 == VIEW_TUITION) {
						// View
						viewTuition(tuitionList);
					}

					else if (uOption5 == DELETE_TUITION) {
						// Delete
						C206_CaseStudy.deleteTuition(tuitionList);
					}

					else if (uOption5 == TUITION_CLOSE) {
						System.out.println("Closing Tuition App...");
					}

					else {
						System.out.println("Invalid Input Try Again !");
					}
				}
			}

			else if (option == OPTION_QUIT) {
				System.out.println("Thank you for using the Tuition Management App !");
			}

			else {
				System.out.println("Invalid Input Try Again !");
			}
		}

	}

	public static void mainMenu() // YuanWei
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
	
	public static void doOption2menu() // Jean-Claude
	{
		Helper.line(50, "=");
		System.out.println("Register Timetable");
		Helper.line(50, "=");

		System.out.println("1. Register For Timetable");
		System.out.println("2. View Registrations");
		System.out.println("3. Delete Registration");
		System.out.println("4. Quit");
	}

	public static void doOption3menu() // Gilbert Ng
	{
		Helper.line(50, "=");
		System.out.println("Tuition Enquiry");
		Helper.line(50, "=");

		System.out.println("1. View Enquiry");
		System.out.println("2. Delete Enquiry");
		System.out.println("3. Add Enquiry");
		System.out.println("4. Quit");
	}
	
	public static void addRegistration(ArrayList<registerTimetable> registerList) { // Jean-Claude
		int registrationNumber = Helper.readInt("Enter Registration number > ");
		int timetableID = Helper.readInt("Enter Tuition ID > ");
		String email = Helper.readString("Enter your email > ");
		
		
		registerList.add(new registerTimetable(registrationNumber, timetableID, email));
		
		System.out.println("Registration successful!");
	}
	
	public static String viewTimetableList(ArrayList<registerTimetable> registerList) { // Jean-Claude
		String output = String.format("%-15s %-15s %-25s %-15s\n", "Registration_No", "Tuition_ID", "Email", "Status");
		
		for (registerTimetable i : registerList) {
			output += String.format("%-15d %-15d %-25s %-15s\n", i.getRegistrationNumber(), i.getTimetableID(), i.getEmail(), i.getStatus());
		}
		System.out.println(output);
		return output;
	}
	
	public static void deleteRegistration(ArrayList<registerTimetable> registerList) { // Jean-Claude
		int deleteReg = Helper.readInt("Enter Registration Number to delete > ");
		
		for (registerTimetable i : registerList) {
			if (deleteReg == i.getRegistrationNumber()) {
				registerList.remove(i.getRegistrationID());
				System.out.println("Registration number " + deleteReg + " has been removed.");
			}
			else {
				System.out.println("Invalid Registration number");
			}
		}
	}

	public static String viewEnquiry(ArrayList<Enquiry> enquiryList) // GilbertNg
	{
		int count = 1;
		String output = String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n", "Enquiry_ID", "Title", "Date", "Time",
				"Enquiry_Method", "Status");

		for (Enquiry e : enquiryList) {
			output += String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n", count++, e.getTitle(), e.getDate(),
					e.getTime(), e.getEnquiryMethod(), e.getStatus());
		}

		System.out.println(output);
		return output;
	}

	public static void addEnquiry(ArrayList<Enquiry> enquiryList, Enquiry e1) {// Gilbert
		{
			int id = Helper.readInt("Enter Enquiry iD > ");
			String title = Helper.readString("Enter Enquiry Title > ");
			String date = Helper.readString("Enter data in (YYYY-MM-DD) > ");
			String time = Helper.readString("Enter time in (TT.MM) > ");
			String enquiryMethod = Helper.readString("Enter enquiry method > ");
			String status = Helper.readString("Enter enquiry status > ");
			enquiryList.add(new Enquiry(id, title, date, time, enquiryMethod, status));
		}
	}

	public static Boolean deleteEnquiry(ArrayList<Enquiry> enquiryList, int delEn) { // Gilbert

		for (Enquiry e : enquiryList) {
			if (delEn == e.getEnquiryID()) {
				enquiryList.remove(e.getEnquiryID());
				System.out.println("Enquiry " + delEn + " removed!");

			} else {
				System.out.println("iD does not exist!!");
			}

		}
		return null;
	}

	public static void doOption4menu() // YuanWei
	{
		Helper.line(50, "=");
		System.out.println("TUITION TIMETABLE");
		Helper.line(50, "=");

		System.out.println("1. Add Tuition Timetable");
		System.out.println("2. View Tuition Timetable");
		System.out.println("3. Delete Tuition Timetable");
		System.out.println("4. Quit");

	}

	public static void doOption5menu() // Vijay
	{
		Helper.line(50, "=");
		System.out.println("TUITION");
		Helper.line(50, "=");

		System.out.println("1. Add Tuition");
		System.out.println("2. View Tuition");
		System.out.println("3. Delete Tuition");
		System.out.println("4. Quit");

	}

	public static tuitionTimetable inputTimetable() // YuanWei
	{
		int uTuitionID = Helper.readInt("Enter Tuition ID > ");
		double uPrice = Helper.readDouble("Enter Price of Tuition > $");
		String uStartDate = Helper.readString("Enter Tuition Start Date/Time (YYYY-MM-DDTHH:MM:SS) >");
		String uEndTime = Helper.readString("Enter Tuition End Date/Time (YYYY-MM-DDTHH:MM:SS) >");
		String uMode = Helper.readString("Enter Tuition Mode (F2F/HBL)>");
		LocalDateTime uStartDateF = LocalDateTime.parse(uStartDate);
		LocalDateTime uEndTimeF = LocalDateTime.parse(uEndTime);

		tuitionTimetable ttb1 = new tuitionTimetable(uTuitionID, uPrice, uStartDateF, uEndTimeF, uMode);
		return ttb1;

	}

	public static Tuition inputTuition() // Vijay
	{
		String uTuitionCode = Helper.readString("Enter Tuition Code > ");
		String uTuitionTitle = Helper.readString("Enter Title of the Tuition > ");
		String uSubjGrpName = Helper.readString("Enter the Subject Group Name > ");
		String uTuitionDescription = Helper.readString("Enter description of the Tuition > ");
		double uTuitionDuration = Helper.readDouble("Enter the duration of the Tuition (in minutes) > ");
		String uPrerequisite = Helper.readString("Enter the prerequisites needed for the Tuition > ");
		String uTeacher = Helper.readString("Enter the name of the teacher > ");

		Tuition t1 = new Tuition(uTuitionCode, uTuitionTitle, uSubjGrpName, uTuitionDescription, uTuitionDuration,
				uPrerequisite, uTeacher);
		return t1;

	}

	public static void addTimetable(ArrayList<tuitionTimetable> timetableList, tuitionTimetable ttb1) // YuanWei
	{

		timetableList.add(ttb1);
		System.out.println("New Tuition Timetable added !");

	}

	public static void addTuition(ArrayList<Tuition> tuitionList, Tuition t1) // Vijay
	{

		tuitionList.add(t1);
		System.out.println("New Tuition added !");

	}

	public static String retrieveTimetable(ArrayList<tuitionTimetable> timetableList) // YuanWei
	{
		String output = "";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a");

		for (int i = 0; i < timetableList.size(); i++) 
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
		return output;
	}

	public static String retrieveTuition(ArrayList<Tuition> tuitionList) // VIJAY
	{
		String output = "";

		for (int i = 0; i < tuitionList.size(); i++) {
			String tuitionCode = tuitionList.get(i).getTuitionCode();
			String tuitionTitle = tuitionList.get(i).getTuitonTitle();
			String subjGrpName = tuitionList.get(i).getSubjGrpName();
			String tuitionDescription = tuitionList.get(i).getTuitionDescription();
			double tuitionDuration = tuitionList.get(i).getTuitionDuration();
			String prerequisite = tuitionList.get(i).getPrerequisite();
			String teacher = tuitionList.get(i).getTeacher();

			output += String.format("%-20s %-50s %-35s %-50s %-25.2f %-25s %-10s\n", tuitionCode, tuitionTitle,
					subjGrpName, tuitionDescription, tuitionDuration, prerequisite, teacher);
		}
		return output;
	}

	public static void viewTimetable(ArrayList<tuitionTimetable> timetableList) // YuanWei
	{
		String output = String.format("%-10s %-11s %-25s %-25s %-10s\n", "Tuition ID", "Price($)", "Start Date",
				"End Date", "Mode");
		output += retrieveTimetable(timetableList);
		System.out.println(output);
	}

	public static void viewTuition(ArrayList<Tuition> tuitionList) // VIJAY
	{
		String output = String.format("%-20s %-50s %-35s %-50s %-25s %-25s %-10s\n", "Tuition Code", "Title",
				"Subject Group Name", "Description", "Duration (mins)", "Pre-Requisites", "Teacher");
		output += retrieveTuition(tuitionList);
		System.out.println(output);
	}

	public static boolean doDeleteTimetable(ArrayList<tuitionTimetable> timetableList, int delOption) // YuanWei
	{
		boolean isFound = false;

		for (int i = 0; i < timetableList.size(); i++) {
			int tuitionID = timetableList.get(i).getTuitionID();
			if (delOption == tuitionID) {
				timetableList.remove(i);

				isFound = true;
			}
		}

		return isFound;
	}

	public static boolean doDeleteTuition(ArrayList<Tuition> tuitionList, String delOption) // VIJAY
	{
		boolean isFound = false;

		for (int i = 0; i < tuitionList.size(); i++) {
			String tuitionCode = tuitionList.get(i).getTuitionCode();
			if (delOption == tuitionCode) {
				tuitionList.remove(i);

				isFound = true;
			}
		}

		return isFound;
	}

	public static void deleteTimetable(ArrayList<tuitionTimetable> timetableList) // YuanWei
	{
		C206_CaseStudy.viewTimetable(timetableList);
		int delOption = Helper.readInt("Enter Tuition ID: ");
		Boolean isFound = doDeleteTimetable(timetableList, delOption);

		if (isFound == false) {
			System.out.println("Tuition ID Does Not Match Any Existing ID");
		}

		else {
			System.out.println("Tuition ID: " + delOption + " Has Been Deleted !");
		}

	}

	public static void deleteTuition(ArrayList<Tuition> tuitionList) // VIJAY
	{
		C206_CaseStudy.viewTuition(tuitionList);
		String delOption = Helper.readString("Enter Tuition Code: ");
		Boolean isFound = doDeleteTuition(tuitionList, delOption);

		if (isFound == false) {
			System.out.println("Tuition Code Does Not Match Any Existing Code");
		}

		else {
			System.out.println("Tuition Code: " + delOption + " Has Been Deleted !");
		}

	}

	/**
	 * @param enquiryList
	 * @return
	 */
	public static String viewEnquiryTest(ArrayList<Enquiry> enquiryList) {
		// TODO Auto-generated method stub
		return null;
	}

}
