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
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void addTuitiontimetable()
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
		
	}

}
