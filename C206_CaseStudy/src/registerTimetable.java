import java.time.LocalDateTime;
/**
 
* I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Jean-Claude Ross, Aug 5, 2021 7:54:32 PM
 */

/**
 * @author Jean-Claude Ross
 *
 */
public class registerTimetable { // Jean-Claude
	private int registrationNumber;
	private int timetableID;
	private String email;
	private String status;
	private LocalDateTime regDate;
	private int registrationID;
	
	public registerTimetable(int registrationNumber, int timetableID, String email) {
		this.registrationNumber = registrationNumber;
		this.timetableID = timetableID;
		this.email = email;
		this.status = "Pending";
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public int getTimetableID() {
		return timetableID;
	}

	
	public String getEmail() {
		return email;
	}

	
	public String getStatus() {
		return status;
	}

	
	public LocalDateTime getRegDate() {
		return regDate;
	}

	
	public int getRegistrationID() {
		return registrationID;
	}

	
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	
	public void setTimetableID(int timetableID) {
		this.timetableID = timetableID;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	
	public void setRegistrationID(int registrationID) {
		this.registrationID = registrationID;
	}
}
