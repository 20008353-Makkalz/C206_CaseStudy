import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Yuan Wei
	private tuitionTimetable ttb1;
	private tuitionTimetable ttb2;
	private tuitionTimetable ttb3;
	
	
	private Enquiry e1; //Gilbert
	private Enquiry e2; //Gilbert
	
	
	
	private ArrayList<tuitionTimetable> timetableList; // YuanWei
	private ArrayList<Enquiry> enquiryList; //Gilbert
	
	

	@Before
	public void setUp() throws Exception {
		//YuanWei
		ttb1 = new tuitionTimetable(1,50.00,LocalDateTime.parse("2020-01-10T09:00:00"), LocalDateTime.parse("2020-02-10T09:00:00"), "F2F");
		ttb2 = new tuitionTimetable(2,55.00,LocalDateTime.parse("2020-02-02T02:00:00"), LocalDateTime.parse("2020-03-20T03:00:00"), "F2F");
		ttb3 = new tuitionTimetable(3,45.00,LocalDateTime.parse("2020-05-31T04:50:43"), LocalDateTime.parse("2020-09-10T05:00:00"), "HBL");
		
		timetableList = new ArrayList<tuitionTimetable>();
		
		//Gilbert
		e1 = (new Enquiry(1,"How to register", "2021-7-20", "09.15", "Email","Pending"));
		e2 = (new Enquiry(2,"Tuition Fee", "2021-7-5", "13.15", "Email","Completed"));
		
		enquiryList = new ArrayList<Enquiry>();
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		//YuanWei
		ttb1 = null;
		ttb2 = null;
		timetableList = null;
		//gilbert
		e1 = null;
		e2 = null;
		enquiryList = null;
		//Fazia
		SA1 = null;
		SA2 = null;
		StudentList = null;
		
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void addTuitiontimetableTest()
	{
		//YuanWei
		
		//Make sure Timetable List is not null, so I can add a new Item - Boundary
		assertNotNull("Check if there is valid Tuition Timetable arraylist to add to",timetableList);
		
		//Make sure Timetable List has increased to size 1 after adding 1 item.
		//Make sure item added is the same as the first item of list
		C206_CaseStudy.addTimetable(timetableList,ttb1);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 1, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb1, timetableList.get(0));
		
		//Adding another item. Test the size of list = 2 -Normal
		C206_CaseStudy.addTimetable(timetableList,ttb2);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 2, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb2, timetableList.get(1));
		
		//Add 3rd item. Test size of list = 3 -Boundary
		C206_CaseStudy.addTimetable(timetableList,ttb3);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 3, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb3, timetableList.get(2));
		
		//Test size of list is not bigger than 3 -Error
		assertNotEquals("Check that tuition timetable list size is not bigger than 3",4,timetableList.size());
		
	}
	
	@Test
	public void retrieveTimetableTest() //YuanWei
	{
		//Test if list is not null - Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);
		
		//Test if Timetable List is not empty -Boundary
		String allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		String testOutput ="";
		assertEquals("Check ViewTimetable", testOutput, allTuitionTimetable);
		
		//After adding 3 items list size should increase to 3 -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		assertEquals("Test that Tuition Timetable arraylist size is 3", 3, timetableList.size());
		
		//Test if output string is same as timetable list 
		allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		testOutput = String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "1",50.00,"10 Jan 2020 09:00 am","10 Feb 2020 09:00 am","F2F");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "2",55.00,"02 Feb 2020 02:00 am","20 Mar 2020 03:00 am","F2F");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "3",45.00,"31 May 2020 04:50 am","10 Sep 2020 05:00 am","HBL");

		
		assertEquals("Test viewAllTuitionTimetable", testOutput, allTuitionTimetable);
		
	}
	
	@Test 
	public void doDeleteTimetableTest() //YuanWei
	{
		//Make sure list is not null -Boundary
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);
		
		//Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);
		
		//Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?",ok);
		
		//Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 2);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);
		
		//Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 2);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?",ok);
		
		//Test if Timetable ID can be removed -Normal
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 3);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);
		
		//Test if same Timetable ID can be removed again -Error
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 3);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?",ok);
		
		//Test if Timetable list size has dropped to 0 after removing the 3 test items -Normal
		assertEquals("Check that tuition timetable list is not bigger than 0",0,timetableList.size());
	}
	@Test
	
	public void viewEnquiryTest()//Gilbert
	{
		//Test if list is not null - Boundary
				assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", enquiryList);
				
				//Test if Timetable List is not empty -Boundary
				String allenquiry = C206_CaseStudy.viewEnquiry(enquiryList);
				String testOutput ="";
				assertEquals("Check ViewTimetable", testOutput, allenquiry);
				
				//After adding 3 items list size should increase to 2 -Normal
				C206_CaseStudy.viewEnquiry(enquiryList);
				C206_CaseStudy.viewEnquiry(enquiryList);
				
				assertEquals("Test that enquiry arraylist size is 2", 2, enquiryList.size());
				
				//Test if output string is same as enquiry list 
				allenquiry = C206_CaseStudy.viewEnquiry(enquiryList);
				testOutput = String.format("");
				testOutput = String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n", 1,"How to register", "2021-7-20", "09.15", "Email","Pending");
				testOutput += String.format("%-15s %-20s %-15s %-15s %-20s %-10s\n",2,"Tuition Fee", "2021-7-5", "13.15", "Email","Completed");
				
				assertEquals("Test viewEnquiry", testOutput, allenquiry);
		
	}
	
	
	public void addEnquiryTest()//Gilbert
	{
		// Item list is not null, so that can add a new item - boundary
				assertNotNull("Check if there is valid Camcorder arraylist to add to", enquiryList);
				//Given an empty list, after adding 1 item, the size of the list is 1 - normal
				//The item just added is as same as the first item of the list
				C206_CaseStudy.addEnquiry(enquiryList, e1);
				assertEquals("Check that enquiry arraylist size is 1", 1, enquiryList.size());
				assertSame("Check that enquiry is added",e1, enquiryList.get(0));
				
				//Add another item. test The size of the list is 2? -normal
				//The item just added is as same as the second item of the list
				C206_CaseStudy.addEnquiry(enquiryList, e2);
				assertEquals("Check that enquiry arraylist size is 2", 2, enquiryList.size());
				assertSame("Check that enquiry is added", e2, enquiryList.get(1));
	}
		
	public void deleteEnquiry()//Gilbertng
	{
		//Make sure list is not null -Boundary
				assertNotNull("Test if there is valid enquiry arraylist to retrieve item", enquiryList);
				
				//Test if enquiry ID can be removed -Normal
				C206_CaseStudy.addEnquiry(enquiryList, e1);
				Boolean check = C206_CaseStudy.deleteEnquiry(enquiryList, 1);
				assertTrue("Test if an enquiry is ok to be deleted?", check);
				
				//Test if same enquiry ID can be removed again -Error
				check = C206_CaseStudy.deleteEnquiry(enquiryList, 1);
				assertFalse("Test that the same enquiry is NOT ok to be deleted again?",check);
				
				//Test if enquiry ID can be removed -Normal
				C206_CaseStudy.addEnquiry(enquiryList, e2);
				check = C206_CaseStudy.deleteEnquiry(enquiryList, 2);
				assertTrue("Test if an enquiry is ok to be deleted?", check);
				
				//Test if same enquiry ID can be removed again -Error
				check = C206_CaseStudy.deleteEnquiry(enquiryList, 2);
				assertFalse("Test that the same enquiry is NOT ok to be deleted again?",check);
				
				//Test if enquiry list size has dropped to 0 after removing the 3 test items
				assertEquals("Check that enquiry list is not bigger than 0",0,enquiryList.size());
	}
}