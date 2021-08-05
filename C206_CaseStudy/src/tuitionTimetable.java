import java.time.LocalDateTime;

/**
 * 
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism
 *
 * Toh Yuan Wei 20024377, 30 Jul 2021 3:37:38 pm
 */
public class tuitionTimetable {
	
	private int tuitionID;
	private double price;
	private LocalDateTime startDate;
	private LocalDateTime endTime;
	private String mode;
	private String title;

	
	public tuitionTimetable(int tuitionID, double price, LocalDateTime startDate, LocalDateTime endTime, String mode, String title) {
		this.tuitionID = tuitionID;
		this.price = price;
		this.startDate = startDate;
		this.endTime = endTime;
		this.mode = mode;
		this.title = title;
	}


	/**
	 * @return the tuitionID
	 */
	public int getTuitionID() {
		return tuitionID;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @return the startDate
	 */
	public LocalDateTime getStartDate() {
		return startDate;
	}


	/**
	 * @return the endTime
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}


	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	
	
	




}
