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
	
	@Test
	public void RegisterStudentAccountTest() // fazia
	{
		//Student list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Student arraylist to add to", StudentList);
		
		//Given an empty list, after adding 1 StudentAccount, the size of the list become 1 - normal
		//The StudentAccount just added is as same as the first StudentAccount 
		TuitionManagementSystem.RegisterStudentAccount(StudentList, SA1);
		assertEquals("Check that StudentAccount arraylist size is 1", 1, StudentList.size());
		assertSame("Check that New Student is added", SA1, StudentList.get(0));
		
		//Add another StudentAccount. Test the size of the StudentList list is 2? - normal
		//The StudentAccount just added is as same as the second StudentAccount
		TuitionManagementSystem.RegisterStudentAccount(StudentList, SA2);
		assertEquals("Check that StudentAccount arraylist size is 2", 2, StudentList.size());
		assertSame("Check that the New Student is added", SA2, StudentList.get(1));
		
	}
	
	@Test
	public void RetrieveAllStudentAccountTest() //fazia
	{
		//Test if StudentAccount list is not null but empty - boundary 
		assertNotNull("Test if there is valid StudentList arraylist to retrieve from, StudentList");
		
		//Test if the list of students retrieved from TuitionManagementSystem is empty - boundary
		String allStudentAccount = TuitionManagementSystem.RetrieveAllStudentAccount(StudentList);
		String testOutput = "";
		assertEquals("Check ViewStudentAccount", testOutput, allStudentAccount);
		
		//Given an empty list, after adding 2 students,test if the size of the list is 2 - normal
		TuitionManagementSystem.RegisterStudentAccount(StudentList,SA1);
		TuitionManagementSystem.RegisterStudentAccount(StudentList, SA2);
		assertEquals("Test that StudentAccount arraylist size is 2", 2, StudentList.size());
		
		//Test if the expected output same as the list of StudentList retrieved from the TuitionManagementSystem
		allStudentAccount = TuitionManagementSystem.RetrieveAllStudentAccount(StudentList);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n", "john","M",16834859, "john@gmail.com", "09/09/2001","singapore", 6.5);
		testOutput = String.format("%-10s %-10s %-10s %-20s %-20s %-20s %-20s\n","cheryl","F",83485914,"cheryl@gmail.com", "23/09/2001","singapore", 6.5 );
		
		assertEquals("Test that ViewAllStudentAccount", testOutput, allStudentAccount);
		
	}
	
	@Test
	public void doDeleteStudentAccount() // Fazia 
	{
		//Test if the StudentList list is not null - boundary
		assertNotNull("Test if there is valid StudentList arraylist to delete for", StudentList);
	
	

}
}
