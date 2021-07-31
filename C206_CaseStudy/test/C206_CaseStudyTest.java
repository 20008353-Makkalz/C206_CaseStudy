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
	
	private ArrayList<tuitionTimetable> timetableList; // YuanWei
	

	@Before
	public void setUp() throws Exception {
		//YuanWei
		ttb1 = new tuitionTimetable(1,50.00,LocalDateTime.parse("2020-01-10T09:00:00"), LocalDateTime.parse("2020-02-10T09:00:00"), "F2F");
		ttb2 = new tuitionTimetable(2,55.00,LocalDateTime.parse("2020-02-02T02:00:00"), LocalDateTime.parse("2020-03-20T03:00:00"), "F2F");
		ttb3 = new tuitionTimetable(3,45.00,LocalDateTime.parse("2020-05-31T04:50:43"), LocalDateTime.parse("2020-09-10T05:00:00"), "HBL");
		
		timetableList = new ArrayList<tuitionTimetable>();
	}

	@After
	public void tearDown() throws Exception {
		ttb1 = null;
		ttb2 = null;
		timetableList = null;
		
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
		
		C206_CaseStudy.addTimetable(timetableList,ttb1);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 1, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb1, timetableList.get(0));
		
		C206_CaseStudy.addTimetable(timetableList,ttb2);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 2, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb2, timetableList.get(1));
		
		C206_CaseStudy.addTimetable(timetableList,ttb3);
		assertEquals("Check that Tuition Timetable arraylist size is 1", 3, timetableList.size());
		assertSame("Check that Tuition Timetable is added", ttb3, timetableList.get(2));
		
	}
	
	@Test
	public void retrieveTimetableTest()
	{
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);
		
		String allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		String testOutput ="";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allTuitionTimetable);
		
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		assertEquals("Test that Tuition Timetable arraylist size is 3", 3, timetableList.size());
		
		
		allTuitionTimetable = C206_CaseStudy.retrieveTimetable(timetableList);
		testOutput = String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "1",50.00,"10 Jan 2020 09:00 am","10 Feb 2020 09:00 am","F2F");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "2",55.00,"02 Feb 2020 02:00 am","20 Mar 2020 03:00 am","F2F");
		testOutput += String.format("%-10s $%-10.2f %-25s %-25s %-10s\n", "3",45.00,"31 May 2020 04:50 am","10 Sep 2020 05:00 am","HBL");

		
		assertEquals("Test viewAllTuitionTimetable", testOutput, allTuitionTimetable);
		
	}
	
	@Test 
	public void doDeleteTimetableTest()
	{
		
		assertNotNull("Test if there is valid Tuition Timetable arraylist to retrieve item", timetableList);
		
		
		C206_CaseStudy.addTimetable(timetableList, ttb1);
		Boolean ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertTrue("Test if an Timetable is ok to be deleted?", ok);
		
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 1);
		assertFalse("Test that the same Timetable is NOT ok to be deleted again?",ok);
		
		C206_CaseStudy.addTimetable(timetableList, ttb2);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 2);
		assertTrue("Test that un-available item is ok to loan?", ok);
		
		C206_CaseStudy.addTimetable(timetableList, ttb3);
		ok = C206_CaseStudy.doDeleteTimetable(timetableList, 3);
		assertTrue("Test that un-available item is ok to loan?", ok);
		
		
		
		
		
		
		
		
		
		
	}

}
