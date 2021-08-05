import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Fazia Fazal
 * Student ID: 19028056
 * Class: W64C
 * Date/Time created: Thursday 05-08-2021 06:33
 */

/**
 * @author 19028056
 *
 */
public class TuitionManagementTest {
	
	private StudentAccount SA1; //Fazia
	private StudentAccount SA2; //Fazia
	
	private ArrayList<StudentAccount> StudentList; //Fazia
	
	public TuitionManagementTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
	SA1 = new StudentAccount("john", "M",16834859, "john@gmail.com", "09/09/2001","singapore", 6.5);
	SA2 = new StudentAccount("cheryl","F",83485914,"cheryl@gmail.com","23/09/2001","singapore", 6.5);
	
	StudentList = new ArrayList<StudentAccount>();
}
	@After
	public void tearDown() throws Exception {
		
		//Fazia
		SA1 = null;
		SA2 = null;
		StudentList = null;
		
	}
	