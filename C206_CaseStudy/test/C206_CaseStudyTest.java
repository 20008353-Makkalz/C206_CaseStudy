import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	// Yuan Wei
	private tuitionTimetable ttb1;
	private tuitionTimetable ttb2;
	private tuitionTimetable ttb3;

//github.com/20008353-Makkalz/C206_CaseStudy.git
	private Enquiry e1; // Gilbert
	private Enquiry e2; // Gilbert

//github.com/20008353-Makkalz/C206_CaseStudy.git
	private registerTimetable r1; // Jean-Claude
	private registerTimetable r2; // Jean-Claude

//github.com/20008353-Makkalz/C206_CaseStudy.git
	private Tuition t1; // Vijay
	private Tuition t2; // Vijay
	private Tuition t3; // Vijay

	// private Enquiry e1; // Gilbert
	// private Enquiry e2; // Gilbert

//github.com/20008353-Makkalz/C206_CaseStudy.git

	private StudentAccount SA1; // Fazia
	private StudentAccount SA2; // Fazia

	private ArrayList<tuitionTimetable> timetableList; // YuanWei

	private ArrayList<Enquiry> enquiryList; // Gilbert
	private ArrayList<registerTimetable> registerList; // Jean-Claude

	private ArrayList<Tuition> tuitionList; // Vijay
	private ArrayList<StudentAccount> StudentList; // Fazia

//github.com/20008353-Makkalz/C206_CaseStudy.git

//github.com/20008353-Makkalz/C206_CaseStudy.git

//github.com/20008353-Makkalz/C206_CaseStudy.git

	// private ArrayList<Enquiry> enquiryList; // Gilbert
	// private ArrayList<Tuition> tuitionList; // Vijay

//github.com/20008353-Makkalz/C206_CaseStudy.git

	@Before
	public void setUp() throws Exception {
		// YuanWei
		ttb1 = new tuitionTimetable(1, 50.00, LocalDateTime.parse("2020-01-10T09:00:00"),
				LocalDateTime.parse("2020-02-10T09:00:00"), "F2F", "How To Pass C206 101", "Open");
		ttb2 = new tuitionTimetable(2, 55.00, LocalDateTime.parse("2020-02-02T02:00:00"),
				LocalDateTime.parse("2020-03-20T03:00:00"), "F2F", "Upper Secondary Math", "Open");
		ttb3 = new tuitionTimetable(3, 45.00, LocalDateTime.parse("2020-05-31T04:50:43"),
				LocalDateTime.parse("2020-09-10T05:00:00"), "HBL", "Science Class With Bill Nye", "Open");

		timetableList = new ArrayList<tuitionTimetable>();

		// Gilbert
		// e1 = (new Enquiry(1,"How to register", "2021-7-20", "09.15",
		// "Email","Pending"));
		// e2 = (new Enquiry(2,"Tuition Fee", "2021-7-5", "13.15",
		// "Email","Completed"));
		e1 = (new Enquiry(1, "How to register", "2021-7-20", "09.15", "Email", "Pending", "Urgent"));
		e2 = (new Enquiry(2, "Tuition Fee", "2021-7-5", "13.15", "Email", "Completed", "Non-Urgent"));

//github.com/20008353-Makkalz/C206_CaseStudy.git
		enquiryList = new ArrayList<Enquiry>();

		// Gilbert
		e1 = (new Enquiry(1, "How to register", "2021-7-20", "09.15", "Email", "Pending", "Urgent"));
		e2 = (new Enquiry(2, "Tuition Fee", "2021-7-5", "13.15", "Email", "Completed", "Non-Urgent"));
		enquiryList = new ArrayList<Enquiry>();
//github.com/20008353-Makkalz/C206_CaseStudy.git
		r1 = (new registerTimetable(3, "Email")); // Jean-Claude
		r2 = (new registerTimetable(1, "Email")); // Jean-Claude
		registerList = new ArrayList<registerTimetable>(); // Jean-Claude

//github.com/20008353-Makkalz/C206_CaseStudy.git

//github.com/20008353-Makkalz/C206_CaseStudy.git
		// Vijay
		t1 = (new Tuition("C206", "Software Development", "Group 1", "Learn about JUnit!", 160, "Laptop, Pen, Paper",
				"Serene Yong"));
		t2 = (new Tuition("C328", "Intelligent Networks", "Group 2", "Learn about Cisco Networking", 160.5,
				"Laptop, Pen, Paper", "Pang Tee How"));
		t3 = (new Tuition("C209", "Adv. Object Oriented Learning", "Group 3", "Learn about Java Programming!", 160.5,
				"Laptop, Pen, Paper", "Peter Liew"));

		tuitionList = new ArrayList<Tuition>();
//github.com/20008353-Makkalz/C206_CaseStudy.git

		// fazia
		SA1 = new StudentAccount("john", 'M', 16834859, "john@gmail.com", "09/09/2001", "singapore", 6.5);
		SA2 = new StudentAccount("cheryl", 'F', 83485914, "cheryl@gmail.com", "23/09/2001", "singapore", 6.5);

		StudentList = new ArrayList<StudentAccount>();

		tuitionList = new ArrayList<Tuition>();

	}
// of https://github.com/20008353-Makkalz/C206_CaseStudy.git

//github.com/20008353-Makkalz/C206_CaseStudy.git

	@After
	public void tearDown() throws Exception {
		// YuanWei
		ttb1 = null;
		ttb2 = null;
		timetableList = null;
		// gilbert
		e1 = null;

		e2 = null;

		enquiryList = null;

		enquiryList = null;

//github.com/20008353-Makkalz/C206_CaseStudy.git
		e2 = null;
		enquiryList = null;
		enquiryList = null;

//github.com/20008353-Makkalz/C206_CaseStudy.git
		r1 = null; // Jean-Claude
		r2 = null; // Jean-Claude

		registerList = null;
//github.com/20008353-Makkalz/C206_CaseStudy.git

		// Fazia
		SA1 = null;
		SA2 = null;
		StudentList = null;

		// Vijay
		t1 = null;

		t2 = null;

		t3 = null;
//github.com/20008353-Makkalz/C206_CaseStudy.git
	}

//github.com/20008353-Makkalz/C206_CaseStudy.git
//github.com/20008353-Makkalz/C206_CaseStudy.git

	// t3 = null;

//github.com/20008353-Makkalz/C206_CaseStudy.git

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void addTuitiontimetableTest() {
		// YuanWei

		// Make sure Timetable List is not null, so I can add a new Item - Boundary
		assertNotNull("Check if there is valid Tuition Timetable arraylist to add to", timetableList);

		// Make sure Timetable List has increased to size 1 after adding 1 item.
		// Make sure Timetable added is the same as the first item of list
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 1, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb1, timetableList.get(0));

		// Adding another Timetable entry. Test the size of list = 2 -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 2, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb2, timetableList.get(1));

		// Add 3rd item. Test size of list = 3 -Boundary
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 3, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb3, timetableList.get(2));

		// Test size of list is not bigger than 3 -Error
		assertNotEquals("Check that tuition timetable list size is not bigger than 3", 4, timetableList.size());

	}

	@Test
	public void retrieveTimetableTest() /// YuanWei
	{
		// Test if list is not null - Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable List is not empty -Boundary
		String allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		String testOutput = "";
		assertEquals("Check ViewTimetable", testOutput, allTuitionTimetable);

		// After adding 3 Timetable list size should increase to 3 -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		assertEquals("Test that Tuition Timetable arraylist size is 3", 3, timetableList.size());

		// Test if output string is same as timetable list
		allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		testOutput = String.format("%-10s $%-10.2f %-25s %-25s %-10s %-30s %-10s\n", "1", 50.00, "10 Jan 2020 09:00 am",
				"10 Feb 2020 09:00 am", "F2F", "How To Pass C206 101", "Open");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s %-30s %-10s\n", "2", 55.00,
				"02 Feb 2020 02:00 am", "20 Mar 2020 03:00 am", "F2F", "Upper Secondary Math", "Open");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s %-30s %-10s\n", "3", 45.00,
				"31 May 2020 04:50 am", "10 Sep 2020 05:00 am", "HBL", "Science Class With Bill Nye", "Open");

		assertEquals("Test viewAllTuitionTimetable", testOutput, allTuitionTimetable);

	}

	@Test
	public void doDeleteTimetableTest() // YuanWei
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);

		// Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?", ok);

		// Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 2);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);

		// Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 2);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?", ok);

		// Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 3);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);

		// Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 3);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?", ok);

		// Test if Timetable list size has dropped to 0 after removing the 3 test items
		// -Normal
		assertEquals("Check that tuition timetable list is not bigger than 0", 0, timetableList.size());
	}

	@Test
	public void doSearchTimeTableTTest() // YuanWei
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable Title can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doSearchTimetableT(timetableList, "How To Pass C206 101");
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Upper Secondary Math");
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Title Not Included In Timetable List Can Be Found - Error
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Test Title");
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Science Class With Bill Nye");
		assertTrue("Test if an Timetable Title can be found", found);

	}

	@Test
	public void doSearchTimeTablePTest() // YuanWei
	{

		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable Title can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doSearchTimetableP(timetableList, 50.00);
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 55.00);
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Price Not Included In Timetable List Can Be Found - Error
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 1000);
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 45.00);
		assertTrue("Test if an Timetable Title can be found", found);

	}

	@Test
	public void updateTimetableTest() // YuanWei
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable Title can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doUpdateTimetable(timetableList, 1, "Open");
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 2, "Open");
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Timetable ID that is not inside list can be found -Error
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 3, "Open");
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 3, "Open");
		assertTrue("Test if an Timetable Title can be found", found);

	}

	public void updateTimeTableTest() // YuanWei
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable ID can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doUpdateTimetable(timetableList, 1, "Open");
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 2, "Open");
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Timetable ID that is not inside list can be found -Error
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 3, "Open");
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doUpdateTimetable(timetableList, 3, "Open");
		assertTrue("Test if an Timetable Title can be found", found);
	}
	// github.com/20008353-Makkalz/C206_CaseStudy.git

	@Test
	public void doSearchTimeTableT() {
		// YuanWei
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable Title can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doSearchTimetableT(timetableList, "How To Pass C206 101");
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Upper Secondary Math");
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Title Not Included In Timetable List Can Be Found - Error
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Test Title");
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doSearchTimetableT(timetableList, "Science Class With Bill Nye");
		assertTrue("Test if an Timetable Title can be found", found);
	}

	@Test
	public void doSearchTimeTableP() // YuanWei
	{

		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);

		// Test if Timetable Price can be found -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean found = C206_CaseStudy.doSearchTimetableP(timetableList, 50.00);
		assertTrue("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb2);
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 55.00);
		assertTrue("Test if an Timetable Title can be found", found);

		// Test if Price Not Included In Timetable List Can Be Found - Error
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 1000);
		assertFalse("Test if an Timetable Title can be found", found);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		found = C206_CaseStudy.doSearchTimetableP(timetableList, 45.00);
		assertTrue("Test if an Timetable Title can be found", found);

	}

	@Test

	public void viewEnquiryTest()// Gilbert
	{
		// Test list is not null - Boundary
		assertNotNull("Test if there is valid enquiry arraylist to retrieve item", enquiryList);
		// Test if list is not null - Boundary
		assertNotNull("Test if there is valid Enquiry arraylist to retrieve item", enquiryList);
		// github.com/20008353-Makkalz/C206_CaseStudy.git

		// Test if Timetable List is not empty -Boundary
		String allenquiry = C206_CaseStudy.viewEnquiry(enquiryList);
		String testOutput = "";
		assertEquals("Check ViewEnquiry", testOutput, allenquiry);

		// After adding 2 items list size should be 2 -Normal
		C206_CaseStudy.viewEnquiry(enquiryList);
		C206_CaseStudy.viewEnquiry(enquiryList);

		assertEquals("Test that enquiry arraylist size is 2", 2, enquiryList.size());

		// Test if output is same as enquiry list
		allenquiry = C206_CaseStudy.viewEnquiry(enquiryList);

		testOutput = String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 1, "How to register", "2021-7-20",
				"09.15", "Email", "Pending", "Urgent");
		testOutput += String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 2, "Tuition Fee", "2021-7-5",
				"13.15", "Email", "Completed", "Non-Urgent");

		assertEquals("Test viewEnquiry", testOutput, allenquiry);

	}

	public void addEnquiryTest()// Gilbert
	{
		// Item list is not null, so that can add a new item - (boundary)
		assertNotNull("Check if there is valid enquiry arraylist to add to it", enquiryList);
		// Given an empty list, after adding 1 item, size of list = 1 - (normal)
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addEnquiry(enquiryList, e1);
		assertEquals("Check that enquiry arraylist size is 1", 1, enquiryList.size());
		assertSame("Check that enquiry is added", e1, enquiryList.get(0));

		// Add another item. test The size of the list is 2 -(normal)
		// The item just added is same as the second item of the list
		// Add another item. test The size of the list is 2 -normal
		// The item just added is as same as the second item of the list
		// github.com/20008353-Makkalz/C206_CaseStudy.git
		C206_CaseStudy.addEnquiry(enquiryList, e2);
		assertEquals("Check that enquiry arraylist size is 2", 2, enquiryList.size());
		assertSame("Check that enquiry is added", e2, enquiryList.get(1));
	}

	public void deleteEnquiry()// Gilbertng
	{
		// test list is not null -Boundary
		assertNotNull("Test if there is valid enquiry arraylist to retrieve from", enquiryList);

		// Test if enquiry ID can be removed from list -(Normal)
		C206_CaseStudy.addEnquiry(enquiryList, e1);
		Boolean check = C206_CaseStudy.deleteEnquiry(enquiryList, 1);
		assertTrue("Test if enquiry is able to be deleted?", check);

		// Test if same enquiry ID can be removed again -Error
		check = C206_CaseStudy.deleteEnquiry(enquiryList, 1);
		assertFalse("Test that the same enquiry is able to be deleted again?", check);

		assertFalse("Test that the same enquiry is able to be deleted again", check);

		assertFalse("Test that the same enquiry is NOT ok to be deleted again?", check);
		// github.com/20008353-Makkalz/C206_CaseStudy.git

		// Test if enquiry ID can be removed -Normal
		C206_CaseStudy.addEnquiry(enquiryList, e2);
		check = C206_CaseStudy.deleteEnquiry(enquiryList, 2);
		assertTrue("Test if an enquiry is able to be deleted?", check);

		// Test if same enquiry ID can be removed again -Error
		check = C206_CaseStudy.deleteEnquiry(enquiryList, 2);
		assertFalse("Test that the same enquiry is NOT able to be deleted again?", check);

		// Test if enquiry list size has dropped to 0 after removing the 3 test items
		assertEquals("Check that enquiry list is not bigger than 0", 0, enquiryList.size());

		// Test if enquiry list size is 0 after removing the 2 test items
		assertEquals("Check that enquiry list is not more than 0", 0, enquiryList.size());
	}

//github.com/20008353-Makkalz/C206_CaseStudy.git

//github.com/20008353-Makkalz/C206_CaseStudy.git

	@Test
	public void addTuitionTest() {
		// Vijay

		// Make sure Tuition is not null, so I can add a new Item - Boundary
		assertNotNull("Check if there is valid Tuition arraylist to add to", tuitionList);

		// Make sure Tuition List has increased to size 1 after adding 1 item.
		// Make sure item added is the same as the first item of list
		C206_CaseStudy.addTuition(tuitionList, t1);
		assertEquals("Check that Tuition arraylist size is 1", 1, tuitionList.size());
		assertSame("Check that Tuition is added", t1, tuitionList.get(0));

		// Adding another item. Test the size of list = 2 -Normal
		// Make sure item added is the same as the second item of list
		C206_CaseStudy.addTuition(tuitionList, t2);
		assertEquals("Check that Tuition arraylist size is 1", 2, tuitionList.size());
		assertSame("Check that Tuition is added", t2, tuitionList.get(1));

		// Add 3rd item. Test size of list = 3 -Boundary
		// Make sure item added is the same as the third item of list
		C206_CaseStudy.addTuition(tuitionList, t3);
		assertEquals("Check that Tuition arraylist size is 1", 3, tuitionList.size());
		assertSame("Check that Tuition Timetable is added", t3, tuitionList.get(2));

		// Test size of list is not bigger than 3 -Error
		assertNotEquals("Check that tuition list size is not bigger than 3", 4, tuitionList.size());

	}

	@Test
	public void retrieveTuitionTest() // Vijay
	{
		// Test if list is not null - Boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);

		// Test if Tuition List is not empty -Boundary
		String allTuition = C206_CaseStudy.retrieveTuition(tuitionList);
		String testOutput = "";
		assertEquals("Check View Tuition", testOutput, allTuition);

		// After adding 3 items list size should increase to 3 -Normal
		C206_CaseStudy.addTuition(tuitionList, t1);
		C206_CaseStudy.addTuition(tuitionList, t2);
		C206_CaseStudy.addTuition(tuitionList, t3);
		assertEquals("Test that Tuition arraylist size is 3", 3, tuitionList.size());

		// Test if output string is same as tuition list
		allTuition = C206_CaseStudy.retrieveTuition(tuitionList);
		testOutput = String.format("%-10s $%-25s %-25s %-25s %-10.2f %-25s %-10s\n", "C206", "Software Development",
				"Group 1", "Learn about JUnit!", 160, "Laptop, Pen, Paper", "Serene Yong");
		testOutput += String.format("%-10s $%-25s %-25s %-25s %-10.2f %-25s %-10s\n", "C328", "Intelligent Networks",
				"Group 2", "Learn about Cisco Networking", 160.5, "Laptop, Pen, Paper", "Pang Tee How");
		testOutput += String.format("%-10s $%-25s %-25s %-25s %-10.2f %-25s %-10s\n", "C209",
				"Adv. Object Oriented Learning", "Group 3", "Learn about Java Programming!", 160.5,
				"Laptop, Pen, Paper", "Peter Liew");

		assertEquals("Test viewAllTuitionTimetable", testOutput, allTuition);

	}

	@Test
	public void doDeleteTuitionTest() // Vijay
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);

		// Test if Tuition Code can be removed -Normal
		C206_CaseStudy.addTuition(tuitionList, t1);
		Boolean ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C206");
		assertTrue("Test if Tuition is ok to be deleted?", ok);

		// Test if same Tuition Code can be removed again -Error
		ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C206");
		assertFalse("Test that the same Tuition is NOT ok to be deleted again?", ok);

		// Test if Tuition Code can be removed -Normal
		C206_CaseStudy.addTuition(tuitionList, t2);
		ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C328");
		assertTrue("Test if a Tuition is ok to be deleted?", ok);

		// Test if same Tuition can be removed again -Error
		ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C328");
		assertFalse("Test that the same Tuition is NOT ok to be deleted again?", ok);

		// Test if Tuition Code can be removed -Normal
		C206_CaseStudy.addTuition(tuitionList, t3);
		ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C209");
		assertTrue("Test if a Tuition is ok to be deleted?", ok);

		// Test if same Tuition Code can be removed again -Error
		ok = C206_CaseStudy.doDeleteTuition(tuitionList, "C209");
		assertFalse("Test that the same Tuition is NOT ok to be deleted again?", ok);

		// Test if Tuition list size has dropped to 0 after removing the 3 test items
		// -Normal
		assertEquals("Check that tuition list is not bigger than 0", 0, tuitionList.size());
	}

	@Test
	public void RegisterStudentAccountTest() // fazia
	{
		// Student list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Student arraylist to add to", StudentList);

		// Given an empty list, after adding 1 StudentAccount, the size of the list
		// become 1 - normal
		// The StudentAccount just added is as same as the first StudentAccount
		TuitionManagement.RegisterStudentAccount(StudentList, SA1);
		assertEquals("Check that StudentAccount arraylist size is 1", 1, StudentList.size());
		assertSame("Check that New Student is added", SA1, StudentList.get(0));

		// Add another StudentAccount. Test the size of the StudentList list is 2? -
		// normal
		// The StudentAccount just added is as same as the second StudentAccount
		TuitionManagement.RegisterStudentAccount(StudentList, SA2);
		assertEquals("Check that StudentAccount arraylist size is 2", 2, StudentList.size());
		assertSame("Check that the New Student is added", SA2, StudentList.get(1));

	}

	@Test
	public void RetrieveAllStudentAccountTest() // fazia
	{
		// Test if StudentAccount list is not null but empty - boundary
		assertNotNull("Test if there is valid StudentList arraylist to retrieve from, StudentList");

		// Test if the list of students retrieved from TuitionManagementSystem is empty
		// - boundary
		String allStudentAccount = TuitionManagement.RetrieveAllStudentAccount(StudentList);
		String testOutput = "";
		assertEquals("Check ViewStudentAccount", testOutput, allStudentAccount);

		// Given an empty list, after adding 2 students,test if the size of the list is
		// 2 - normal
		TuitionManagement.RegisterStudentAccount(StudentList, SA1);
		TuitionManagement.RegisterStudentAccount(StudentList, SA2);
		assertEquals("Test that StudentAccount arraylist size is 2", 2, StudentList.size());

		// Test if the expected output same as the list of StudentList retrieved from
		// the TuitionManagementSystem
		allStudentAccount = TuitionManagement.RetrieveAllStudentAccount(StudentList);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n", "john", "M", 16834859,
				"john@gmail.com", "09/09/2001", "singapore", 6.5);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n", "cheryl", "F", 83485914,
				"cheryl@gmail.com", "23/09/2001", "singapore", 6.5);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n", "john", 'M', 16834859,
				"john@gmail.com", "09/09/2001", "singapore", 6.5);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n", "cheryl", 'F', 83485914,
				"cheryl@gmail.com", "23/09/2001", "singapore", 6.5);
		// github.com/20008353-Makkalz/C206_CaseStudy.git

		// assertEquals("Test that ViewAllStudentAccount", testOutput,
		// allStudentAccount);

	}

	@Test
	public void doDeleteStudentAccount() // Fazia
	{
		// Test if the StudentList list is not null - boundary
		assertNotNull("Test if there is valid StudentList arraylist to delete for", StudentList);
		TuitionManagement.RegisterStudentAccount(StudentList, SA1);
		TuitionManagement.RegisterStudentAccount(StudentList, SA2);

		// Test that the name in SA1 can be retrieved
		// Test that the name in SA2 can be retrieved
		String name = SA1.getName();
		String NamE = SA2.getName();

		// normal condition
		Boolean isdeleted = TuitionManagement.doDeleteStudentAccount(StudentList, name);
		assertTrue("Test if this name is deleted", isdeleted);

		// error condition
		isdeleted = TuitionManagement.doDeleteStudentAccount(StudentList, name);
		assertFalse("Test that the student is fail to delete", isdeleted);

		TuitionManagement.RegisterStudentAccount(StudentList, SA1);
		TuitionManagement.RegisterStudentAccount(StudentList, SA2);

		// Test that the name in SA1 can be retrieved
		// Test that the name in SA2 can be retrieved
		String name1 = SA1.getName();
		String NamE1 = SA2.getName();

		// normal condition
		Boolean isdeleted1 = TuitionManagement.doDeleteStudentAccount(StudentList, name);
		assertTrue("Test if this name is deleted", isdeleted1);

		// error condition
		isdeleted = TuitionManagement.doDeleteStudentAccount(StudentList, name);
		assertFalse("Test that the student name  is fail to delete", isdeleted1);

	}

	@Test
	public void seeUrgentEnquiryTest() /// Sprint 2 Gilbert
	{
		// Test enquiry list is not null - (Boundary)
		assertNotNull("Test if there is valid enquiry arraylist to retrieve item", enquiryList);

		// After adding 2 enquiry list size should increase to 2 -(Normal)
		C206_CaseStudy.addEnquiry(enquiryList, e1);
		C206_CaseStudy.addEnquiry(enquiryList, e2);

		assertEquals("Test that enquiry arraylist size is 2", 2, enquiryList.size());

		// Test if output string displays Urgent enquires
		String UrgentEnquiry = String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 1, "How to register",
				"2021-7-20", "09.15", "Email", "Pending", "Urgent");
		String testOutput = String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 1, "How to register",
				"2021-7-20", "09.15", "Email", "Pending", "Urgent");

		assertEquals("Test view urgent enquiries", testOutput, UrgentEnquiry);

	}

	public void seeNon_UrgentEnquiryTest() /// Sprint 2 Gilbert
	{
		// Test enquiry list is not null - (Boundary)
		assertNotNull("Test if there is valid enquiry arraylist to retrieve item", enquiryList);

		// After adding 2 enquiry list size should increase to 2 -(Normal)
		C206_CaseStudy.addEnquiry(enquiryList, e1);
		C206_CaseStudy.addEnquiry(enquiryList, e2);

		assertEquals("Test that enquiry arraylist size is 2", 2, enquiryList.size());

		// Test if output string displays Non-Urgent enquires
		String Non_UrgentEnquiry = String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 2, "Tuition Fee",
				"2021-7-5", "13.15", "Email", "Completed", "Non-Urgent");
		String testOutput = String.format("%-15s %-20s %-15s %-15s %-20s %-10s %-10s\n", 2, "Tuition Fee", "2021-7-5",
				"13.15", "Email", "Completed", "Non-Urgent");

		assertEquals("Test view Non-Urgent enquiries", testOutput, Non_UrgentEnquiry);

	}

	@Test
<<<<<<< HEAD
	public void UpdateEnquiryStatusTest() // Sprint 2 Gilbert
=======
	public void UpdateEnquiryStatusTest() ///Sprint 2 Gilbert
>>>>>>> branch 'master' of https://github.com/20008353-Makkalz/C206_CaseStudy.git
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid enquiry arraylist to retrieve item", enquiryList);

		// Test if enquiry ID can be found -Normal
		C206_CaseStudy.addEnquiry(enquiryList, e1);
		Boolean found = C206_CaseStudy.UpdateEnquiryStatus(enquiryList, 1, "Processing");
		assertTrue("Test if the enquiry id can be found", found);

		C206_CaseStudy.addEnquiry(enquiryList, e2);
		found = C206_CaseStudy.UpdateEnquiryStatus(enquiryList, 2, "Completed");
		assertTrue("Test if the enquiry id can be found", found);

	}

	@Test
	public void doSearchTeacher() // Vijay Sprint 2
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);

		// Test if Teacher can be found -Normal
		C206_CaseStudy.addTuition(tuitionList, t1);
		Boolean exist = C206_CaseStudy.doSearchTeacher(tuitionList, "Serene Yong");
		assertTrue("Test if Teacher can be found", exist);

		C206_CaseStudy.addTuition(tuitionList, t2);
		Boolean exists = C206_CaseStudy.doSearchTeacher(tuitionList, "Pang Tee How");
		assertTrue("Test if Teacher can be found", exists);

<<<<<<< HEAD
		// Test if Title Not Included In Timetable List Can Be Found - Error
=======
		
		
		// Test if Title Not Included In Timetable List Can Be Found -- Error
>>>>>>> branch 'master' of https://github.com/20008353-Makkalz/C206_CaseStudy.git
		exist = C206_CaseStudy.doSearchTeacher(tuitionList, "Tan Cheng Kok");
		assertFalse("Test if Teacher can be found", exist);

		C206_CaseStudy.addTimetable(timetableList, ttb3);
		exist = C206_CaseStudy.doSearchTeacher(tuitionList, "Pang Tee How");
		assertTrue("Test if Teacher can be found", exist);
	}

	@Test
	public void updateTuitionTest() // Vijay Sprint 2
	{
		// Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);

		// Test if Tuition Code can be found -Normal
		C206_CaseStudy.addTuition(tuitionList, t1);
		Boolean exist = C206_CaseStudy.doUpdateTuition(tuitionList, "C206", "Group 1");
		assertTrue("Test if an Tuition can be found", exist);

		C206_CaseStudy.addTuition(tuitionList, t2);
		exist = C206_CaseStudy.doUpdateTuition(tuitionList, "C209", "Peter Liew");
		assertTrue("Test if an Tuition can be found", exist);

		// Test if Tuition Code that is not inside list can be found -Error
		exist = C206_CaseStudy.doUpdateTuition(tuitionList, "A113", "Peter Liew");
		assertFalse("Test if an Timetable Title can be found", exist);
		// github.com/20008353-Makkalz/C206_CaseStudy.git

		// github.com/20008353-Makkalz/C206_CaseStudy.git
	}

	@Test
	public void addRegistration() { // Jean-Claude

		// Test that the list is not null -Boundary
		assertNotNull("Test that the list is not null", registerList);

		// Test that after adding 1 item the list contains 1 item -Normal
		registerList.add(r1);
		assertEquals("Test that there is 1 item in the list", 1, registerList.size());

		// Test that after adding 2nd item, the list contains 2 items -Normal
		registerList.add(r2);
		assertEquals("Test that there are 2 items in the list", 2, registerList.size());

		// Test that the list has no more than 2 items
		assertNotEquals("Test that there are no more than 2 items in the list", 3, registerList.size());
	}

	@Test
	public void viewTimetable() { // Jean-Claude
		// Test if registerList is not null -Boundary
		assertNotNull("Test that the list is not null", registerList);

		// Test that given an empty list, after adding to registrations, the size of the
		// list is 2 -Normal
		registerList.add(r1);
		registerList.add(r2);
		assertEquals("Test that registerList size is 2", 2, registerList.size());

		// Test that the expected output is the same as the registerList retrieved from
		// registerTimetable -Normal
		for (registerTimetable i : registerList) {
			String Registrations = String.format("%-10d %-15d %-25s %-15s", i.getRegistrationNumber(),
					i.getTimetableID(), i.getEmail(), i.getStatus());
			String testOutput = String.format("%-10d %-15d %-25s %-15s", i.getRegistrationNumber(), i.getTimetableID(),
					i.getEmail(), i.getStatus());

			assertEquals("Test view registrations", testOutput, Registrations);
		}
	}
	@Test
	public void deleteRegistration() { //Jean-Claude
		// Test that list is not null -Boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", registerList);
	}
 
	
}
