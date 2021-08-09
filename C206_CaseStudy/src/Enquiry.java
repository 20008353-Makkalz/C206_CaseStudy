import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Gilbert Ng 20045485, 30 Jul 2021 11:52:44 pm
 */

public class Enquiry {
	
	private int enquiryID;
	private String title;
	private String date;
	private String time;
	private String enquiryMethod;
	private String status;
	private String statusType;

	public Enquiry(int enquiryID, String title, String date, String time, String enquiryMethod, String status, String statusType) {
		
		this.enquiryID = enquiryID;
		this.title = title;
		this.date = date;
		this.time = time;
		this.enquiryMethod = enquiryMethod;
		this.status = status;
		this.statusType = statusType;
	}

	public int getEnquiryID() {
		return enquiryID;
	}

	
	public String getTitle() {
		return title;
	}

	
	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getEnquiryMethod() {
		return enquiryMethod;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusType()
	{
		return statusType;
		
	}

	
	
	
	
	
	
}
